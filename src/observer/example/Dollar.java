package observer.example;

import java.util.ArrayList;
import java.util.List;

public class Dollar implements ObservableBroker {

    private List<ObserverBroker> brokers = new ArrayList<>();
    private double currentRelationAMD = 0;


    @Override
    public void register(ObserverBroker observerBroker) {
        brokers.add(observerBroker);
    }

    @Override
    public void unRegister(ObserverBroker observerBroker) {
        brokers.remove(observerBroker);
    }

    @Override
    public void notifyObservers() {
        brokers.forEach(observerBroker -> observerBroker.update(currentRelationAMD));
    }

    public void updateCurrentValue(double newValue) {
        System.out.println("New value for dollar is " + newValue);
        currentRelationAMD = newValue;
        notifyObservers();
    }


}

package observer.example;

public interface ObservableBroker {

    void register(ObserverBroker observerBroker);

    void unRegister(ObserverBroker observerBroker);

    void notifyObservers();
}

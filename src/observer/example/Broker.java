package observer.example;

public class Broker implements ObserverBroker {

    private double minHappyValue;

    public Broker(double minHappyValue) {
        this.minHappyValue = minHappyValue;
    }


    @Override
    public void update(double newValue) {
        if (newValue > minHappyValue)
            System.out.println("Broker is happy");
        else
            System.out.println("Broker is SAD");
    }

}

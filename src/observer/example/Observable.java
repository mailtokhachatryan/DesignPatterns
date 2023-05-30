package observer.example;

public interface Observable {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObservers();

}

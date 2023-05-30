package observer.lesson.broker;

public interface Observable {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyBrokers();

}

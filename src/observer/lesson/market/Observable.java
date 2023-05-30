package observer.lesson.market;

public interface Observable {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifySubscribers();
}

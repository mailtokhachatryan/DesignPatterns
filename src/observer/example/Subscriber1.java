package observer.example;

public class Subscriber1 implements Observer {


    @Override
    public void update() {
        System.out.println("Subscriber1 is updated");
    }
}

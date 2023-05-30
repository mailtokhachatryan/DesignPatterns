package observer.example;

public class Subscriber2 implements Observer {


    @Override
    public void update() {
        System.out.println("Subscriber2 is updated");
    }
}

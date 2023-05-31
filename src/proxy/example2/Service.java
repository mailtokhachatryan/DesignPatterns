package proxy.example2;

public class Service {

    public void doingSomething(){
        System.out.println("doingSomething");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void doingSomething1(){
        System.out.println("doingSomething2");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

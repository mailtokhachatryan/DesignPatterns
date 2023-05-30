package observer.lesson.broker;

public class Broker implements Observer {

    private double happyCourse;
    private String name;

    public Broker(double happyCourse, String name) {
        this.happyCourse = happyCourse;
        this.name = name;
    }

    @Override
    public void update(double newValue) {

        if (newValue > happyCourse)
            System.out.printf("Broker %s is HAPPY :) \n", name);
        else
            System.out.printf("Broker %s is SAD :( \n", name);
    }
}

package observer.lesson.broker;

public class Main {

    public static void main(String[] args) {
        Broker broker1 = new Broker(395.5, "broker1");
        Broker broker2 = new Broker(450.0, "broker2");
        Broker broker3 = new Broker(410.0, "broker3");


        DollarCurrentCourse dollarCurrentCourse = new DollarCurrentCourse(450.0);

        dollarCurrentCourse.register(broker1);
        dollarCurrentCourse.register(broker2);
        dollarCurrentCourse.register(broker3);


//        dollarCurrentCourse.changeCurrentCourse(402.3);
//        dollarCurrentCourse.changeCurrentCourse(460.3);
        dollarCurrentCourse.changeCurrentCourse(395.3);

    }
}

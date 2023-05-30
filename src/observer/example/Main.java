package observer.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Subject interestedSubject = new Subject();
//
//        Subscriber1 subscriber1 = new Subscriber1();
//        Subscriber2 subscriber2 = new Subscriber2();
//        Subscriber1 subscriber3 = new Subscriber1();
//        Subscriber2 subscriber4 = new Subscriber2();
//        Subscriber1 subscriber5 = new Subscriber1();
//
//        interestedSubject.register(subscriber1);
//        interestedSubject.register(subscriber2);
//        interestedSubject.register(subscriber3);
//        interestedSubject.register(subscriber4);
//        interestedSubject.register(subscriber5);
//
//        interestedSubject.notifyObservers();
//
//        interestedSubject.unRegister(subscriber1);
//        interestedSubject.unRegister(subscriber2);
//
//        interestedSubject.notifyObservers();

        Dollar dollar = new Dollar();

        Broker broker1 = new Broker(550.0D);
        Broker broker2 = new Broker(480.D);
        Broker broker3 = new Broker(456.D);

        dollar.register(broker1);
        dollar.register(broker2);
        dollar.register(broker3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input new value for USD/AMD: ");

        double input = scanner.nextDouble();

        dollar.updateCurrentValue(input);

    }

}


package proxy.example2;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ServiceProxy extends Service {

    @Override
    public void doingSomething() {
        Instant start = Instant.now();
        System.out.println("Method started");
        super.doingSomething();
        System.out.println("Method done");
        Instant end = Instant.now();

        System.out.println("Work done in " + start.until(end, ChronoUnit.MILLIS) + " milliseconds");
    }
}

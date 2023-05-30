package strategy.lesson;

public class IdramPaymentStrategy implements PaymentStrategy {

    private String phone;

    public IdramPaymentStrategy(String phone) {
        this.phone = phone;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid with Idram %s : %d%n", phone, amount);
    }
}

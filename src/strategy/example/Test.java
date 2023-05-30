package strategy.example;

public class Test {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("Apple", 10);
        Item item2 = new Item("Phone", 40);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        PaymentStrategy paypalStrategy = new PaypalStrategy("test@gmail.com", "pass");
        PaymentStrategy creditCardStrategy = new CreditCardStrategy("Aghasi Khachatryan", "456 8789 8798 2565", "321", "07/27");

        shoppingCart.pay(paypalStrategy);

        shoppingCart.pay(creditCardStrategy);

    }


}

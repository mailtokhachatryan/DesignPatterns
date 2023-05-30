package strategy.lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CardPaymentStrategy cardPaymentStrategy = new CardPaymentStrategy(
                "Aghasi Khachatryan",
                "4569874512368563",
                123,
                "07/27");

        IdramPaymentStrategy idramPaymentStrategy = new IdramPaymentStrategy("+37494657895");




        Product blender = new Product("Blender", 57000);
        Product phone = new Product("Iphone", 430000);

        CartService cartService = new CartService();

        cartService.add(blender);
        cartService.add(phone);



        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();

        switch (type) {
            case "CARD" -> cartService.pay(cardPaymentStrategy);
            case "IDRAM" -> cartService.pay(idramPaymentStrategy);
        }


    }


}

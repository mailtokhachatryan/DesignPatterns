public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer("Gamer1", 2000, 250);
        Gamer gamer2 = new Gamer("Gamer2", 1500, 500);

        new GameService(gamer, gamer2);

    }

}

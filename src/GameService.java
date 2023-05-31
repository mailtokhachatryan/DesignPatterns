public class GameService {

    private Gamer gamer1;
    private Gamer gamer2;

    public GameService(Gamer gamer1, Gamer gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
        gamer1Attacking();
    }

    public void gamer1Attacking() {
        int totalXp = gamer1.getXp() - gamer2.getPower();
        gamer1.setXp(totalXp);
        if (totalXp <= 0) {
            System.out.println(gamer2.getName() + " Won");
            return;
        }
        System.out.println("after gamer2 attack xp is " + totalXp);
        gamer2Attacking();
    }

    public void gamer2Attacking() {
        int totalXp = gamer2.getXp() - gamer1.getPower();
        gamer2.setXp(totalXp);
        if (totalXp <= 0) {
            System.out.println(gamer1.getName() + " Won");
            return;
        }
        System.out.println("after gamer1 attack xp is " + totalXp);
        gamer1Attacking();
    }


}

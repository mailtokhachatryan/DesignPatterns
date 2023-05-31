public class Gamer {

    private String name;
    private int xp;
    private int power;

    public Gamer(String name, int xp, int power) {
        this.name = name;
        this.xp = xp;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
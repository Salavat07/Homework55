import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int superPower;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperpower() {
        return superPower;
    }

    public void setSuperpower(int superpower) {
        this.superPower = superpower;
    }

    public void changeBossDefense() {
        Random r = new Random();
        int randomNumber = r.nextInt(50) + 1;
        superPower = randomNumber;
    }
}
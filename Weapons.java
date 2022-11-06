import java.util.Random;

public class Weapons extends Items {
    private int damage;

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    private int reach;
    public  int getDamage() {
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage; }

    public static Integer damageCalc(int maxDamage, int minDamage){
        Random randomDamage = new Random();
        return randomDamage.nextInt(maxDamage-minDamage) + minDamage;
    }

    public Weapons(String name, int value, int weight,int maxDamage,int minDamage,int reach) {
        super(name, value, weight);
        this.damage=damageCalc( maxDamage,minDamage);
        this.reach=reach;
    }



}

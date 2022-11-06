import java.util.Random;

public class Monsters extends Characters {
    private Weapons mainWeapon;
    private Armour mainArmour;
    private int range;
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


    public Weapons getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(Weapons mainWeapon) {
        this.mainWeapon = mainWeapon;
    }

    public Armour getMainArmour() {
        return mainArmour;
    }

    public void setMainArmour(Armour mainArmour) {
        this.mainArmour = mainArmour;
    }



//yeni
    public void weaponChange(Weapons w){
        setMainWeapon(w);
    }
    public void armourChange(Armour a){
        setMainArmour(a);
    }

    public void displayMonster(){
        System.out.println(getCharName()+":");
        System.out.println("Health: "+getHealth());
        System.out.println("Armor: "+getMainArmour().getName()+" ("+getMainArmour().getProtection()+")");
        System.out.println("Weapon: "+getMainWeapon().getName()+" ( damage:"+getMainWeapon().getDamage()+" range: "+getMainWeapon().getReach()+")");
    }


    public Monsters(String charName, int maxHealth, int minHealth, String charSex, int inventoryCapacity,int range,Weapons mainWeapon,Armour mainArmour, int experience) {
        super(charName, maxHealth, minHealth, charSex, inventoryCapacity,experience);
        this.setHealth(this.getHealth());
        this.range=range;
        this.mainArmour= mainArmour;
        this.mainWeapon= mainWeapon;
    }
}

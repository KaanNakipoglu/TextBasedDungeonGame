import java.util.ArrayList;
import java.util.Random;
public class Characters implements commands  {

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int experience;
    public ArrayList<Items> getItemsinventory() {
        return Itemsinventory;
    }

    public void setItemsinventory(ArrayList<Items> itemsinventory) {
        Itemsinventory = itemsinventory;
    }

    public ArrayList<Weapons> getWeaponsinventory() {
        return Weaponsinventory;
    }

    public void setWeaponsinventory(ArrayList<Weapons> weaponsinventory) {
        Weaponsinventory = weaponsinventory;
    }

    public ArrayList<Armour> getArmoursinventory() {
        return Armoursinventory;
    }

    public void setArmoursinventory(ArrayList<Armour> armoursinventory) {
        Armoursinventory = armoursinventory;
    }

    //Weapons inventory[] = new Weapons[10000];
    //inventory değiştirme
    ArrayList<Items> Itemsinventory = new ArrayList<>();
    ArrayList<Weapons> Weaponsinventory = new ArrayList<>();
    ArrayList<Armour> Armoursinventory = new ArrayList<>();
    private int health;
    private String charName;


    public int getInventoryCapacity() {
        return inventoryCapacity;
    }

    public void setInventoryCapacity(int inventoryCapacity) {
        this.inventoryCapacity = inventoryCapacity;
    }

    private int inventoryCapacity;


    public String getCharSex() {
        return charSex;
    }

    public void setCharSex(String charSex) {
        this.charSex = charSex;
    }

    private String charSex;

   // public void display() {
     //   System.out.println(inventory.toString());
   // }

    public  int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


    public Characters() {
        this.health = 0;
        this.charName = null;
        this.charSex = null; }
    public static Integer healthCalc(int maxHealth, int minHealth){
        Random randomHealth = new Random();
        return randomHealth.nextInt(maxHealth-minHealth) + minHealth;
    }

    public Characters(String charName,int maxHealth,int minHealth, String charSex, int inventoryCapacity,int experience) {
        this.health =healthCalc(maxHealth, minHealth) ;
        this.charName = charName;
        this.charSex = charSex;
        this.inventoryCapacity=inventoryCapacity;
        this.experience= experience;
    }

//yeni heroyu bşata sabitlicez
   public void Attack(Hero a, Monsters c){ if(a.getHealth()>0){
       if((a.getMainWeapon().getDamage()-c.getMainArmour().getProtection())<=0){
       c.setHealth(c.getHealth());}
       else{
           c.setHealth(c.getHealth()-(a.getMainWeapon().getDamage()-c.getMainArmour().getProtection()));}
   }

       if(c.getHealth()>0){
           if((a.getMainWeapon().getDamage()-c.getMainArmour().getProtection())<=0){
               a.setHealth(a.getHealth());
           }
           else{
           a.setHealth(a.getHealth()-(c.getMainWeapon().getDamage()-a.getMainArmour().getProtection()));}
       }
       if(c.getHealth()<=0){c.setHealth(0);}
       if(a.getHealth()<=0){a.setHealth(0);}
       System.out.println("Your Health is: " +a.getHealth());
       System.out.println("Monster's Health is: " +c.getHealth());
    }
    public void displayInventory(Characters f){
        for(int i =0 ; i<f.Weaponsinventory.size(); i++){
            System.out.println("Your Weapons:" + " " + f.Weaponsinventory.get(i).getName());
        }
        for(int i =0 ; i<f.Armoursinventory.size(); i++){
            System.out.println("Your Armours:" + " " + f.Armoursinventory.get(i).getName());
        }
        for(int i =0 ; i<f.Itemsinventory.size(); i++){
            System.out.println("Your Items:" + " " + f.Itemsinventory.get(i).getName());

        }
    }
    public void Monsterdie(Hero a,Monsters f,RoomsFinal r){
        for(int i=0 ; i<f.Weaponsinventory.size(); i++){
            r.getItemsList().add(f.Weaponsinventory.get(i)); }
        for(int i=0 ; i<f.Armoursinventory.size(); i++){
            r.getItemsList().add(f.Armoursinventory.get(i));}
        for(int i=0 ; i<f.Itemsinventory.size(); i++){
            r.getItemsList().add(f.Itemsinventory.get(i)); }
        a.defeatedMonsterList.add(f);
    r.getMonsterList().remove(f);
    f.Weaponsinventory.clear();
        f.Armoursinventory.clear();
        f.Itemsinventory.clear();
    }







    //@Override
    //public String toString() {
    //    return Items.getName();
   // }
}






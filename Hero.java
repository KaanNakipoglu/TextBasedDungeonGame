import java.util.ArrayList;

public class Hero extends Characters  {
     ArrayList<Monsters> defeatedMonsterList = new ArrayList<>();
    ArrayList<TownPeople> rescuedTownsList =new ArrayList<>();
    private  int currentLevel;
    private  int isAlive;
    private Weapons mainWeapon;
    private Armour mainArmour;
    private int inventoryLimit;
    private int currentRoom;

    //yeni
    //oda değişikliğinde ordaki arrayleri çağır
    public void roomChange(int f){
        if(f==(getCurrentRoom()+1) || f==(getCurrentRoom()-1) ){
            setCurrentRoom(f); }
        else System.out.println("Unvalid Move");
    }
    public void levelChange(int f){
        if(f==(getCurrentLevel()+1) || f==(getCurrentLevel()-1) ){
            setCurrentLevel(f); }
        else System.out.println("Unvalid Move");
    }
    public void weaponChange(Weapons w){
        setMainWeapon(w);
    }

    public void armourChange(Armour a){
        setMainArmour(a);
    }

    public void pickUp(Items i){
        System.out.println();
        if(getInventoryCapacity()<inventoryLimit){
            if (i instanceof Armour) {
                getArmoursinventory().add((Armour) i);
            } else if (i instanceof Weapons) {
                getWeaponsinventory().add((Weapons) i);
            } else {
                Itemsinventory.add(i);
            }
            setInventoryCapacity(getInventoryCapacity()+i.getWeight());
        }
        else System.out.println("You are carrying to much weight");
    }

    public void dropItem(Items i){
        System.out.println();
        if (i instanceof Armour) {
            getArmoursinventory().remove((Armour) i);
        } else if (i instanceof Weapons) {
            getWeaponsinventory().remove((Weapons) i);
        } else {
            Itemsinventory.remove(i);
        }
        setInventoryCapacity(getInventoryCapacity()-i.getWeight());
    }

    public void approach(Monsters t){ t.setRange(t.getRange()-20);
        if(t.getRange()<=0){t.setRange(0);}
        System.out.println("Monster is" + " " + t.getRange() + " " + "meters away!");}

    public void view(){}

    public Hero(String charName, int maxHealth, int minHealth, String charSex, int inventoryCapacity,int inventoryLimit,int currentLevel,int currentCorridor, int currentRoom,Weapons mainWeapon,Armour mainArmour,int isAlive, int experience) {
        super(charName, maxHealth, minHealth, charSex, inventoryCapacity, experience);
        this.setHealth(this.getHealth());
        this.currentRoom=currentRoom;
        this.mainArmour= mainArmour;
        this.mainWeapon= mainWeapon;
        this.inventoryLimit=inventoryLimit;
        this.currentCorridor=currentCorridor;
        this.currentLevel= currentLevel;
        this.isAlive= isAlive;
    }

    public void rescueTownperson(RoomsFinal r){
        if(r.getMonsterList().size()==0){
            for(int t=0; t<r.getTownpeopleList().size(); t++){
                rescuedTownsList.add(r.getTownpeopleList().get(t));
                setHealth(getHealth()+rescuedTownsList.get(t).getHealValue());
            }
            r.getTownpeopleList().clear();
            System.out.println("You have rescued " + rescuedTownsList.size() + " and your health is changed to " + getHealth());
        }
        else{}
    }

    public int calculateExp(){
        for(int i=0;i<defeatedMonsterList.size();i++){
            setExperience(getExperience()+defeatedMonsterList.get(i).getExperience());
        }
        for(int i = 0; i< rescuedTownsList.size(); i++){
            setExperience(getExperience()+ rescuedTownsList.get(i).getExperience());
        }
        for(int i=0;i<getArmoursinventory().size();i++){
            setExperience(getExperience()+getArmoursinventory().get(i).getValue());
        }
        for(int i=0;i<getWeaponsinventory().size();i++){
            setExperience(getExperience()+getWeaponsinventory().get(i).getValue());
        }
        for(int i=0;i<getItemsinventory().size();i++){
            setExperience(getExperience()+getItemsinventory().get(i).getValue());
        }
        return getExperience();
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(int isAlive) {
        this.isAlive = isAlive;
    }

    public ArrayList<Monsters> getDefeatedMonsterList() {
        return defeatedMonsterList;
    }

    public void setDefeatedMonsterList(ArrayList<Monsters> defeatedMonsterList) {
        this.defeatedMonsterList = defeatedMonsterList;
    }


    ArrayList<TownPeople> rescuedTownspeopleList = new ArrayList<>();
    public int getCurrentCorridor() {
        return currentCorridor;
    }

    public void setCurrentCorridor(int currentCorridor) {
        this.currentCorridor = currentCorridor;
    }

    private int currentCorridor;

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getInventoryLimit() {
        return inventoryLimit;
    }

    public void setInventoryLimit(int inventoryLimit) {
        this.inventoryLimit = inventoryLimit;
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


}
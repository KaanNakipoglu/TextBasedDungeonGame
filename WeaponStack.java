
import java.util.ArrayList;
public class WeaponStack {
    ArrayList<Items> WeaponsList = new ArrayList<>();

    public Weapons BattleAxe(){
        Weapons BattleAxe = new Weapons("BattleAxe", 5,6,15,8,4);
        WeaponsList.add(BattleAxe);
        return BattleAxe;
    }
    public Weapons Club(){
        Weapons Club = new Weapons("Club", 2,2,8,5,2);
        WeaponsList.add(Club);
        return Club;
    }
    public Weapons  Dagger(){
        Weapons Dagger= new Weapons("Dagger", 6,2,10,7,2);
        WeaponsList.add(Dagger);
        return Dagger;
    }
    public Weapons Halberd(){
        Weapons Halberd = new Weapons("Halberd", 6,10,12,10,8);
        WeaponsList.add(Halberd);
        return Halberd;
    }
    public Weapons Lance(){
        Weapons Lance = new Weapons("Lance", 1,5,6,3,7);
        WeaponsList.add(Lance);
        return Lance;
    }
    public Weapons Pike(){
        Weapons Pike = new Weapons("Pike", 3,2,6,4,6);
        WeaponsList.add(Pike);
        return Pike;
    }
    public Weapons Querterstaff(){
        Weapons Querterstaff = new Weapons("Querterstaff", 3,7,5,3,5);
        WeaponsList.add(Querterstaff);
        return Querterstaff;
    }
    public Weapons Sabre(){
        Weapons Sabre = new Weapons("Sabre", 7,11,14,12,5);
        WeaponsList.add(Sabre);
        return Sabre;
    }
    public Weapons Sword(){
        Weapons Sword = new Weapons("Sword", 8,12,16,12,6);
        WeaponsList.add(Sword);
        return Sword;
    }
    public Weapons Tomahawk(){
        Weapons Tomahawk = new Weapons("Tomahawk", 9,12,13,10,6);
        WeaponsList.add(Tomahawk);
        return Tomahawk;
    }
    public Weapons Crossbow(){
        Weapons Crossbow = new Weapons("Crossbow", 10,4,14,12,12);
        WeaponsList.add(Crossbow);
        return Crossbow;
    }
    public Weapons Flamethrower(){
        Weapons Flamethrower = new Weapons("Flamethrower", 15,17,20,15,15);
        WeaponsList.add(Flamethrower);
        return Flamethrower;
    }
    public Weapons Sling(){
        Weapons Sling = new Weapons("Sling", 1,1,5,4,3);
        WeaponsList.add(Sling);
        return Sling;
    }
    public Weapons Spear(){
        Weapons Spear = new Weapons("Spear", 2,3,6,5,4);
        WeaponsList.add(Spear);
        return Spear;
    }
    public Weapons GreekFire(){
        Weapons GreekFire = new Weapons("GreekFire", 4,5,9,7,20);
        WeaponsList.add(GreekFire);
        return GreekFire;
    }
    public Weapons Boomerang(){
        Weapons Boomerang = new Weapons("Boomerang", 1,1,5,3,3);
        WeaponsList.add(Boomerang);
        return Boomerang;
    }



}
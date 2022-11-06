import java.util.ArrayList;
public class ArmourStack {

    ArrayList<Items> ArmourList = new ArrayList<>();

    public Armour Breastplate(){
        Armour Breastplate = new Armour("Breastplate", 3,8,1);
        ArmourList.add(Breastplate);
        return Breastplate;
    }  public Armour Brigandine(){
        Armour Brigandine = new Armour("Brigandine", 2,4,2);
        ArmourList.add(Brigandine);
        return Brigandine;
    } public Armour Cuirass(){
        Armour Cuirass = new Armour("Cuirass", 7,8,2);
        ArmourList.add(Cuirass);
        return Cuirass;
    } public Armour Culet(){
        Armour Culet = new Armour("Culet", 3,4,1);
        ArmourList.add(Culet);
        return Culet;
    } public Armour Pauncer(){
        Armour Pauncer = new Armour("Pauncer", 5,9,1);
        ArmourList.add(Pauncer);
        return Pauncer;
    } public Armour Plackart(){
        Armour Plackart = new Armour("Plackart", 3,5,1);
        ArmourList.add(Plackart);
        return Plackart;
    } public Armour Fauld(){
        Armour Fauld = new Armour("Fauld", 9,8,1);
        ArmourList.add(Fauld);
        return Fauld;
    } public Armour Hauberk(){
        Armour Hauberk = new Armour("Hauberk", 16,6,2);
        ArmourList.add(Hauberk);
        return Hauberk;
    }public Armour Codpiece(){
        Armour Codpiece = new Armour("Codpiece", 22,21,1);
        ArmourList.add(Codpiece);
        return Codpiece;
    }public Armour Gambeson(){
        Armour Gambeson = new Armour("Gambeson", 10,14,2);
        ArmourList.add(Gambeson);
        return Gambeson;
    }public Armour Jupon(){
        Armour Jupon = new Armour("Jupon", 1,2,2);
        ArmourList.add(Jupon);
        return Jupon;
    }public Armour Pourpoint(){
        Armour Pourpoint = new Armour("Pourpoint", 9,3,1);
        ArmourList.add(Pourpoint);
        return Pourpoint;
    }
}
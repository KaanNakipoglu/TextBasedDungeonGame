import java.util.Random;
public class ArmourRandom {
    ArmourStack armour = new ArmourStack();
    public Armour RandomArmourSelect(){
        Random i = new Random();
        int x = i.nextInt(12);
        switch (x){
            case 0 :
                armour.Breastplate();
                return armour.Breastplate();
            case 1:
                armour.Brigandine();
                return armour.Brigandine();
            case 2:
                armour.Cuirass();
                return armour.Cuirass();
            case 3:
                armour.Culet();
                return armour.Culet();
            case 4:
                armour.Pauncer();
                return armour.Pauncer();
            case 5:
                armour.Plackart();
                return armour.Plackart();
            case 6:
                armour.Fauld();
                return armour.Fauld();
            case 7:
                armour.Hauberk();
                return armour.Hauberk();
            case 8:
                armour.Codpiece();
                return armour.Codpiece();
            case 9:
                armour.Gambeson();
                return armour.Gambeson();
            case 10:
                armour.Jupon();
                return armour.Jupon();
            case 11:
                armour.Pourpoint();
                return armour.Pourpoint();

        }
        return null;

    }

}
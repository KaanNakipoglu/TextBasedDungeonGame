import java.util.Random;
public class ItemStack{
    public static Items ItemSelect(){
        Random i = new Random();
        int z = i.nextInt(11);
        switch (z){
            case 0 :
                Items  Item1 = new Items("diamond",15,10);
                return Item1;
            case 1 :
                Items  Item2 = new Items("gold",10,10);
                return Item2;
            case 2 :
                Items  Item3 = new Items("silver",5,7);
                return Item3;
            case 3 :
                Items  Item4 = new Items("emerald",20,15);
                return Item4;
            case 4 :
                Items  Item5 = new Items("dimond",15,10);
                return Item5;
            case 5 :
                Items  Item6 = new Items("dimond",15,10);
                return Item6;
            case 6 :
                Items  Item7 = new Items("dimond",15,10);
                return Item7;
            case 7 :
                Items  Item8 = new Items("dimond",15,10);
                return Item8;
            case 8:
                Items  Item9 = new Items("dimond",15,10);
                return Item9;
            case 9 :
                Items  Item10 = new Items("dimond",15,10);
                return Item10;
            case 10 :
                Items  Item11 = new Items("dimond",15,10);
                return Item11;
        }
        return null;
    }

}
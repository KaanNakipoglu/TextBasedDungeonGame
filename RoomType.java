import java.util.Random;
public class RoomType {

    public static void  RoomName(){
        Random i = new Random();
        int z= i.nextInt(7);
        switch (z){
            case 0:
                System.out.print("Armory");
                break;
            case 1:
                System.out.print("Balcony");
                break;
            case 2:
                System.out.print(" library");
                break;
            case 3:
                System.out.print(" dungeon");
                break;
            case 4:
                System.out.print("");
                break;
            case 5:
                System.out.print(" torture chamber");
                break;
            case 6:
                System.out.print(" cage");
                break;

        }
    }
    public static void RoomStatus(){
        Random i = new Random();
        int z = i.nextInt(7);
        switch(z){
            case 0:
                System.out.print(" bloody,");
                break;
            case 1:
                System.out.print(" rusty,");
                break;
            case 2:
                System.out.print(" tumbledown,");
                break;
            case 3:
                System.out.print(" moldy,");
                break;
            case 4:
                System.out.print(" ratty,");
                break;
            case 5:
                System.out.print(" snaky");
                break;
            case 6:
                System.out.print(" stinking");
                break;
            case 7:
                System.out.print(" dirty");
                break;
        }
    }
    public static void RoomSize(){
        Random i = new Random();
        int z = i.nextInt(2);
        switch (z){
            case 0:
                System.out.print(" small,");
                break;
            case 1:
                System.out.print(" big,");
                break;

        }
    }
}

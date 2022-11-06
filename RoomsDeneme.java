/*import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class RoomsDeneme {
    private int monsters;

    public int getMonsters() {
        return monsters;
    }

    public void setMonsters(int monsters) {
        this.monsters = monsters;
    }

    public int getTownspeople() {
        return townspeople;
    }

    public void setTownspeople(int townspeople) {
        this.townspeople = townspeople;
    }

    private int townspeople;

    public RoomsDeneme(int monsters, int townspeople){
        this.monsters= monsters;
        this.townspeople=townspeople;
        Random random = new Random();
        monsters = random.nextInt(5);
        if(monsters == 0){
            System.out.println("There are no monsters in this room");
        }
        else{
            System.out.println("There are " + monsters+ " monsters in this room.");
        }

        townspeople = monsters / 3;
        if(townspeople ==0){
            System.out.println("There are no Town people in this room.");
        }
        else{
            System.out.println("There are " + townspeople + " town people in this room.");
        }
        for(int b = 0;b<monsters;b++){
            MonsterStack deneme5 = new MonsterStack();
            System.out.println("Monster" + (b+1) + "is:");
            deneme5.RandomMonsterpicker();
            // monstersAr.add(deneme5.RandomMonsterpicker());
        }


        //monstersAr.add(monsters);


        if(townspeople >0){
            for (int c = 0; c < townspeople; c++) {
                TownPeopleStack deneme4 = new TownPeopleStack();
                deneme4.RandomTownPeopleSelect();
               // townsPeopleCounter +=1;
            }
        }
        else{

        }


    }
}


 */
/*
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Rooms {

    private int monsters;

    public int getMonsters() {
        return monsters;
    }

    public void setMonsters(int monsters) {
        this.monsters = monsters;
    }

    public int getTownpeople() {
        return townpeople;
    }

    public void setTownpeople(int townpeople) {
        this.townpeople = townpeople;
    }

    private int townpeople;
    Random rand = new Random();

    int corridorlow = 3;
    int corridorhigh = 6;


    /*public int getCorridors() {
        return corridors;
    }

    public void setCorridors(int corridors) {
        this.corridors = corridors;
    }



    int townPeopleCounter = 0;


    public void level() {
        int corridors = rand.nextInt(corridorhigh - corridorlow) + corridorlow;
        Random random = new Random();
        WeaponStack weapons = new WeaponStack();
        ArmourStack armours = new ArmourStack();
        Scanner scanner = new Scanner(System.in);
        String heroName = scanner.next();
        String heroGender = scanner.next();
        Hero a = new Hero(heroName,101,100,heroGender,10,500,0, weapons.Boomerang(), armours.Breastplate());
        int roomCounter = 0;
        ArrayList<Integer> pathways = new ArrayList<>();
       // ArrayList<Monsters> monstersAr = new ArrayList<>();
        int k =0;
        for (int i = 0; i < corridors; i++) {
            int roomlow = 3;
            int roomhigh = 6;
            int rooms = rand.nextInt(roomhigh - roomlow+1) + roomlow;
            for (int d = 0; d < rooms; d++) {
                setMonsters(random.nextInt(5)) ;
                setTownpeople((getMonsters() / 3));
                ArrayList<Monsters> Monsterlists[]=new ArrayList[getMonsters()+10];
                ArrayList<TownPeople> townPeoplelists[]=new ArrayList[getTownpeople()+10];
                ArrayList<Items> RoomItemslists[]=new ArrayList[20];
                RoomItemslists[d]=new ArrayList<>();
                Monsterlists[d]=new ArrayList<>();
                townPeoplelists[d]=new ArrayList<>();

                int pathway;
                //ArrayList<Monsters> MONSTERARR = new ArrayList<>();
                int mosntercounter=0;
                // Weapon_Stack deneme3 = new Weapon_Stack();
                // TownPeople deneme2 = new TownPeople("TownPeople1", 15,0,"Male",5,0,15);
                System.out.println("Room" + (d + roomCounter));


                if(getMonsters() == 0){
                    System.out.println("There are no monsters in this room");
                }
                else{
                    System.out.println("There are " +getMonsters()+ " monsters in this room.");
                }
                if(getTownpeople() ==0){
                    System.out.println("There are no Town people in this room.");
                }
                else{
                    System.out.println("There are " + getTownpeople() + " town people in this room.");
                }

                    for(int b = 0;b<getMonsters();b++){
                        MonsterStack deneme5 = new MonsterStack();
                        System.out.println("Monster" + (b+1) + "is:");
                        Monsterlists[d].add(deneme5.RandomMonsterpicker(b));

                        // monstersAr.add(deneme5.RandomMonsterpicker());
                    }

                    //monstersAr.add(monsters);
                    if(getTownpeople() >0){
                        for (int c = 0; c < getTownpeople(); c++) {
                            TownPeopleStack deneme4 = new TownPeopleStack();
                            townPeoplelists[d].add(deneme4.RandomTownPeopleSelect());
                            System.out.println(Monsterlists[d]);
                            townPeopleCounter +=1; }
                    }
                    else{
                    }
                    //heroda attack classı characters mi olusn monsters mı?

                    while(Monsterlists[a.getCurrentRoom()].size()>=0){
                        String[] command = scanner.nextLine().split(" ");
                        switch(command[0]){
                            case "Attack":
                                switch(command[1].charAt(0)){
                                case 'm': a.Attack(a,Monsterlists[a.getCurrentRoom()].get(Integer.parseInt(command[1].substring(1))));
                                    break;
                                }
                                break;

                            case "Approach":
                                String Amonster = scanner.next();
                                switch(command[1].charAt(0)){
                                    case 'm': a.approach(Monsterlists[a.getCurrentRoom()].get(Integer.parseInt(command[1].substring(1))));
                                        break;
                                }
                                break;
                            case "Pickup":
                                switch(command[1].charAt(0)){
                                    case 'i': a.pickUp(RoomItemslists[a.getCurrentRoom()].get(Integer.parseInt(command[1].substring(1))));
                                        break;
                                }

                            case "Drop":
                                switch(command[1].charAt(0)){
                                    case 'i': a.dropItem(a.Itemsinventory.get(Integer.parseInt(command[1].substring(1))));
                                        break;}
                                break;
                            case "Weaponchange":
                                switch(command[1].charAt(0)){
                                    case 'i': a.weaponChange(a.Weaponsinventory.get(Integer.parseInt(command[1].substring(1))));
                                        break;}
                                break;
                            case "Armourchange":
                                switch(command[1].charAt(0)){
                                    case 'i': a.armourChange(a.Armoursinventory.get(Integer.parseInt(command[1].substring(1))));
                                        break;}

                                break;
                            case "View Inventory":
                                break;
                            case "Move": int roomChange = scanner.nextInt();
                                a.roomChange(roomChange);
                                break;



                        }
                    }




               // k +=1;
              //  if( k==1 || k==corridors ) {
                //    pathway = rand.nextInt(rooms) + 1 + roomCounter;
               //     pathways.add(pathway);
              //  }
               // else {

              //      for (int c = 0; c < 2; c++) {
               //         pathway = rand.nextInt(rooms) + 1 + roomCounter;
              //          pathways.add(pathway);
              //          // roomCounter = rooms;

             //       }
              //  }
             //   roomCounter += rooms;




            }

            //System.out.println(rooms); // her koridorda seçilen oda sayısını görmek için sonrasında düzenlerken temizleriz zaten gereksiz kısımları.
        }



        System.out.println(pathways);
      //  System.out.println(monstersAr);
        System.out.println(townPeopleCounter);


    }
}

 */
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int importantCounter=0;
        WeaponStack weapons = new WeaponStack();
        ArmourStack armours = new ArmourStack();
        Scanner scanner = new Scanner(System.in);
        RoomsFinal.Welcometalk();
        RoomsFinal.helper();
        System.out.println("Please enter the name");
        String heroName=  scanner.next();
        System.out.println("Please enter the gender");
        String heroGender=  scanner.next();
        //LevelMaker level = new LevelMaker();
       Hero hero = new Hero(heroName,101,100,heroGender,10,300,0,0,0, weapons.Boomerang(), armours.Breastplate(),1,0);
        hero.pickUp(hero.getMainWeapon());
        hero.pickUp(hero.getMainArmour());
       // hero.pickUp(weapons.GreekFire());
        Random random = new Random();
        int corridorlow = 3;
        int corridorhigh = 6;
        int roomlow = 3;
        int roomhigh = 6;
        ArrayList<LevelFinal> levelList = new ArrayList<>();
        //ArrayList<pathway> pathwaysList = new ArrayList<>();
        ArrayList<Stairs> stairsList = new ArrayList<>();
      //  ArrayList<CorridorsFinal> CorridorsList = new ArrayList<>();
        MonsterStack mon = new MonsterStack();
        TownPeopleStack townie = new TownPeopleStack();


       // stairsList.add(stair);
        for(int k=0;k<17; k++) {
            LevelFinal lvl = new LevelFinal();
            levelList.add(lvl);
            int corridorsNumber = random.nextInt(corridorhigh - corridorlow + 1) + corridorlow;
            Stairs stair = new Stairs();
            stairsList.add(stair);
            for (int i = 0; i < corridorsNumber; i++) {
                CorridorsFinal Corridors = new CorridorsFinal();
                levelList.get(k).getCorridorList().add(Corridors);
                int roomsNumber = random.nextInt(roomhigh - roomlow + 1) + roomlow;
                for (int d = 0; d < roomsNumber; d++) {
                    int monsterNumber = random.nextInt(6);
                    int townspeopleNumber = monsterNumber / 3;
                    RoomsFinal rooms = new RoomsFinal();
                    levelList.get(k).getCorridorList().get(i).getCorridorsRooms().add(rooms);
                    //levelList.get(k).getCorridorList().get(i).getCorridorsRooms().get(d).getEntranceWord().add(RoomType.RoomSize(), RoomType.RoomStatus() ,RoomType.RoomName());
                    for (int m = 0; m <= monsterNumber; m++) {
                        levelList.get(k).getCorridorList().get(i).getCorridorsRooms().get(d).getMonsterList().add(mon.RandomMonsterpicker());
                    }
                    for (int t = 0; t <= townspeopleNumber; t++) {
                        levelList.get(k).getCorridorList().get(i).getCorridorsRooms().get(d).getTownpeopleList().add(townie.RandomTownPeopleSelect());
                    }
                }
            }
        }//pathway seçme
        for(int k=0;k<17; k++){
            for(int i = 0; i < levelList.get(k).getCorridorList().size(); i++){
                if(levelList.get(k).getCorridorList().get(i)==levelList.get(k).getCorridorList().get(0) || levelList.get(k).getCorridorList().get(i)==levelList.get(k).getCorridorList().get(levelList.get(k).getCorridorList().size()-1))
                {levelList.get(k).getCorridorList().get(i).getGates().add(random.nextInt(levelList.get(k).getCorridorList().get(i).getCorridorsRooms().size()));
                }
                else{
                    for(int u=0; u<2; u++){
                        levelList.get(k).getCorridorList().get(i).getGates().add(random.nextInt(levelList.get(k).getCorridorList().get(i).getCorridorsRooms().size()));
                    }
                    while(levelList.get(k).getCorridorList().get(i).getGates().get(0)==levelList.get(k).getCorridorList().get(i).getGates().get(1)){
                        levelList.get(k).getCorridorList().get(i).getGates().remove(1);
                        levelList.get(k).getCorridorList().get(i).getGates().add(random.nextInt(levelList.get(k).getCorridorList().get(i).getCorridorsRooms().size()));
                    }
            }
        }}





        //levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).displayRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()));
        //System.out.println("Leaderboard");
        Fileoperations.displayLeaderBoard();
        while(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).getMonsterList().size()>=0 && hero.getIsAlive()==1 ){
            stairsList.get(hero.getCurrentLevel()).getStairs().add(random.nextInt(levelList.get(hero.getCurrentLevel()).getCorridorList().get(0).getCorridorsRooms().size()));
            stairsList.get(hero.getCurrentLevel()).getStairs().add(random.nextInt(levelList.get(hero.getCurrentLevel()).getCorridorList().get(levelList.get(hero.getCurrentLevel()).getCorridorList().size()-1).getCorridorsRooms().size()));
         //  System.out.println( stairsList.get(hero.getCurrentLevel()).getStairs().get(1));
            RoomsFinal currentLocation =levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom());
            CorridorsFinal corridorATM = levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor());
            String[] command = scanner.nextLine().split(" ");
           // currentLocation.displayRoomInventory(currentLocation);
          //  currentLocation.displayRoom(currentLocation);
            //System.out.println("Available Commands" +"\nAttack"+"\nApproach"+"\nPickup"+"\nDrop"+"\nWeaponchange"+"\nArmourchange"+"\nViewInventory"+"\nMove d1"+"\nMove d2"+"\nMove d3"+"\nMove d4"+"\nMove d0"+"\nMove s1"+"\nMove s2" );
            switch(command[0]){
                case "Attack":
                    try {
                        switch(command[1].charAt(0)){
                            case 'm': Monsters chosenMonster = levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).getMonsterList().get(Integer.parseInt(command[1].substring(1)));
                            if(hero.getMainWeapon().getReach()<chosenMonster.getRange()){
                            System.out.println("Monster is out of range try to approach it!"); }
                            else hero.Attack(hero,chosenMonster);
                            if(chosenMonster.getHealth()<=0){
                                hero.Monsterdie(hero,chosenMonster,currentLocation);}
                            if(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).getMonsterList().size()==0){
                                hero.rescueTownperson(currentLocation);
                            }
                            if(hero.getHealth()<=0){
                                hero.setIsAlive(0);
                            }}

                            break;}
                    catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT A MONSTER!");
                }
                    catch(IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NO SUCH A MONSTER!");
                }
                    catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT A MONSTER!");
                } catch(Exception ex){
                        System.out.println("UNKNOWN ERROR");
                    }

                    break;

                    case "Approach":
                        try {
                            switch(command[1].charAt(0)){
                                case 'm': hero.approach(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).getMonsterList().get(Integer.parseInt(command[1].substring(1))));
                         break;
                    }}
                        catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT A MONSTER!");
                }
                        catch(IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NO SUCH A MONSTER!");
                }
                        catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT A MONSTER!");
                }catch(Exception ex){
                            System.out.println("UNKNOWN ERROR");
                        }
                    break;
                    case "Pickup":
                        try{
                            switch(command[1].charAt(0)){
                                case 'i': currentLocation.displayRoomInventory(currentLocation);
                            hero.pickUp(currentLocation.getItemsList().get(Integer.parseInt(command[1].substring(1))));
                           currentLocation.getItemsList().remove(Integer.parseInt(command[1].substring(1)));
                            break;
                    }}
                        catch (IndexOutOfBoundsException ex){
                    System.out.println("THERE ISN'T AN ITEM OVER THERE!");
                }
                        catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }
                        catch(Exception ex){
                    System.out.println("PLEASE SELECT A MONSTER!");
                }
                    break;
                    case "Drop":
                        try{

                            switch(command[1].charAt(0)){
                            case 'i':
                            currentLocation.getItemsList().add(hero.getItemsinventory().get(Integer.parseInt(command[1].substring(1))));
                            hero.dropItem(hero.Itemsinventory.get(Integer.parseInt(command[1].substring(1))));
                            break;
                    }}
                    catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }
                        catch(IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NO SUCH AN ITEM!");
                }
                        catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }catch(Exception ex){
                            System.out.println("UNKNOWN ERROR");
                        }
                    break;
                        case "Weaponchange":
                            try{
                                switch(command[1].charAt(0)){
                                    case 'i':// hero.displayInventory(hero);
                            hero.weaponChange(hero.Weaponsinventory.get(Integer.parseInt(command[1].substring(1))));
                            break;}}
                            catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }
                            catch(IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NO SUCH AN ITEM!");
                }
                            catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }catch(Exception ex){
                                System.out.println("UNKNOWN ERROR");
                            }
                    break;
                case "Armourchange":
                    try{
                        switch(command[1].charAt(0)){
                            case 'i':  //hero.displayInventory(hero);
                            hero.armourChange(hero.Armoursinventory.get(Integer.parseInt(command[1].substring(1))));
                            break;}}
                    catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }
                    catch(IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NO SUCH AN ITEM!");
                }
                    catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT AN ITEM!");
                }catch(Exception ex){
                        System.out.println("UNKNOWN ERROR");
                    }
                    break;
                    case "ViewInventory":
                    hero.displayInventory(hero);
                    break;

                    case "Move":
                        try{
                            switch(command[1].charAt(0)){

                                case 'd':
                                    if(Integer.parseInt(command[1].substring(1))==1 && currentLocation!=corridorATM.getCorridorsRooms().get(0)){
                        hero.roomChange(hero.getCurrentRoom()-1);
                    }

                                    else if(Integer.parseInt(command[1].substring(1))==2 && currentLocation != corridorATM.getCorridorsRooms().get(corridorATM.getCorridorsRooms().size()-1)){
                            hero.roomChange(hero.getCurrentRoom()+1);
                        }
                                    else if(Integer.parseInt(command[1].substring(1))==3 && currentLocation!=levelList.get(hero.getCurrentLevel()).getCorridorList().get(0).getCorridorsRooms().get(corridorATM.getGates().get(0)) && currentLocation==corridorATM.getCorridorsRooms().get(corridorATM.getGates().get(0))){
                            hero.setCurrentCorridor(hero.getCurrentCorridor()-1);
                             if(hero.getCurrentCorridor()==0){
                                hero.setCurrentRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getGates().get(0));}

                            else{hero.setCurrentRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getGates().get(1));}

                        }
                                    else if(Integer.parseInt(command[1].substring(1))==4 && currentLocation!=levelList.get(hero.getCurrentLevel()).getCorridorList().get(levelList.get(hero.getCurrentLevel()).getCorridorList().size()-1).getCorridorsRooms().get(corridorATM.getGates().get(0)) && currentLocation==corridorATM.getCorridorsRooms().get(corridorATM.getGates().get(1))){
                            hero.setCurrentCorridor(hero.getCurrentCorridor()+1);
                            hero.setCurrentRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getGates().get(0));
                        }
                                    else if(Integer.parseInt(command[1].substring(1))==0 && currentLocation==levelList.get(hero.getCurrentLevel()).getCorridorList().get(0).getCorridorsRooms().get(levelList.get(hero.getCurrentLevel()).getCorridorList().get(0).getGates().get(0))){
                            hero.setCurrentCorridor(hero.getCurrentCorridor()+1);
                            hero.setCurrentRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getGates().get(0));
                        }
                                    else{
                            System.out.println("INVALID COMMAND!");
                        }
                        break;

                                    case 's':
                                        if(Integer.parseInt(command[1].substring(1))== 1 && currentLocation==corridorATM.getCorridorsRooms().get(stairsList.get(hero.getCurrentLevel()).getStairs().get(0)) && currentLocation!=levelList.get(0).getCorridorList().get(0).getCorridorsRooms().get(stairsList.get(0).getStairs().get(0)) ){
                        hero.setCurrentLevel(hero.getCurrentLevel()-1);
                        hero.setCurrentCorridor(levelList.get(hero.getCurrentLevel()).getCorridorList().size()-1);
                        hero.setCurrentRoom(stairsList.get(hero.getCurrentLevel()).getStairs().get(1));

                    }
                                        else if(Integer.parseInt(command[1].substring(1))== 2 && currentLocation==levelList.get(hero.getCurrentLevel()).getCorridorList().get(levelList.get(hero.getCurrentLevel()).getCorridorList().size()-1).getCorridorsRooms().get(stairsList.get(hero.getCurrentLevel()).getStairs().get(1)))
                    {  hero.setCurrentLevel(hero.getCurrentLevel()+1);
                        hero.setCurrentCorridor(0);
                        stairsList.get(hero.getCurrentLevel()).getStairs().add(random.nextInt(levelList.get(hero.getCurrentLevel()).getCorridorList().get(0).getCorridorsRooms().size()));
                        hero.setCurrentRoom(stairsList.get(hero.getCurrentLevel()).getStairs().get(0));

                    }

                        break;


                }
                }
                        catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("PLEASE SELECT A DOOR OR STAIR!");
                }
                        catch (IndexOutOfBoundsException ex){
                    System.out.println("THERE IS NOTHING THERE!");
                } catch(NumberFormatException ex){
                    System.out.println("PLEASE SELECT A DOOR OR STAIR!");
                }catch(Exception ex){
                            System.out.println("UNKNOWN ERROR");
                        }
                    break;
                        case "Helper": RoomsFinal.helper();
                    break;

                    default: if(importantCounter!=0){System.out.println("INVALID COMMAND!");}
                    importantCounter++;


                    break;



            }
            System.out.println("Level: "+ (hero.getCurrentLevel()+1) + ",Corridor: " + (hero.getCurrentCorridor()+1) + ",Room: " + (hero.getCurrentRoom()+1));
            levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).displayRoomInventory(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()));
            levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()).displayRoom(levelList.get(hero.getCurrentLevel()).getCorridorList().get(hero.getCurrentCorridor()).getCorridorsRooms().get(hero.getCurrentRoom()));

        }

        Fileoperations.write(hero.getCharName(),hero.calculateExp());
        System.out.println("Your score is: " + hero.calculateExp());





    }
}

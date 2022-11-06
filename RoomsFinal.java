import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class RoomsFinal  {
    private ArrayList<Monsters> MonsterList = new ArrayList<>();

    public ArrayList<Monsters> getMonsterList() {
        return MonsterList;
    }

    public void setMonsterList(ArrayList<Monsters> monsterList) {
        MonsterList = monsterList;
    }

    public ArrayList<TownPeople> getTownpeopleList() {
        return TownpeopleList;
    }

    public void setTownpeopleList(ArrayList<TownPeople> townpeopleList) {
        TownpeopleList = townpeopleList;
    }

    public ArrayList<Items> getItemsList() {
        return ItemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        ItemsList = itemsList;
    }

    private ArrayList<TownPeople> TownpeopleList = new ArrayList<>();
    private ArrayList<Items> ItemsList = new ArrayList<>();

    public ArrayList<String> getEntranceWord() {
        return EntranceWord;
    }

    public void setEntranceWord(ArrayList<String> entranceWord) {
        EntranceWord = entranceWord;
    }

    private ArrayList<String> EntranceWord = new ArrayList<>();



    public void displayRoomInventory(RoomsFinal f){
        for(int i =0 ; i<f.ItemsList.size(); i++){
            System.out.println("Items in room:" + " " + f.ItemsList.get(i).getName());
        }
    }
    public void displayRoom(RoomsFinal f){
        System.out.print("you are in a" );
        RoomType.RoomSize(); RoomType.RoomStatus(); RoomType.RoomName();
        if(MonsterList.size()>0) {
            System.out.println("Monsters: ");
            for (int i=0;i<MonsterList.size();i++){
                getMonsterList().get(i).displayMonster();
                System.out.println("----------------------------------------");
            }
            for(int j=0;j< TownpeopleList.size();j++){
            }
            System.out.println("There are "+TownpeopleList.size()+" townspeople at this room");
            for (int i=0;i<TownpeopleList.size();i++){
                getTownpeopleList().get(i).townPeopleDisplay();
                System.out.println("----------------------------------------");
            }
        }
        else{
            System.out.println("There are no monsters in this room");
        }
        displayRoomInventory(f);


    }
    public static void Welcometalk(){System.out.println("Hi, player, are you ready for a magical adventure? This is gonna be legendary. If this is your first time playing this game, please read the information text carefully before start the game.\n" +
            "You are going to be in a magic castle, each floor int castle corresponds to a level and there are 16 levels in the game.\n" +
            "After starting the game with the lowest level of weapons and armor, we are waiting for you to kill monsters and save people with all your ambition.\n" +
            "As long as you don't attack monsters, they won't attack you either, don't worry, it's in your best interest not to approach strong and healthy monsters at the beginning of the game,\n" +
            "we don't want you to die early, right? :) The rooms in the magic castle never show their true face. You may not find a room you've visited before with the same appearance.\n" +
            "However, the inventory of monsters you kill will still be in the same room. You can add and subtract from your own inventory while keeping the weight limit.\n" +
            "In addition to moving between rooms as he wishes, the doors in some rooms are mysteriously connected with each other. The stairs you will see during the game will provide you with a transition between the levels.\n" +
            "Some tips for you:\n" +
            "1) You have to decide wisely by looking at the health, weapon and armor of the monster you are going to attack.\n" +
            "2) Some of the people you save can give you extra health points\n" +
            "3) Your game score is calculated based on the monsters you kill, the people you save, the value of the items in your inventory, and your health.\n" +
            "-----------------------------------------------------------------------------------------------------------------------------------------------------\n");}
           public static void helper(){
               System.out.println("Now I will teach you step by step what the commands do and how to get there.\n" +
                       "1) Attack command(Attack m0): after choosing which monster to attack, you can attack the first monster in the list by typing \"Attack m0\" and you can attack\n" +
                       "   the 2nd monster by typing \"Attack m1\". The key point is the numbering of monsters starting from the number 0. Please do not forget!!\n" +
                       "2) Approach command(Approach m0): every monster in the room is at a different distance from you, and you must be at least the distance required by the weapon for your weapon to be effective.\n" +
                       "   If the monster you selected is outside the reach of the weapon, each time you type \"Approach m0\" or \"Approach m1\",you will be within 20 meters of the monster you selected. I just taught you how to summon monsters.\n" +
                       "3) Pick up command(Pickup i0) : You can collect items dropped from monsters with this command. The first item is treated as 0.\n" +
                       "4) Drop command(Drop i0):If your Inventory is full but there is a valuable item you want to have, you can drop unnecessary items in your Inventor.\n" +
                       "5) Weapon change command(Weaponchange i0): you can use it to change the weapon in your hand.\n" +
                       "6) Armor change command(Armourchange i0): you can use it to change the armor on it.\n" +
                       "7) View Inventory command(ViewInventory): You can use it to see the items in your inventory\n" +
                       "8) Move command(d0, d1, d2, d3, d4, s1,s2): this commands help you to move between rooms and levels.\n" +
                       "Move d1: helps you return to the previous room.\n" +
                       "Move d2: helps you move to the next room.\n" +
                       "The back of doors d3 and d4 can sometimes be empty. You can go back to the old room with d3, while a d4 door you find open brings you to a room in another corridor.\n" +
                       "Move d0: It has the same function as d4, but you can only use it in the first corridor of each level.\n" +
                       "Move s1: Stairs that allow you to pass to the previous level. You can use it in the first room of each level.\n" +
                       "Move s2: Stairs that allow you to advance to the next level. You can use them in the last room of each level.\n" +
                       "Helper:This command will allow you to read this document again\n" +
                       "-------------------------------------------------------------------------------------------------------------------------------------------------------------");}


}

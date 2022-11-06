/*
import java.util.Random;
import java.util.ArrayList;

public class LevelMaker {
    public void createLevel() {
        Random random = new Random();
        int corridorlow = 3;
        int corridorhigh = 6;
        int roomlow = 3;
        int roomhigh = 6;
        int roomsNumber = random.nextInt(roomhigh - roomlow + 1) + roomlow;
        int corridorsNumber = random.nextInt(corridorhigh - corridorlow + 1) + corridorlow;
        ArrayList<CorridorsFinal> CorridorsList = new ArrayList<>();
        MonsterStack mon = new MonsterStack();
        TownPeopleStack townie = new TownPeopleStack();
        for (int i = 0; i < corridorsNumber; i++) {
            CorridorsFinal Corridors = new CorridorsFinal();
            CorridorsList.add(Corridors);
            for (int d = 0; d < roomsNumber; d++) {
                int monsterNumber =random.nextInt(6);
                int townspeopleNumber = monsterNumber/3;
                RoomsFinal rooms = new RoomsFinal();
                CorridorsList.get(i).getCorridorsRooms().add(rooms);
                for(int m = 0; m<=monsterNumber;monsterNumber++){
                    CorridorsList.get(i).getCorridorsRooms().get(d).getMonsterList().add(mon.RandomMonsterpicker());
                }
                for(int t=0; t<=townspeopleNumber;townspeopleNumber++){
                    CorridorsList.get(i).getCorridorsRooms().get(d).getTownpeopleList().add(townie.RandomTownPeopleSelect());
                }
            }
        }


        // roomMonsterlist.add(mon.RandomMonsterpicker(1));


    }
}




 */
import java.util.Random;
public class TownPeopleStack {
    public TownPeople RandomTownPeopleSelect(){
        Random i = new Random();
        int z = i.nextInt(5);

        switch(z) {
            case 0:
                TownPeople TownPerson1 = new TownPeople("Laborer", 20, 5, "Male", 0, 0, 5,100);
                return TownPerson1;
            case 1:
                TownPeople TownPerson2 = new TownPeople("Tailor", 15, 5, "Female", 0, 0, 10,100);
                return TownPerson2;
            case 2:
                TownPeople TownPerson3 = new TownPeople("Farmer", 15, 5, "Male", 0, 0, 1,100);
                return TownPerson3;
            case 3:
                TownPeople TownPerson4 = new TownPeople("Cultivator", 25, 5, "Female", 0, 0,5,100);
                return TownPerson4;
            case 4:
                TownPeople TownPerson5 = new TownPeople("TownPerson", 25, 5, "Male", 0, 0,1,50);
                return TownPerson5;
        }

        return null;  }

}


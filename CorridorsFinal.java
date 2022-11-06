
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class CorridorsFinal {
    public ArrayList<RoomsFinal> getCorridorsRooms() {
        return CorridorsRooms;
    }

    public void setCorridorsRooms(ArrayList<RoomsFinal> corridorsRooms) {
        CorridorsRooms = corridorsRooms;
    }

     private ArrayList<RoomsFinal> CorridorsRooms = new ArrayList<>();

    public ArrayList<Integer> getGates() {
        return Gates;
    }

    public void setGates(ArrayList<Integer> gates) {
        Gates = gates;
    }

    private ArrayList<Integer> Gates = new ArrayList<>();




}



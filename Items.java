public class Items {
    private int value;
    private int weight;
    private  String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Items( String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }





}

public class Armour extends Items {
    private int protection;
    public int getProtection() {
        return protection;
    }
    public void setProtection(int protection) {
        this.protection = protection;
    }

    public Armour(String name, int value, int weight,int protection) {
        super(name, value, weight);
        this.protection=protection;
    }
}

public class ScoreLine {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private String name;

    public ScoreLine(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    private int experience;


}

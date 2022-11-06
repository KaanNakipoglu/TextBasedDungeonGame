import java.util.Random;

public class TownPeople extends Characters {
    public int getHealValue() {
        return healValue;
    }

    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }

    private int healValue;
    public static Integer healhCalc(int maxHeal, int minHeal){
        Random randomHealth = new Random();
        return randomHealth.nextInt(maxHeal-minHeal) + minHeal;
    }
    public TownPeople(String charName, int maxHealth, int minHealth, String charSex, int inventoryCapacity,int minHeal,int maxHeal,int experience) {
        super(charName, maxHealth, minHealth, charSex, inventoryCapacity,experience);
        this.healValue=healhCalc(maxHeal,  minHeal);


    }
    public void townPeopleDisplay(){
        System.out.println(getCharName()+":\n Health:"+getHealth()+" Gender:"+getCharSex()+" Heal Value:"+getHealValue()+" Exp:"+getExperience());
    }


    public int townpeoplecounter=0;
}

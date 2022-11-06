import java.util.Random;
public class WeaponRandom {
    WeaponStack weapon = new WeaponStack();
    public Weapons RandomWeaponSelect() {
        Random i = new Random();
        int x = i.nextInt(16);
        switch (x) {
            case 0:
                weapon.BattleAxe();
                return weapon.BattleAxe();
            case 1:
                weapon.Club();
                return weapon.Club();
            case 2:
                weapon.Dagger();
                return weapon.Dagger();
            case 3:
                weapon.Halberd();
                return weapon.Halberd();
            case 4:
                weapon.Lance();
                return weapon.Lance();
            case 5:
                weapon.Pike();
                return weapon.Pike();
            case 6:
                weapon.Querterstaff();
                return weapon.Querterstaff();
            case 7:
                weapon.Sabre();
                return weapon.Sabre();
            case 8:
                weapon.Sword();
                return weapon.Sword();
            case 9:
                weapon.Tomahawk();
                return weapon.Tomahawk();
            case 10:
                weapon.Crossbow();
                return weapon.Crossbow();
            case 11:
                weapon.Flamethrower();
                return weapon.Flamethrower();
            case 12:
                weapon.Sling();
                return weapon.Sling();
            case 13:
                weapon.Spear();
                return weapon.Spear();
            case 14:
                weapon.GreekFire();
                return weapon.GreekFire();
            case 15:
                weapon.Boomerang();
                return weapon.Boomerang();
        }
        return null;

    }
}
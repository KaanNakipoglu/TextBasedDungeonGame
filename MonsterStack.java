import java.util.Random;
public class MonsterStack {
    public Monsters RandomMonsterpicker() {
        WeaponStack weapon =new WeaponStack();
        ArmourStack armour = new ArmourStack();
        Random i = new Random() ;
        int x = i.nextInt(6);

        switch (x) {
            case 0:
                Monsters Zombie = new Monsters("Zombie", 10, 5, "Male", 1, 5, weapon.Boomerang(), armour.Jupon(),20);
                Zombie.Weaponsinventory.add(Zombie.getMainWeapon());
                Zombie.Armoursinventory.add(Zombie.getMainArmour());
                Zombie.Itemsinventory.add(ItemStack.ItemSelect());

                return  Zombie;


            case 1:
                Monsters Bat = new Monsters("Bat", 15, 10, "Male", 1, 7, weapon.Sling(),armour.Brigandine(),50);
                Bat.Weaponsinventory.add(Bat.getMainWeapon());
                Bat.Armoursinventory.add(Bat.getMainArmour());
                Bat.Itemsinventory.add(ItemStack.ItemSelect());

                return Bat;

            case 2:
                Monsters Banshee = new Monsters("Banshee", 50, 40, "Male", 1, 50, weapon.Flamethrower(),armour.Codpiece(),100);
                Banshee.Weaponsinventory.add(Banshee.getMainWeapon());
                Banshee.Armoursinventory.add(Banshee.getMainArmour());
                Banshee.Itemsinventory.add(ItemStack.ItemSelect());
                return  Banshee;

            case 3:
                Monsters Devil = new Monsters("Devil", 45, 35, "Male", 1, 45, weapon.GreekFire(),armour.Gambeson(),150);
                Devil.Weaponsinventory.add(Devil.getMainWeapon());
                Devil.Armoursinventory.add(Devil.getMainArmour());
                Devil.Itemsinventory.add(ItemStack.ItemSelect());
                return Devil;

            case 4:
                Monsters Wolfman = new Monsters("Wolfman", 35, 30, "Male", 1, 35, weapon.Crossbow(),armour.Hauberk(),200);
                Wolfman.Weaponsinventory.add(Wolfman.getMainWeapon());
                Wolfman.Armoursinventory.add(Wolfman.getMainArmour());
                Wolfman.Itemsinventory.add(ItemStack.ItemSelect());
                return  Wolfman;

            case 5:
                Monsters  Helldog = new Monsters(" Helldog", 25, 20, "Male", 1, 30, weapon.Tomahawk(),armour.Plackart(),75);
                Helldog.Weaponsinventory.add(Helldog.getMainWeapon());
                Helldog.Armoursinventory.add(Helldog.getMainArmour());
                Helldog.Itemsinventory.add(ItemStack.ItemSelect());
                return  Helldog;
        }


        return null; }

}

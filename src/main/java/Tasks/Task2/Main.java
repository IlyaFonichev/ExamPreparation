package Tasks.Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Goblins> armyGoblins = new ArrayList<>();
        Weapon[] weaponGoblins = Weapon.values();
        for (int i = 1; i < 21; i++){
            armyGoblins.add(new Goblins("UngaBunga" + i));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(armyGoblins.get(i).getNameGoblin() + ": level - " + armyGoblins.get(i).getLevelGoblin()
                    + ", health - " + armyGoblins.get(i).getHealthGoblin() + ", damage - " + armyGoblins.get(i).getDamageGoblin()
                    + ", weapon - " + weaponGoblins[(int)(Math.random() * 10 % 2)]);
        }

        System.out.println("******************************************");

        ArrayList<Goblins> armyElves = new ArrayList<>();
        Weapon[] weaponElves = Weapon.values();
        for (int i = 1; i < 21; i++){
            armyElves.add(new Goblins("Legolas" + i));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(armyElves.get(i).getNameGoblin() + ": level - " + armyElves.get(i).getLevelGoblin()
                    + ", health - " + armyElves.get(i).getHealthGoblin() + ", damage - " + armyElves.get(i).getDamageGoblin()
                    + ", weapon - " + weaponElves[(int)(Math.random() * 10 % 2 + 2)]);
        }

    }
}

enum Weapon {
    Mace,
    Axe,
    Sword,
    Bow
}

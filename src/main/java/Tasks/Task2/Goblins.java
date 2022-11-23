package Tasks.Task2;

public class Goblins {

    private String nameGoblin;
    private int levelGoblin;
    private int healthGoblin;
    private int damageGoblin;

    public Goblins(String nameGoblin, int levelGoblin, int healthGoblin, int damageGoblin){
        this.nameGoblin = nameGoblin;
        this.levelGoblin = levelGoblin;
        this.healthGoblin = healthGoblin;
        this.damageGoblin = damageGoblin;
    }

    public String getNameGoblin() {
        return nameGoblin;
    }

    public void setNameGoblin(String nameGoblin) {
        this.nameGoblin = nameGoblin;
    }

    public int getLevelGoblin(){
        return levelGoblin;
    }

    public void setLevelGoblin(int levelGoblin){
        this.levelGoblin = levelGoblin;
    }

    public int getHealthGoblin(){
        return healthGoblin;
    }

    public void setHealthGoblin(int healthGoblin){
        this.healthGoblin = healthGoblin;
    }

    public int getDamageGoblin() {
        return damageGoblin;
    }

    public void setDamageGoblin(int damageGoblin) {
        this.damageGoblin = damageGoblin;
    }
}

class Elves {

    private String nameElf;
    private int levelElf;
    private int healthElf;
    private int damageElf;

    public Elves(String nameElf, int levelElf, int healthElf, int damageElf){
        this.nameElf = nameElf;
        this.levelElf = levelElf;
        this.healthElf = healthElf;
        this.damageElf = damageElf;
    }

    public String getNameElf() {
        return nameElf;
    }

    public void setNameElf(String nameElf) {
        this.nameElf = nameElf;
    }

    public int getLevelElf() {
        return levelElf;
    }

    public void setLevelElf(int levelElf) {
        this.levelElf = levelElf;
    }

    public int getHealthElf() {
        return healthElf;
    }

    public void setHealthElf(int healthElf) {
        this.healthElf = healthElf;
    }

    public int getDamageElf(){
        return damageElf;
    }

    public void setDamageElf(int damageElf){
        this.damageElf = damageElf;
    }
}

enum Weapon{
    Mace,
    Sword,
    Axe,
    Bow
}

class Main{
    public static void main(String[] args){

        Goblins goblin = new Goblins("Erick", 9, 9000, 3500);

    }
}























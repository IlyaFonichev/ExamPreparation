package Tasks.Task2;

public class Goblins {

    private String nameGoblin;
    private int levelGoblin = (int)(Math.random() * 100 + 1);
    private int healthGoblin = (int)(Math.random() * 50000 + 1);
    private int damageGoblin = (int)(Math.random() * 20000 + 1);


    public Goblins(String nameGoblin){
        this.nameGoblin = nameGoblin;
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
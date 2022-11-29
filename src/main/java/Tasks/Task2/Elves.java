package Tasks.Task2;

public class Elves {

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

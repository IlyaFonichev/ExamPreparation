package Tasks.Task8;

public class Ak47 implements Weapon{

    public void shoot() {
        System.out.println("Калаш делает трататататат");
    }

    public static void main(String[] args){
        Ak47 ak47 = new Ak47();
        ak47.shoot();
    }

}

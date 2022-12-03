package Tasks.Task8;

public class Bazooka implements Weapon{

    public void shoot(){
        System.out.println("Гранатомет делает буУУУум");
    }

    public static void main(String[] args){
        Bazooka bazooka = new Bazooka();
        bazooka.shoot();
    }

}

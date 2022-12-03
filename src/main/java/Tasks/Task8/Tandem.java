package Tasks.Task8;

public class Tandem implements Weapon{

    public void shoot(){
        System.out.println("Тандем делает перезарядка!");
    }

    public static void main(String[] args){
        Tandem tandem = new Tandem();
        tandem.shoot();
    }

}

package Tasks.Task10;

public class Main {

    public static void main(String[] args){

        Apple apple = new Apple("Red", 5, 4);
        Variety variety = Variety.Cameo;
        System.out.println(apple + variety.toString());

    }

}

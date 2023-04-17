package Tasks.NewPreparation.Quadrant;

public class Square {

    public static double square(Quadrant quadrant){
        return quadrant.getX() * quadrant.getX();
    }

    public static void main(String[] args){

        System.out.println(square(new Quadrant(5)));

    }

}

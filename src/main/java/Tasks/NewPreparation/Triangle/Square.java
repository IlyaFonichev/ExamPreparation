package Tasks.NewPreparation.Triangle;

public class Square {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 4, 3);
        System.out.println(square(triangle, halfPerimeter(triangle)));

    }

    public static double square (Triangle triangle, double p) {
        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }



    public static int halfPerimeter(Triangle triangle){
        return (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
    }

}

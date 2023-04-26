package Tasks.NewPreparation.Shape;

public abstract class Triangle implements Shape{

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int per(Triangle triangle){
        return (triangle.getA() + triangle.getB() + triangle.getC());
    }


    public double square(Triangle triangle, double p) {
        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    public int halfPerimeter(Tasks.NewPreparation.Triangle.Triangle triangle){
        return (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
    }

}

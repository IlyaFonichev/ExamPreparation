package Tasks.NewPreparation.Shape;

public class Quadrant {

    private double x;

    public Quadrant(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double square(Quadrant quadrant){
        return quadrant.getX() * quadrant.getX();
    }

    public double per(Quadrant quadrant){
        return (quadrant.getX()) * 4;
    }

}

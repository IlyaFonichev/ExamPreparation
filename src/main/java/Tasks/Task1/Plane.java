package Tasks.Task1;

public class Plane {

    private int engine;
    private int seat;

    public Plane(int engine, int seat){
        this.engine = engine;
        this.seat = seat;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}

enum Model{
    Airbus,
    Boeing
}

class Main{
    public static void main(String[] args) {

        Plane air1 = new Plane(2, 300);
        Model model1 = Model.Airbus;
        System.out.println(model1 + ": " + air1.getEngine() + " двигателей " + air1.getSeat() + " мест");

        Plane air2 = new Plane(4, 450);
        Model model2 = Model.Boeing;
        System.out.println(model2 + ": " + air2.getEngine() + " двигателя " + air2.getSeat() + " мест");
    }
}

package Tasks.NewPreparation.AnimalsOfZoo;

public class Mammal extends Animal{

    private int udderQuantity;

    public Mammal(String name, int age, double weight, int udderQuantity){
        super(name, age, weight);
        this.udderQuantity = udderQuantity;
    }

    public int getUdderQuant(){
        return udderQuantity;
    }

    public void setUdderQuantity(int udderQuantity){
        this.udderQuantity = udderQuantity;
    }


}

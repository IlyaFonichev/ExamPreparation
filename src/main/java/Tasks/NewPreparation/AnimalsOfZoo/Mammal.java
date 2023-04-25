package Tasks.NewPreparation.AnimalsOfZoo;

public class Mammal extends Animal{

    private int udderQuantity;

    public Mammal(AnimalType animalType, String name, int age, double weight, int udderQuantity){
        super(animalType, name, age, weight);
        this.udderQuantity = udderQuantity;
    }

    public int getUdderQuant(){
        return udderQuantity;
    }

    public void setUdderQuantity(int udderQuantity){
        this.udderQuantity = udderQuantity;
    }


}

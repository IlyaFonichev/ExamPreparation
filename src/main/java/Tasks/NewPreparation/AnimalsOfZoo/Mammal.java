package Tasks.NewPreparation.AnimalsOfZoo;

public class Mammal extends Animal{

    private int udderQuantity;

    public Mammal(AnimalType animalType, String name, int age, double weight){
        super(animalType, name, age, weight);
    }

    public int getUdderQuant(){
        return udderQuantity;
    }

    public void setUdderQuantity(int udderQuantity){
        this.udderQuantity = udderQuantity;
    }


}

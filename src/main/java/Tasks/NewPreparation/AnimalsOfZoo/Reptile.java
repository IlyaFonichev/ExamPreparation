package Tasks.NewPreparation.AnimalsOfZoo;

public class Reptile extends Animal{

    private int numberOfPaws;

    public Reptile(AnimalType animalType, String name, int age, double weight, int numberOfPaws){
        super(animalType, name, age, weight);
        this.numberOfPaws = numberOfPaws;
    }

    public int getNumberOfPaws(){
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws){
        this.numberOfPaws = numberOfPaws;
    }

}

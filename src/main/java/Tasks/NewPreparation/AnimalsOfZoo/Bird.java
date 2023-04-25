package Tasks.NewPreparation.AnimalsOfZoo;

public class Bird extends Animal{

    private double wingLength;

    public Bird(AnimalType animalType, String name, int age, double weight, double wingLength){
        super(animalType, name, age, weight);
        this.wingLength = wingLength;
    }

    public double getWingLength(){
        return wingLength;
    }

    public void setWingLength(double wingLength){
        this.wingLength = wingLength;
    }

}

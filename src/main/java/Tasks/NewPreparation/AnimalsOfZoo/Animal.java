package Tasks.NewPreparation.AnimalsOfZoo;

public abstract class Animal {

    private String name;
    private int age;
    private double weight;
    private AnimalType animalType;

    public Animal(AnimalType animalType, String name, int age, double weight){
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }


    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}

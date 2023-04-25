package Tasks.NewPreparation.AnimalsOfZoo;
import java.util.*;

public class Zoo {

    public static void main(String[] args){

        List<Animal> zoo = new ArrayList<>();

        addAnimalMammal(zoo, "Маша", 4, 80, 8);
        addAnimalBird(zoo, "Кеша", 3, 0.3, 0.2);
        addAnimalReptile(zoo, "Бурка", 6, 20, 4);

        System.out.println(zoo);

    }

    public static void addAnimalMammal(List<Animal> zoo, String name, int age, double weight, int udderQuantity){
        zoo.add(new Mammal(name, age, weight, udderQuantity));
    }

    public static void addAnimalBird(List<Animal> zoo, String name, int age, double weight, double wingLength){
        zoo.add(new Bird(name, age, weight, wingLength));
    }

    public static void addAnimalReptile(List<Animal> zoo, String name, int age, double weight, double numberOfPaws){
        zoo.add(new Bird(name, age, weight, numberOfPaws));
    }

}

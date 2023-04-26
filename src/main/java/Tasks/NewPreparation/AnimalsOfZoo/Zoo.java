package Tasks.NewPreparation.AnimalsOfZoo;
import java.util.*;

public class Zoo {

    private static List<Animal> zoo = new ArrayList<>();


    public static void addAnimal(AnimalType animalType, String name, int age, double weight){
        switch (animalType) {
            case mammal -> zoo.add(new Mammal(AnimalType.mammal, name, age, weight));
            case bird -> zoo.add(new Bird(AnimalType.bird, name, age, weight));
            case reptile -> zoo.add(new Reptile(AnimalType.reptile, name, age, weight));
        }

    }

}

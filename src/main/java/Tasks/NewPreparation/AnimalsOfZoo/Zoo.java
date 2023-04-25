package Tasks.NewPreparation.AnimalsOfZoo;
import java.util.*;

public class Zoo {

    public static void main(String[] args){

        List<Animal> zoo = new ArrayList<>();

        addAnimal(zoo, AnimalType.mammal , "Маша", 6, 80, 8);
        addAnimal(zoo, AnimalType.bird, "Кеша", 3, 0.3, 0.2);
        addAnimal(zoo, AnimalType.reptile, "Бурка", 6, 20, 4);

        System.out.println(zoo);

    }

    public static void addAnimal(List<Animal> zoo, AnimalType animalType, String name, int age, double weight, int udderQuantity, double numberOfPaws, double wingLength){
        switch (animalType) {
            case mammal -> zoo.add(new Mammal(AnimalType.mammal, name, age, weight, udderQuantity));
            case bird -> zoo.add(new Bird(AnimalType.bird, name, age, weight, wingLength));
            case reptile -> zoo.add(new Bird(AnimalType.reptile, name, age, weight, numberOfPaws));
        }

    }

}

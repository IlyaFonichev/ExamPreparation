package Tasks.NewPreparation.Animals;
import java.util.*;

public class Zoo {

    public static void main(String[] args){

        List<Animal> zoo = new ArrayList<>();
        addAnimal(zoo, "Борис", 5, "свинья");
        addAnimal(zoo, "Иосий", 6, "баран");
        addAnimal(zoo, "Буренка", 7, "корова");
        addAnimal(zoo, "Кряка", 6, "утка");
        addAnimal(zoo, "Андрей", 5, "пятух");

        delAnimal(zoo, "Андрей");

        System.out.println(zoo.toString());


    }

    public static void addAnimal(List<Animal> zoo, String name, int age, String type){
        zoo.add(new Animal(name, age, type));
    }

    public static void delAnimal(List<Animal> zoo, String name){
        for (int i = 0; i < zoo.size(); i++){
            if (zoo.get(i).getName().equals(name)){
                zoo.remove(i);
            }
        }
    }

}

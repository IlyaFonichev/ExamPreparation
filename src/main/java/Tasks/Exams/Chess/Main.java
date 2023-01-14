package Tasks.Exams.Chess;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Horse> horses = new ArrayList<>();
        addSet(horses, 1000);
        System.out.println(sum(horses));
    }

    public static void addSet(ArrayList<Horse> horses, int count){
        for (int i = 1; i <= count; i++){
            horses.add(new Horse());
        }
    }

    public static int sum(ArrayList<Horse> horses){;
        int sum = 0;
        for (Horse hors : horses) {
            sum += hors.getPriceHorse();
        }
        return sum;
    }

}
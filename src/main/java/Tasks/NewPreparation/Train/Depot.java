package Tasks.NewPreparation.Train;

import java.util.*;

public class Depot {

    public static void main(String[] args){

        List<Train> depot = new ArrayList<>();

        addTrain(depot, "Сенкт-Петербург - Кисловодск", "Скоростной", 400, 120);
        addTrain(depot, "Сенкт-Петербург - Москва", "Скоростной", 400, 120);
        addTrain(depot, "Санкт-Петербург - Тверь", "Скоростной", 400, 120);

        delTrain(depot, "Санкт-Петербург - Тверь");

        System.out.println(depot);
    }

    public static void addTrain(List<Train> depot, String way, String model, int sitting, int window){
        depot.add(new Train(way, model, sitting, window));
    }

    public static void delTrain(List<Train> depot, String way){
        for (int i = 0; i < depot.size(); i++){
            if (depot.get(i).getWay().equals(way)){
                depot.remove(i);
            }
        }
    }

}

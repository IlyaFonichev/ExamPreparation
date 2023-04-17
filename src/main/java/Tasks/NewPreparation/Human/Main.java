package Tasks.NewPreparation.Human;

import java.util.*;

public class Main {

    public  static void main(String[] args){

        List<Human> humanList = new ArrayList<>();
        List<Human> checkList = new ArrayList<>();

        addHuman(humanList, "Андрей Петров", 19, "мужской");
        addHuman(humanList, "Саша Прусикина", 17, "женский");
        addHuman(humanList, "Олеся Семенова", 9, "женский");
        addHuman(humanList, "Илья Пеньков", 19, "мужской");
        addHuman(humanList, "Михаил Зубенко", 33, "мужской");
        addHuman(humanList, "Виктория Фролова", 18, "женский");

        System.out.println(check(humanList, checkList, 18).toString());


    }

    public static void addHuman(List<Human> humanList, String name, int age, String sex){
        humanList.add(new Human(name, age, sex));
    }

    public static List<Human> check(List<Human> humanList, List<Human> checkList, int age){
        for (int i = 0; i < humanList.size(); i++){
            if (humanList.get(i).getAge() >= age) {
                checkList.add(humanList.get(i));
            }
        }
        return checkList;
    }

}

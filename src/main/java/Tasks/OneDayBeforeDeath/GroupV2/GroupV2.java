package Tasks.OneDayBeforeDeath.GroupV2;
import java.util.*;

public abstract class GroupV2 implements Groups{
    public static void addStudent(List<StudentV2> group, String name, int age, Sex sex){
        group.add(new StudentV2(name, age, sex));
    }


    public static void delStudent(List<StudentV2> group, String name){
        for (int i = 0; i < group.size(); i++){
            if (group.get(i).getName().equals(name)){
                group.remove(i);
            }
        }
    }

    public static int sumMale(List<StudentV2> group) {
        int count = 0;
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getSex().equals(Sex.male)){
                count += 1;
            }
        }
        return count;
    }

    public static int sumFemale(List<StudentV2> group){
        int count = 0;
        for (int i = 0; i < group.size(); i++){
            if (group.get(i).getSex().equals(Sex.female)){
                count += 1;
            }
        }
        return count;
    }

    public static double srAge(List<StudentV2> group){
        int sum = 0;
        for (int i = 0; i < group.size(); i++){
            sum += group.get(i).getAge();
        }
        return sum / group.size();
    }

    public static void main(String[] args){
        List<StudentV2> group = new ArrayList<>();
        addStudent(group, "Andrey", 19, Sex.male);
        addStudent(group, "Ilya", 19, Sex.male);
        addStudent(group, "Vika", 19, Sex.female);
        addStudent(group, "Julia", 20, Sex.female);
        delStudent(group, "Andrey");
        System.out.println(group);
        System.out.println(sumMale(group));
        System.out.println(sumFemale(group));
        System.out.println(srAge(group));
    }
}

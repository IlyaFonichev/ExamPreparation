package Tasks.Exams.Students;

import java.util.*;

public class Group {

    static ArrayList<Student> group = new ArrayList<>();

    public static void main(String[] args){
        addStudent(group, "Маша", 18, Sex.girl);
        addStudent(group, "Игорь", 20, Sex.boy);
        addStudent(group, "Андрей", 19, Sex.boy);
        addStudent(group, "Юля", 19, Sex.girl);
        addStudent(group, "Вика", 19, Sex.girl);
        addStudent(group, "Илья", 19, Sex.boy);
        System.out.println(sum(group));
    }

    public static void addStudent(ArrayList<Student> group, String nameOfStudent, int ageOfStudent, Sex sexOfStudent){
        group.add(new Student(nameOfStudent, ageOfStudent, sexOfStudent));
    }

    public static int sum(ArrayList<Student> group){
        int sum = 0;
        for(Student studentOfGroup : group){
            if (studentOfGroup.getSex() == Sex.boy) sum += 1;
        }
        return sum;
    }

}

package Tasks.NewPreparation.ListOfStudents;

import java.util.*;

public class ListOfStudents {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        addStudent(studentList, "Илья", "Фоничев", 19, 3.82);
        addStudent(studentList, "Юлия", "Фролова", 19, 3.80);
        addStudent(studentList, "Виктория", "Ануфриева", 20, 4.55);
        addStudent(studentList, "Андрей", "Петров", 19, 3.15);

        addStudent(studentList, "Андрей", "Кушнир", 19, 4.6);

        delStudent(studentList, "Андрей", "Петров");

        System.out.println(studentList.toString());
        System.out.println(mainAge(studentList));

    }

    public static void addStudent(List<Student> studentList, String firstNameOfStudent, String secondNameOfStudent, int ageOfStudent, double mainScoreOfStudent){
        studentList.add(new Student(firstNameOfStudent, secondNameOfStudent, ageOfStudent, mainScoreOfStudent));
    }

    public static void delStudent(List<Student> studentList, String firstNameOfStudent, String secondNameOfStudent){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getFirstName().equals(firstNameOfStudent)){
                if (studentList.get(i).getSecondName().equals(secondNameOfStudent)){
                    studentList.remove(i);
                }
            }
        }
    }

    public static double mainAge(List<Student> studentList){
        int ages = 0;
        int count = 0;
        for (int i = 0; i < studentList.size(); i++){
            ages += studentList.get(i).getAge();
            count++;
        }
        return (double) ages / count;
    }

}

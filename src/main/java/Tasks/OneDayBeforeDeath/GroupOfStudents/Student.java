package Tasks.OneDayBeforeDeath.GroupOfStudents;

import java.util.Objects;

public class Student{

    private String name;
    private int age;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSex(){
        return sex;
    }

    @Override
    public String toString(){
        return "\n Студент: " + getName() +
                ", возраст: " + getAge() + ", пол: " + getSex();
    }
}

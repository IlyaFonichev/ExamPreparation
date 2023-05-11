package Tasks.OneDayBeforeDeath.GroupV2;

import java.util.*;

public class StudentV2{

    private String name;
    private int age;
    private Sex sex;
    List<StudentV2> groupV2;

    public StudentV2(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.groupV2 = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Sex getSex(){
        return sex;
    }

    @Override
    public String toString(){
        return "\n Студент: " + getName() +
                ", возраст: " + getAge() + ", пол: " + getSex().getType();
    }
}


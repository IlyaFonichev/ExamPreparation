package Tasks.OneDayBeforeDeath.GroupOfStudents;

public class Student{

    private String name;
    private int age;
    private String sex;

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

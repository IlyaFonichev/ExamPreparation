package Tasks.Exams.Students;

public class Student {

    private String name;
    private int age;
    private final Sex sex;

    public Student(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }
}

enum Sex{
    boy,
    girl
}

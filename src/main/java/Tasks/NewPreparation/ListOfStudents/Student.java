package Tasks.NewPreparation.ListOfStudents;

public class Student {

    private String firstName;
    private String secondName;
    private int age;
    private double mainScore;

    public Student(String firstName, String secondName, int age, double mainScore){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.mainScore = mainScore;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMainScore() {
        return mainScore;
    }

    public void setMainScore(double mainScore) {
        this.mainScore = mainScore;
    }

    @Override
    public String toString(){
        return "\n" + "Имя: " + getSecondName() +
                " " + getFirstName() +
                ", возраст: " + getAge() + " лет" +
                ", средний балл: " + getMainScore();
    }
}

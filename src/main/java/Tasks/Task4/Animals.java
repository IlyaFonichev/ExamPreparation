package Tasks.Task4;

import java.util.Objects;

public class Animals {

    private int age;
    private String colour;
    private String name;

    public Animals(int age, String colour, String name){
        this.age = age;
        this.colour = colour;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(colour, animals.colour) && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, colour, name);
    }
}

package Tasks.Task10;


import java.util.Objects;

public class Apple{

    private String color;
    private int worm;
    private int kg;

    public Apple(String color, int worm, int kg){
        this.color = color;
        this.worm = worm;
        this.kg = kg;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getWorm(){
        return worm;
    }

    public void setWorm(int worm){
        this.worm = worm;
    }

    public int getKg(){
        return kg;
    }

    public void setKg(int kg){
        this.kg = kg;
    }

    public double PricePerKilogram(){
        double price = 1.357951;
        return kg * price;
    }




    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return worm == apple.worm && kg == apple.kg && Objects.equals(color, apple.color);
    }

    @Override
    public String toString(){
        return "Цвет - " + getColor()
                 + ", червяков - " + getWorm()
                + ", взяли - " + getKg() + " кг."
                + " цена - " + PricePerKilogram()
                + "руб. Сорт - ";
    }

}
















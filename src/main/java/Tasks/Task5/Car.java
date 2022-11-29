package Tasks.Task5;

public class Car {

    private String color;
    private int age;

    public Car(int age, String color){
        this.age = age;
        this.color = color;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    enum Model{
        Crossover,
        OffRoad,
        Pickup,
        Sedan,
        Hatchback,
        Minivan,
        Roadster,
        Cabriolet,
        Coupe,
        Limousine
    }

    public static void main(String[] args){
        Car car1 = new Car(15, "Blue");
        Model model1 = Model.Crossover;
        System.out.println("First car: " + "age - " + car1.getAge() + ", color - " + car1.getColor() + ", model - " + model1);

        Car car2 = new Car(4, "Black");
        Model model2 = Model.Sedan;
        System.out.println("Second car: " + "age - " + car2.getAge() + ", color - " + car2.getColor() + ", model - " + model2);

        Car car3 = new Car(0, "White");
        Model model3 = Model.Hatchback;
        System.out.println("Third car: " + "age - " + car3.getAge() + ", color - " + car3.getColor() + ", model - " + model3);

        //Использование метода .values()
        Car car4 = new Car(1, "Grey");
        Model[] model4 = Model.values();
        System.out.println("Fourth car: " + "age - " + car4.getAge() + ", color - " + car4.getColor() + ", model - " + model4[1]);

        //Испольвание метода .original()
        //Идея была в том, если значений в enam у нас много и лень считать индекс, то можно сделать так
        //Смысла в этом 0. Было сделано в экспериментальных целях
        Car car5 = new Car(2, "Pink");
        Model model5 = Model.Coupe;
        int index = model5.ordinal();
        Model[] model = Model.values();
        System.out.println("Fifth car: " + "age - " + car5.getAge() + ", color - " + car5.getColor() + ", model - " + model[index]);

    }

}

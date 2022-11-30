package Tasks.Task4;

public class Olen extends Animals{
    public Olen(int age, String colour, String name) {
        super(age, colour, name);
    }

    public static void main(String[] args){
        Olen Ivan = new Olen(9, "Коричневый", "Иван");
        System.out.println(Ivan.getName());
    }

}

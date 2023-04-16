package Tasks.NewPreparation.Calculator;

public class Calculator {

    public static void main(String[] args){

        System.out.println(sum(new Numbers(2, 4.4)));
        System.out.println(subtraction(new Numbers(15, 6.2)));
        System.out.println(multiplication(new Numbers(10, 5.5)));
        System.out.println(division(new Numbers(100, 50)));

    }

    public static double sum(Numbers numbers){
        return numbers.getX() + numbers.getY();
    }

    public  static double subtraction(Numbers numbers){
        return numbers.getX() - numbers.getY();
    }

    public static double multiplication(Numbers numbers){
        return numbers.getX() * numbers.getY();
    }

    public static double division(Numbers numbers){
        return numbers.getX() / numbers.getY();
    }

}

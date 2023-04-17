package Tasks.NewPreparation.Counter;

public class Main {

    public static void main(String[] args){

        Counter count = new Counter(96);

        System.out.println(convertPlus(count));
        System.out.println(convertMinus(count));
        System.out.println(convertPlusFor(count, 4));
        System.out.println(convertMinusFor(count, 6));

    }

    public static int convertPlus(Counter counter){
        return counter.getNumber() + 1;
    }

    public static int convertMinus(Counter counter){
        return counter.getNumber() - 1;
    }

    public static int convertPlusFor(Counter counter, int num){
        return counter.getNumber() + num;
    }

    public static int convertMinusFor(Counter counter, int num){
        return counter.getNumber() - num;
    }

}

package Tasks.NewPreparation;

public class PrimeNumbers {

    public static void main(String[] args){
        out_for:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue out_for;
                }
            }
            System.out.println(i);
        }
    }

}

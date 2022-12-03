package Tasks.CodeWars;

public class Square {

    public static int[] squareOrSquareRoot(int[] array){
        double a = 0;
        for (int i = 0; i < array.length; i++){
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

}

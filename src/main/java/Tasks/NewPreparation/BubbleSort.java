package Tasks.NewPreparation;


public class BubbleSort {

    static int[] list = {5, 16, 1, 516, 516, 51, 1, 35, 13, 54, 856, 187, 6, 7000};

    public static void main(String[] args){
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length - i - 1; j++){
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int j : list) {
            System.out.println(j);
        }
    }
}

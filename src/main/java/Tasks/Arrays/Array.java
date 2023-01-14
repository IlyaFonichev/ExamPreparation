package Tasks.Arrays;


import java.util.Arrays;

public class Array {

    public static void main(String[] args){

        // Задача 1. Найти сумму элементов массива {1,2,3,4,5,6,7,8,9}. Ответ: 45
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum1 = 0;
        for (int i : firstArray){
            sum1 += i;
        }
        System.out.println(sum1);

        // Задача 2. Найти сумму положительных элементов массива {1,-2,3,-4,5,-6,7,-8,9}. Ответ: 25
        int[] secondArray = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        int sum2 = 0;
        for (int i : secondArray){
            if (i > 0) sum2 += i;
        }
        System.out.println(sum2);

        // Задача 3. Найти максимальный элемент в массиве {1,9,2,8,3,7,4,6,5}. Ответ: 9
        int[] thirdArray = {1,9,2,8,3,7,4,6,5};
        int max1 = 0;
        for (int i : thirdArray) {
            max1 = Math.max(max1, i);
        }
        System.out.println(max1);

        // Задача 4. Функция(bool) элементы массива расположены в порядке возростания или нет(если да - вернуть true, иначе else)
        // {1,2,3,4,5,6,7,9,8}. Ответ: false
        int[] fourthArray = {1,2,3,4,5,6,7,9,8};
        boolean flag = false;
        for (int i = 0; i < fourthArray.length-1; i++){
            flag = fourthArray[i] < fourthArray[i + 1];
        }
        System.out.println(flag);

        // Задача 5. Удалять повторяющиеся элементы из массива(вернуть массив, в котором только уникальные элементы)
        // {1,2,2,3,4,4,4,5,6,7,8,8,9,9}. Ответ: {1,2,3,4,5,6,7,8,9}
        int[] fifthArray = {1,2,2,3,4,4,4,5,6,7,8,8,9,9};
        int n = fifthArray.length;
        for (int i = 0, m; i != n; i++, n = m ){
            for ( int j = m = i + 1; j != n; j++ ){
                if ( fifthArray[j] != firstArray[i] ){
                    if ( m != j ) fifthArray[m] = fifthArray[j];
                    m++;
                }
            }
        }
        if ( n != fifthArray.length ){
            int[] b = new int[n];
            System.arraycopy(fifthArray, 0, b, 0, n);
            fifthArray = b;
        }
        System.out.println(Arrays.toString(fifthArray));

        // Задача 6. Отсортировать массив {2,4,6,8,1,3,5,7,9}. Ответ {1,2,3,4,5,6,7,8,9}
        int[] sixthArray = {2,4,6,8,1,3,5,7,9};
        Arrays.sort(sixthArray);
        System.out.println(Arrays.toString(sixthArray));

        // Задача 7. Напишите функцию, которая возвращает как минимальное, так и максимальное число из заданного списка / массива.
//        int[] arr = {2,4,6,8,1,3,5,7,9};
//        int[] arr1 = new int[0];
//        int min = 0;
//        int max = 0;
//        for (int i : arr){
//            min = Math.min(min, i);
//            arr1 = min;
//        }
//        return arr1;
    }

}

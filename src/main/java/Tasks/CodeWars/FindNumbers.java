package Tasks.CodeWars;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0) list.add(numbers[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}

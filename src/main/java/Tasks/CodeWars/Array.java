package Tasks.CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static int[] between(int a, int b) {
        List<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++){
            list.add(i);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }

        return array;
    }

}

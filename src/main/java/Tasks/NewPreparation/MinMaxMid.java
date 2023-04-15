package Tasks.NewPreparation;

import java.util.*;

public class MinMaxMid {

    static ArrayList<Integer> list = new ArrayList<>(Arrays.asList(456, 213, 310, 5065, 516, 16, 161, 61, 6161, 6161, 6, 6156));

    public static int Min(){
        int min = Max();
        for (Integer integer : list) {
            if (min > integer) min = integer;
        }
        return min;
    }

    public static int Max(){
        int max = 0;
        for (Integer integer : list) {
            if (max < integer) max = integer;
        }
        return max;
    }

    public static double Mid(){
        double mid = 0;
        for (Integer integer : list) {
            mid += integer;
        }
        return mid/ list.size();
    }

    public static void main(String[] args){
        System.out.println(Min());
        System.out.println(Mid());
        System.out.println(Max());
    }

}

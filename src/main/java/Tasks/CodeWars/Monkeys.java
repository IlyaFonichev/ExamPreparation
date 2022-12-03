package Tasks.CodeWars;

public class Monkeys {

    public static int[] monkeyCount(final int n){
        int[] my = new int[n];
        for(int i = 0; i < my.length; i++){
              my[i] = i + 1;
        }
        return my;
    }
}

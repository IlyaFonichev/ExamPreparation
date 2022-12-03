package Tasks.CodeWars;

public class School {

    public static int getAverage(int[] marks){
        int a = 0;
        for (int mark : marks) {
            a += mark;
        }
        return a/ marks.length;
    }

}

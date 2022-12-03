package Tasks.CodeWars;

import java.util.Arrays;

public class ReversedWords {

    public static String reverseWords(String str){
        String[] myArray = new String[str.split(" ").length];
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++){
            myArray[array.length - 1 - i] = array[i];
        }
        return String.join(" ", myArray);
    }

}

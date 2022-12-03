package Tasks.CodeWars;

public class Animals {

    public static String[] fixTheMeerkat(String[] arr) {
        String[] myArr = new String[arr.length];

        for (int i = 0; i < myArr.length; i++){
            myArr[arr.length - 1 - i] = arr[i];
        }
        return myArr;
    }

}

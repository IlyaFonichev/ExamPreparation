package Tasks.Task3;

import java.util.*;

public class Collections {
    public static void main(String[] args){
        array();
        list();
        set();
        map();
    }

    static void array(){
        System.out.println("*********Array*********");

        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] arrayCopy = Arrays.copyOfRange(array, 3, 6);
        System.out.println("Copying: " + Arrays.toString(arrayCopy));
        Arrays.sort(array);
        System.out.println("Sorting: " + Arrays.toString(array));

    }

    static void list(){
        System.out.println("*********List*********");

        System.out.println("*********ArrayList*********");

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1));
        System.out.println("My list: " + list1);
        System.out.println("Size of list: " + list1.size());
        System.out.println("The fifth index in the list: " + list1.get(4));
        System.out.println("Adding 0 to the list: " + list1.add(0) + " " + list1);

        System.out.println("*********LinkedList*********");

        LinkedList<Integer> list2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1));
        int a = 10;
        System.out.println("My list: " + list2);
        System.out.println("Size of list: " + list2.size());
        System.out.println("The fifth index in the list: " + list2.get(4));
        list2.add(1, a);
        System.out.println("Adding 10 to the list between 0 and 1 elements: " + list2);
    }

    static void set(){
        System.out.println("*********Set*********");

        System.out.println("*********HashSet*********");

        HashSet<Integer> set1 = new HashSet<>(List.of(1, 3, 2, 4, 5, 4, 3, 2, 1));
        System.out.println("My set: " + set1);
        System.out.println("Size of list: " + set1.size());
        System.out.println("Adding 0 to the set: " + set1.add(0) + " " + set1);

        System.out.println("*********SortedSet*********");



        System.out.println("*********TreeSet*********");
        TreeSet<Integer> set3 = new TreeSet<>(List.of(1, 3, 2, 4, 5, 4, 3, 2, 1));
        System.out.println("My set: " + set3);
        System.out.println("Size of list: " + set3.size());
        System.out.println("Adding 10 to the set: " + set3.add(10) + " " + set3);

    }

    static void map(){
        System.out.println("*********Map*********");

        System.out.println("*********HashMap*********");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        System.out.println("My map: " + map1);
        System.out.println("Size of map: " + map1.size());
        System.out.println("Which corresponds to 3 in my map: " + map1.get(3));


        System.out.println("*********TreeMap*********");

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "One");
        map2.put(9, "Nine");
        map2.put(3, "Three");
        System.out.println("My map: " + map2);
        System.out.println("Last entry: " + map2.lastEntry());
        System.out.println("Last entry: " + map2.pollLastEntry() + " " + map2);
    }
}

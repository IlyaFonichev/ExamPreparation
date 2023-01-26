package Tasks.Exams.Wardrobe;

import java.util.*;

public class Wardrobe {

    private final int serialNumber;
    HashMap<Integer, Shelf> wardrobe = new HashMap<>();

    public Wardrobe(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void addShelf(int key, int volumeOfShelf){
        wardrobe.put(key, new Shelf(volumeOfShelf));
    }

    public void deleteShelf(int key){
        wardrobe.remove(key);
    }

    public int counter(){
        return wardrobe.size();
    }

    public int counterOfValue(){
        int count = 0;
        for (int key : wardrobe.keySet()) {
            count += wardrobe.get(key).getVolume();
        }
        return count;
    }

    public int megaAllPrice(){
        int s = 0;
        for (Shelf polka : wardrobe.values()) {
            s += polka.allPrice();
        }
        return s;
    }

    public static void main(String[] args){
        Wardrobe wd = new Wardrobe(82347568);
        wd.addShelf(11, 1);
        wd.wardrobe.get(11).addProduct("Молоко", 64);
        wd.wardrobe.get(11).addProduct("Кактус", 999);
        wd.wardrobe.get(11).addProduct("Ананас", 666);
        wd.addShelf(12, 2);
        wd.wardrobe.get(12).addProduct("Хлеб", 72);
        wd.wardrobe.get(12).addProduct("Сало", 9999);
        wd.wardrobe.get(11).delProducts("Молоко");
        System.out.println(wd.megaAllPrice());
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

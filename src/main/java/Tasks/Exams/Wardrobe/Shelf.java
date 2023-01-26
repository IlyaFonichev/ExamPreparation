package Tasks.Exams.Wardrobe;

import java.util.*;
import Tasks.Exams.Basket.Products;

public class Shelf{

    private int volume;
    List<Products> container = new ArrayList<>();

    public Shelf(int volume){
        this.volume = volume;
    }

    public void addProduct(String name, int price){
        container.add(new Products(name, price));
    }

    public void delProducts(String nameOfProduct){
        container.removeIf(nameOfElement -> nameOfElement.getName() == nameOfProduct);
    }

    public int allPrice(){
        int sum = 0;
        for (Products products : container) {
            sum += products.getPrice();
        }
        return sum;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }


}

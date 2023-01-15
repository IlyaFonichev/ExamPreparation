package Tasks.Exams.FirstTask;

import java.util.*;

public class Basket {

    public static void main(String[] args){
        ArrayList<Products> basket = new ArrayList<>();
        addProduct(basket, 3, "Молоко", 62);
        addProduct(basket, 4, "Яйца", 89);
        delProducts(basket, "Молоко");
        System.out.println(sum(basket));
    }

    public static void addProduct(ArrayList<Products> basket, int count, String nameOfProduct, int priceOfProduct){
        for (int i = 0; i < count; i++){
            basket.add(new Products(nameOfProduct, priceOfProduct));
        }
    }

    public static void delProducts(ArrayList<Products> basket, String nameOfProduct){
        basket.removeIf(nameOfElement -> nameOfElement.getName() == nameOfProduct);
        /*for (Products productOfBasket : basket){
            if(productOfBasket.getName() == nameOfProduct){
                basket.remove(productOfBasket);
            }
        }*/
    }

    public static int sum(ArrayList<Products> basket){
        int sum = 0;
        for (int i = 0; i < basket.size(); i++){
            sum += basket.get(i).getPrice();
        }
        return sum;
    }

}

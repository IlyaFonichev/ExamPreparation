package Tasks.NewPreparation.ProductsAddDelSum;

import java.util.*;

public class Basket {

    public static void Add(ArrayList<Product> basket, String nameOfProduct, double priceOfProduct){
        basket.add(new Product(nameOfProduct, priceOfProduct));
    }

    public static void delete(ArrayList<Product> basket, String nameOfProduct){
        basket.removeIf(nameOfBasket -> nameOfBasket.getName() == nameOfProduct);
    }

    public static double basketSum(ArrayList<Product> basket){
        double summ = 0;
        for (Product product : basket){
            summ += product.getPrice();
        }
        return summ;
    }

    public static void main(String[] args){

        ArrayList<Product> basket = new ArrayList<>();

        Add(basket, "Молоко", 69.90);
        Add(basket, "Хлеб", 72.60);
        Add(basket, "Кефир", 59.99);

        delete(basket, "Кефир");
        delete(basket, "Хлеб");

        System.out.println(basketSum(basket));
    }
}

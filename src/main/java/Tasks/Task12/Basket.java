package Tasks.Task12;

import java.util.*;

public class Basket{

    public static void addProduct(List<Product> basket, String name, String article, double price, int count){
        for (int i = 0; i < count; i++){
            basket.add(new Product(name, article, price));
        }
    }

    public static void delProduct(List<Product> basket, String name, String article){
        for (int i = 0; i < basket.size(); i++){
                if (basket.get(i).getName().equals(name)){
                    if(basket.get(i).getArticle().equals(article)) {
                        basket.remove(i);
                    }
                }
        }
    }

    public static double sumPrice(List<Product> basket){
        double sum = 0;
        for (int i = 0; i < basket.size(); i++){
            sum += basket.get(i).getPrice();
        }
        return sum;
    }

    public static void main(String[] args){

        List<Product> basket = new ArrayList<>();

        addProduct(basket, "Джинсы", "1864164", 2499.90, 3);
        addProduct(basket, "Худи", "6541468", 3540, 7);
        addProduct(basket, "Телефон", "2468464", 16464.59, 1);
        delProduct(basket, "Телефон", "2468464");

        System.out.println(basket);
        System.out.println(sumPrice(basket));

    }
}

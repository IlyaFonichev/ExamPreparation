package Tasks.Exams.FirstTask;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Products> basket = new ArrayList<>();
//    Products products1 = new Products();

    public void Add(){
        Products products = new Products("Молоко", 87);
        basket.add(products);
    }

    public int Summa(){
        int sum = 0;
        for (Products products : basket){
            sum += products.getPrice();
        }
        return sum;
    }

}

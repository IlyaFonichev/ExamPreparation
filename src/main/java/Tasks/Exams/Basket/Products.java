package Tasks.Exams.Basket;

public class Products {

    private String name;
    private int price;
    //List<Products> product;

    public Products(String name, int price){
        this.name = name;
        this.price = price;
        //this.product = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

package restaurant;

public class Dish {

    private String name;

    private double price;

    private short id;

    private String products;
    
     public Dish(double price, String name, String products, short id) {
        this.price = price;
        this.name = name;
        this.products = products;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getProducts() {
        return products;
    }

    public short getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}

    

    

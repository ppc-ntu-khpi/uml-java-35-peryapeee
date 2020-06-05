package restaurant;

public class Customers {

    private Order[] orders;

    private String name;

    public Customers(String n) {
        this.name = n;
    }

    public Order createOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Order cancelOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

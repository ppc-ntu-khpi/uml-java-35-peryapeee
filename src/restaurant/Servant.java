package restaurant;

public class Servant {

    private Order[] readyOrders;

    private String name;

     public Servant(String n){
        this.name = n;
    }
     
    public Order addReadyOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Order cancelOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

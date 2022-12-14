import java.util.ArrayList;
import java.util.List;
public class Robot {
    // create an arraylist of type order
    private List<Order> orders = new ArrayList<Order>();
    public void takeOrder(Order order){
        orders.add(order);
    }
    public void placeOrders(){
        for(Order order : orders){
            order.execute();
        }
        orders.clear();
    }
}

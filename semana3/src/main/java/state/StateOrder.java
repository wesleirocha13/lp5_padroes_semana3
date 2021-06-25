package state;

/**
 *
 * @author Weslei
 */
public interface StateOrder {
    String getState();
    
    String request(Order order);
    
    String cancel(Order order);
    
    String finish(Order order);
    
    String giveBack(Order order);
    
    String rate(Order order);
}

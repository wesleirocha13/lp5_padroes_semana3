package state;

/**
 *
 * @author Weslei
 */
public class StateOrderRate implements StateOrder{
    private StateOrderRate() {};
    private static StateOrderRate instance = new StateOrderRate();
    public static StateOrderRate getInstance() {
        return instance;
    }

    public String getState() {
        return "Avaliado";
    }
    
    public String request(Order order) {
        return "Pedido não realizado";
    }
    
    public String cancel(Order order) {
        return "Pedido não cancelado";
    }
    
    public String finish(Order order) {
        return "Pedido não finalizado";
    }
    
    public String giveBack(Order order) {
        return "Pedido não devolvido";
    }
    
    public String rate(Order order) {
        return "Pedido não avaliado";
    }
}

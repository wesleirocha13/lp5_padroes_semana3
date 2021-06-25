package state;

/**
 *
 * @author Weslei
 */
public class StateOrderFinish implements StateOrder{
    private StateOrderFinish() {};
    private static StateOrderFinish instance = new StateOrderFinish();
    public static StateOrderFinish getInstance() {
        return instance;
    }

    public String getState() {
        return "Finalizado";
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
        order.setState(StateOrderRate.getInstance());
        return "Pedido avaliado";
    }
}

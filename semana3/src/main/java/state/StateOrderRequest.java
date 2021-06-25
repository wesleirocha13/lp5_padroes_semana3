package state;

/**
 *
 * @author Weslei
 */
public class StateOrderRequest implements StateOrder{
    
    private StateOrderRequest() {};
    private static StateOrderRequest instance = new StateOrderRequest();
    public static StateOrderRequest getInstance() {
        return instance;
    }

    public String getState() {
        return "Solicitado";
    }
    
    public String request(Order order) {
        return "Pedido não realizado";
    }
    
    public String cancel(Order order) {
        order.setState(StateOrderCancel.getInstance());
        return "Pedido cancelado";
    }
    
    public String finish(Order order) {
        order.setState(StateOrderFinish.getInstance());
        return "Pedido finalizado";
    }
    
    public String giveBack(Order order) {
        order.setState(StateOrderGiveBack.getInstance());
        return "Pedido devolvido";
    }
    
    public String rate(Order order) {
        return "Pedido não avaliado";
    }
    
}

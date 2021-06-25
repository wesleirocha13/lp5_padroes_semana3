package state;

/**
 *
 * @author Weslei
 */
public class StateOrderGiveBack implements StateOrder{
    private StateOrderGiveBack() {};
    private static StateOrderGiveBack instance = new StateOrderGiveBack();
    public static StateOrderGiveBack getInstance() {
        return instance;
    }

    public String getState() {
        return "Devolvido";
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

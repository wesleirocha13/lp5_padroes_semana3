package state;

/**
 *
 * @author Weslei
 */
public class StateOrderCancel implements StateOrder{
    private StateOrderCancel() {};
    private static StateOrderCancel instance = new StateOrderCancel();
    public static StateOrderCancel getInstance() {
        return instance;
    }

    public String getState() {
        return "Cancelado";
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

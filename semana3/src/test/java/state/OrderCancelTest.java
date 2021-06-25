package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderCancelTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
        
    @Test
    public void notRequestCanceledOrder() {
        order.setState(StateOrderCancel.getInstance());
        assertEquals("Pedido não realizado", order.request());
    }
    
    @Test
    public void notCancelCanceledOrder() {
        order.setState(StateOrderCancel.getInstance());
        assertEquals("Pedido não cancelado", order.cancel());
    }
    
    @Test
    public void notFinishCanceledOrder() {
        order.setState(StateOrderCancel.getInstance());
        assertEquals("Pedido não finalizado", order.finish());
    }
    
    @Test
    public void notGiveBackCanceledOrder() {
        order.setState(StateOrderCancel.getInstance());
        assertEquals("Pedido não devolvido", order.giveBack());
    }
    @Test
    public void notRateCanceledOrder() {
        order.setState(StateOrderCancel.getInstance());
        assertEquals("Pedido não avaliado", order.rate());
    }
     
}

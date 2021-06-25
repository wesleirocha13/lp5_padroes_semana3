package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderGiveBackTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
    
    @Test
    public void notRequestReturnedOrder() {
        order.setState(StateOrderGiveBack.getInstance());
        assertEquals("Pedido não realizado", order.request());
    }
    
    @Test
    public void notCancelReturnedOrder() {
        order.setState(StateOrderGiveBack.getInstance());
        assertEquals("Pedido não cancelado", order.cancel());
    }
    
    @Test
    public void notFinishReturnedOrder() {
        order.setState(StateOrderGiveBack.getInstance());
        assertEquals("Pedido não finalizado", order.finish());
    }
    
    @Test
    public void notGiveBackReturnedOrder() {
        order.setState(StateOrderGiveBack.getInstance());
        assertEquals("Pedido não devolvido", order.giveBack());
    }
    @Test
    public void rateReturnedOrder() {
        order.setState(StateOrderGiveBack.getInstance());
        assertEquals("Pedido avaliado", order.rate());
    }      
}

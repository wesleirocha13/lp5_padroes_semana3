package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderRequestTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
    
    @Test
    public void notRequestRequestedOrder() {
        order.setState(StateOrderRequest.getInstance());
        assertEquals("Pedido não realizado", order.request());
    }
    
    @Test
    public void cancelRequestedOrder() {
        order.setState(StateOrderRequest.getInstance());
        assertEquals("Pedido cancelado", order.cancel());
    }
    
    @Test
    public void finishRequestedOrder() {
        order.setState(StateOrderRequest.getInstance());
        assertEquals("Pedido finalizado", order.finish());
    }
    
    @Test
    public void GiveBackRequestedOrder() {
        order.setState(StateOrderRequest.getInstance());
        assertEquals("Pedido devolvido", order.giveBack());
    }
    @Test
    public void rateRequestedOrder() {
        order.setState(StateOrderRequest.getInstance());
        assertEquals("Pedido não avaliado", order.rate());
    }
       
}

package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderRateTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
    
    @Test
    public void notRequestRatedOrder() {
        order.setState(StateOrderRate.getInstance());
        assertEquals("Pedido não realizado", order.request());
    }
    
    @Test
    public void notCancelRatedOrder() {
        order.setState(StateOrderRate.getInstance());
        assertEquals("Pedido não cancelado", order.cancel());
    }
    
    @Test
    public void notFinishRatedOrder() {
        order.setState(StateOrderRate.getInstance());
        assertEquals("Pedido não finalizado", order.finish());
    }
    
    @Test
    public void notGiveBackRatedOrder() {
        order.setState(StateOrderRate.getInstance());
        assertEquals("Pedido não devolvido", order.giveBack());
    }
    @Test
    public void notRateRatedOrder() {
        order.setState(StateOrderRate.getInstance());
        assertEquals("Pedido não avaliado", order.rate());
    }       
}

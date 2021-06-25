package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderFinishTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
    
    @Test
    public void notRequestFinishedOrder() {
        order.setState(StateOrderFinish.getInstance());
        assertEquals("Pedido não realizado", order.request());
    }
    
    @Test
    public void notCancelFinishedOrder() {
        order.setState(StateOrderFinish.getInstance());
        assertEquals("Pedido não cancelado", order.cancel());
    }
    
    @Test
    public void notFinishFinishedOrder() {
        order.setState(StateOrderFinish.getInstance());
        assertEquals("Pedido não finalizado", order.finish());
    }
    
    @Test
    public void notGiveBackFinishedOrder() {
        order.setState(StateOrderFinish.getInstance());
        assertEquals("Pedido não devolvido", order.giveBack());
    }
    @Test
    public void rateFinishedOrder() {
        order.setState(StateOrderFinish.getInstance());
        assertEquals("Pedido avaliado", order.rate());
    }    
}

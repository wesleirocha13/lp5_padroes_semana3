package state;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderTest {
    
    Order order;
    
    @Before
    public void setUp() {
        order = new Order();
    }
    
    //Order Request
    
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
    
    
    //Order Cancel
    
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

    
    //Order Finish
    
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
    
    
    //Order Give Back
    
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
    
    
    //Order Rate
    
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

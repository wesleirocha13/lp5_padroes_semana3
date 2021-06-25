package state;

/**
 *
 * @author Weslei
 */
public class Order {
    private String id;
    private float value;
    private StateOrder state;    

    public Order() {
        this.state = StateOrderRequest.getInstance();
    }
    
    public String request() {
        return state.request(this);
    }
    
    public String cancel() {
        return state.cancel(this);
    }
    
    public String finish() {
        return state.finish(this);
    }
    
    public String giveBack() {
        return state.giveBack(this);
    }
    
    public String rate() {
        return state.rate(this);
    }    
   
    public String getCurrentState() {
        return state.getState();
    }
    
    public String getId() {
        return id;
    }
    
    public float getValue() {
        return value;
    }
    
    public void setState(StateOrder state) {
        this.state = state;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setValue(float value) {
        this.value = value;
    }  

    public StateOrder getState() {
        return state;
    }  
}

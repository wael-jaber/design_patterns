package behavioral.state;

// ConcreteStateB: Implements behavior specific to State B
public class ConcreteStateB implements State {
    @Override
    public void handleRequest(Context context) {
        System.out.println("ConcreteStateB: Handling request. Switching to ConcreteStateA.");
        context.setState(new ConcreteStateA());
    }
}


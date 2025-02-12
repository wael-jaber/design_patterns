package behavioral.state;

public class ConcreteStateA implements State {
    @Override
    public void handleRequest(Context context) {
        System.out.println("ConcreteStateA: Handling request. Switching to ConcreteStateB.");
        context.setState(new ConcreteStateB());
    }
}


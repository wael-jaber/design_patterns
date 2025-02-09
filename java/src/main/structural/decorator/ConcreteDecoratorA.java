package structural.decorator;

// ConcreteDecoratorA: Adds additional functionality to the component
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("ConcreteDecoratorA: Adding extra behavior.");
    }
}


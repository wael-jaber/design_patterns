package structural.decorator;

// Decorator: The base class for all decorators
public abstract class Decorator implements Component {
    protected final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}


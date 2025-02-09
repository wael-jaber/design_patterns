package structural.decorator;

// ConcreteComponent: The core object that we will decorate
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent: Performing operation.");
    }
}


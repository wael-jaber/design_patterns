package structural.decorator;

// ConcreteDecoratorB: Adds different functionality to the component
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        anotherAddedBehavior();
    }

    private void anotherAddedBehavior() {
        System.out.println("ConcreteDecoratorB: Adding another behavior.");
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Component base = new ConcreteComponent();
//         
//         // Wrap the base component with decorators
//         Component decorated1 = new ConcreteDecoratorA(base);
//         Component decorated2 = new ConcreteDecoratorB(decorated1);
//
//         // Execute operation with all decorations applied
//         decorated2.operation();
//
//         // Expected Output:
//         // ConcreteComponent: Performing operation.
//         // ConcreteDecoratorA: Adding extra behavior.
//         // ConcreteDecoratorB: Adding another behavior.
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Excessive Wrapping:
//    - Mistake: Applying too many decorators, making the call stack unnecessarily deep.
//    - Fix: Limit decoration to essential features.
//
// 2. Ignoring Base Class Responsibilities:
//    - Mistake: Not calling `super.operation()` in decorators, breaking expected behavior.
//    - Fix: Always call `super.operation()` unless explicitly overriding behavior.
//
// 3. Confusing Inheritance with Composition:
//    - Mistake: Using subclassing instead of decorators to add behavior.
//    - Fix: Favor composition (wrapping objects) over inheritance to keep code flexible.
//
// 4. Breaking Encapsulation:
//    - Mistake: Exposing concrete decorators in the client code, leading to dependency on specific implementations.
//    - Fix: Use the `Component` interface so that clients remain unaware of the specific decorators applied.


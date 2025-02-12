package behavioral.strategy;

// Context: Maintains a reference to a strategy object
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Context context = new Context(new ConcreteStrategyAdd());
//
//         System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
//
//         context.setStrategy(new ConcreteStrategySubtract());
//         System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
//
//         context.setStrategy(new ConcreteStrategyMultiply());
//         System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
//
//         // Expected Output:
//         // 10 + 5 = 15
//         // 10 - 5 = 5
//         // 10 * 5 = 50
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Using `if-else` Instead of Strategy Pattern:
//    - Mistake: Using multiple `if-else` statements instead of defining separate strategy classes.
//    - Fix: Use separate concrete strategy classes to follow the open-closed principle.
//
// 2. Allowing Context to Depend on Concrete Strategies:
//    - Mistake: Creating strategies inside the `Context` class.
//    - Fix: Inject strategies via constructor or setter methods.
//
// 3. Modifying Strategies Instead of Creating New Ones:
//    - Mistake: Mutating existing strategies instead of switching them.
//    - Fix: Use `setStrategy()` to swap strategy implementations at runtime.
//
// 4. Overusing the Strategy Pattern:
//    - Mistake: Applying Strategy when a simple function reference would be enough.
//    - Fix: Use Strategy Pattern only when multiple interchangeable behaviors are required.


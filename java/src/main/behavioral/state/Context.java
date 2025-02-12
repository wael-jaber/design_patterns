package behavioral.state;

// Context: Maintains an instance of a State subclass
public class Context {
    private State currentState;

    public Context() {
        this.currentState = new ConcreteStateA(); // Default state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handleRequest(this);
    }

    public State getCurrentState() {
        return currentState;
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Context context = new Context();
//
//         context.request(); // Switches from A to B
//         context.request(); // Switches from B to A
//         context.request(); // Switches from A to B again
//
//         // Expected Output:
//         // ConcreteStateA: Handling request. Switching to ConcreteStateB.
//         // ConcreteStateB: Handling request. Switching to ConcreteStateA.
//         // ConcreteStateA: Handling request. Switching to ConcreteStateB.
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Forgetting to Update the Context's State:
//    - Mistake: Calling handleRequest() without updating the state.
//    - Fix: Ensure state transitions are correctly implemented.
//
// 2. Allowing Context to Depend on Specific State Implementations:
//    - Mistake: Directly referencing `ConcreteStateA` or `ConcreteStateB` in `Context`.
//    - Fix: Use `State` interface for flexibility.
//
// 3. Not Defining a Default State:
//    - Mistake: Context starts with a `null` state, leading to `NullPointerException`.
//    - Fix: Initialize context with a valid default state.
//
// 4. Overcomplicating Simple Conditionals:
//    - Mistake: Using the State pattern when simple `if-else` logic would suffice.
//    - Fix: Use the pattern when behavior truly varies by state.


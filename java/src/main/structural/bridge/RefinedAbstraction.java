package structural.bridge;

// RefinedAbstraction: Extends Abstraction and defines more specific operations
public class RefinedAbstraction extends Abstraction {
    
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction: Delegating to implementation.");
        implementor.operationImplementation();
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Implementor implA = new ConcreteImplementorA();
//         Implementor implB = new ConcreteImplementorB();
//
//         Abstraction abstractionA = new RefinedAbstraction(implA);
//         Abstraction abstractionB = new RefinedAbstraction(implB);
//
//         // Using the abstraction with different implementations
//         abstractionA.operation();
//         abstractionB.operation();
//
//         // Expected Output:
//         // RefinedAbstraction: Delegating to implementation.
//         // ConcreteImplementorA: Performing operation implementation.
//         // RefinedAbstraction: Delegating to implementation.
//         // ConcreteImplementorB: Performing operation implementation.
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Not Using Abstraction Properly:
//    - Mistake: Using only one abstraction class without extending it.
//    - Fix: Extend `Abstraction` to create refined versions for different use cases.
//
// 2. Tight Coupling Between Abstraction and Implementation:
//    - Mistake: Directly referencing concrete implementors in the abstraction.
//    - Fix: Always use the `Implementor` interface to maintain loose coupling.
//
// 3. Overcomplicating the Bridge:
//    - Mistake: Adding unnecessary complexity when a simple interface would suffice.
//    - Fix: Use the Bridge Pattern only when multiple independent variations are needed.
//
// 4. Ignoring Dependency Injection:
//    - Mistake: Creating an implementor inside the abstraction instead of injecting it.
//    - Fix: Pass the `Implementor` as a dependency via the constructor.


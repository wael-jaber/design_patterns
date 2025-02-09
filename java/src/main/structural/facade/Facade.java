package structural.facade;

// Facade: Provides a simplified interface to the complex subsystem
public class Facade {
    private final SubsystemA subsystemA;
    private final SubsystemB subsystemB;
    private final SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public void simpleOperation() {
        System.out.println("Facade: Coordinating operations...");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
        System.out.println("Facade: Operation completed.");
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Facade facade = new Facade();
//         
//         // The client interacts with the Facade instead of the complex subsystem
//         facade.simpleOperation();
//
//         // Expected Output:
//         // Facade: Coordinating operations...
//         // SubsystemA: Performing operation A.
//         // SubsystemB: Performing operation B.
//         // SubsystemC: Performing operation C.
//         // Facade: Operation completed.
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Overcomplicating the Facade:
//    - Mistake: Adding unnecessary logic inside the Facade, making it a bottleneck.
//    - Fix: Keep the Facade focused on delegating tasks to subsystems.
//
// 2. Ignoring Direct Access to Subsystems:
//    - Mistake: Clients still use subsystems directly, defeating the purpose of the Facade.
//    - Fix: Encourage all interactions through the Facade.
//
// 3. Breaking Encapsulation:
//    - Mistake: Exposing internal details of the subsystems in the Facade.
//    - Fix: Keep the Facade's interface simple and hide implementation details.
//
// 4. Making Facade a Monolithic Class:
//    - Mistake: Facade grows too large and becomes difficult to maintain.
//    - Fix: Split responsibilities into multiple smaller facades if needed.


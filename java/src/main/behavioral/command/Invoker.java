package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// Invoker: Maintains a queue of commands and executes them
public class Invoker {
    private final List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Receiver receiver = new Receiver();
//         Command command = new ConcreteCommand(receiver);
//
//         Invoker invoker = new Invoker();
//         invoker.addCommand(command);
//
//         // Execute all queued commands
//         invoker.executeCommands();
//
//         // Expected Output:
//         // ConcreteCommand: Executing command.
//         // Receiver: Performing an action.
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Storing Too Many Commands in Memory:
//    - Mistake: Keeping executed commands indefinitely in a queue.
//    - Fix: Clear commands after execution if they are no longer needed.
//
// 2. Forgetting to Execute Commands:
//    - Mistake: Adding commands to the invoker but never executing them.
//    - Fix: Ensure `executeCommands()` is called at the appropriate time.
//
// 3. Making Commands Dependent on Specific Receivers:
//    - Mistake: Hardcoding receiver logic inside the command.
//    - Fix: Pass receivers dynamically to allow flexibility.
//
// 4. Overcomplicating Simple Tasks:
//    - Mistake: Using the Command pattern when a simple function reference would suffice.
//    - Fix: Use this pattern only when decoupling commands and receivers is beneficial.


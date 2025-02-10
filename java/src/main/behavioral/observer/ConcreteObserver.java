package behavioral.observer;

// ConcreteObserver: Implements the Observer interface and reacts to state changes
public class ConcreteObserver implements Observer {
    private final String name;
    private String lastReceivedMessage;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        lastReceivedMessage = message;
        System.out.println(name + " received update: " + message);
    }

    public String getLastReceivedMessage() {
        return lastReceivedMessage;
    }
}
// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         ConcreteSubject subject = new ConcreteSubject();
//
//         Observer observer1 = new ConcreteObserver("Observer 1");
//         Observer observer2 = new ConcreteObserver("Observer 2");
//
//         // Attach observers
//         subject.attach(observer1);
//         subject.attach(observer2);
//
//         // Change state and notify observers
//         subject.setState("New State 1");
//
//         // Detach an observer and update state again
//         subject.detach(observer1);
//         subject.setState("New State 2");
//
//         // Expected Output:
//         // Observer 1 received update: New State 1
//         // Observer 2 received update: New State 1
//         // Observer 2 received update: New State 2
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Forgetting to Remove Observers:
//    - Mistake: Not detaching observers when they are no longer needed.
//    - Fix: Always call `detach()` when an observer should stop receiving updates.
//
// 2. Circular Dependencies:
//    - Mistake: An observer modifying the subject, triggering infinite updates.
//    - Fix: Ensure observers do not modify the subject directly inside `update()`.
//
// 3. Performance Issues with Many Observers:
//    - Mistake: Having too many observers, slowing down notifications.
//    - Fix: Optimize notification mechanisms or use event filtering.
//
// 4. Not Handling Null or Inactive Observers:
//    - Mistake: Forgetting to check for removed or null observers before notifying.
//    - Fix: Ensure observers are properly tracked in a `List<Observer>` with validation.


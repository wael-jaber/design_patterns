package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// ConcreteMediator: Manages communication between colleagues
public class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         ConcreteMediator mediator = new ConcreteMediator();
//
//         ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
//         ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
//
//         mediator.registerColleague(colleagueA);
//         mediator.registerColleague(colleagueB);
//
//         colleagueA.send("Hello from A!");
//         colleagueB.send("Hi A, this is B!");
//
//         // Expected Output:
//         // ConcreteColleagueA: Sending message -> Hello from A!
//         // ConcreteColleagueB received message: Hello from A!
//         // ConcreteColleagueB: Sending message -> Hi A, this is B!
//         // ConcreteColleagueA received message: Hi A, this is B!
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Overcomplicating the Mediator Logic:
//    - Mistake: Adding too much logic inside the mediator.
//    - Fix: Keep the mediator focused on communication, not business logic.
//
// 2. Tight Coupling Between Mediator and Colleagues:
//    - Mistake: The mediator and colleagues being too dependent on each other.
//    - Fix: Use interfaces to decouple implementations.
//
// 3. Not Managing Colleague Registration Properly:
//    - Mistake: Forgetting to register colleagues with the mediator.
//    - Fix: Always register colleagues before they send messages.
//
// 4. Inefficient Broadcasting:
//    - Mistake: Sending messages to all colleagues unnecessarily.
//    - Fix: Filter recipients properly to avoid unnecessary message processing.


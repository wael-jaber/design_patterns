package behavioral.chainofresponsibility;

// ConcreteHandlerC: Handles certain requests and passes the rest
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("C")) {
            System.out.println("ConcreteHandlerC handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler could process request: " + request);
        }
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Handler handlerA = new ConcreteHandlerA();
//         Handler handlerB = new ConcreteHandlerB();
//         Handler handlerC = new ConcreteHandlerC();
//
//         handlerA.setNextHandler(handlerB);
//         handlerB.setNextHandler(handlerC);
//
//         // Requests processed by handlers
//         handlerA.handleRequest("A"); // Handled by A
//         handlerA.handleRequest("B"); // Handled by B
//         handlerA.handleRequest("C"); // Handled by C
//         handlerA.handleRequest("D"); // No handler available
//
//         // Expected Output:
//         // ConcreteHandlerA handled request: A
//         // ConcreteHandlerB handled request: B
//         // ConcreteHandlerC handled request: C
//         // No handler could process request: D
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Forgetting to Set Next Handlers:
//    - Mistake: Calling `handleRequest()` without linking handlers together.
//    - Fix: Always use `setNextHandler()` to form a proper chain.
//
// 2. Infinite Loops in Chains:
//    - Mistake: A handler incorrectly sets itself as the next handler, creating an infinite loop.
//    - Fix: Ensure that `setNextHandler()` does not point back to the same handler.
//
// 3. Not Providing a Default Handler:
//    - Mistake: A request that no handler can process results in unexpected behavior.
//    - Fix: Always provide a base case to handle unprocessable requests.
//
// 4. Overcomplicating the Chain:
//    - Mistake: Using too many handlers for simple cases.
//    - Fix: Use the pattern only when request delegation needs flexibility.


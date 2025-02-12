package behavioral.chainofresponsibility;

// ConcreteHandlerA: Handles certain requests and passes the rest
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("A")) {
            System.out.println("ConcreteHandlerA handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler could process request: " + request);
        }
    }
}


package behavioral.chainofresponsibility;

// ConcreteHandlerB: Handles certain requests and passes the rest
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("B")) {
            System.out.println("ConcreteHandlerB handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler could process request: " + request);
        }
    }
}


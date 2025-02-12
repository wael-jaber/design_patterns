package behavioral.mediator;

// Mediator: Defines an interface for communication between Colleagues
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}


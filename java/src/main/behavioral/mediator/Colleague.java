package behavioral.mediator;

// Colleague: Represents objects that communicate via the mediator
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);
}


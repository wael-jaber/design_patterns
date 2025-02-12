package behavioral.command;

// ConcreteCommand: Implements the Command interface and calls the receiver
public class ConcreteCommand implements Command {
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand: Executing command.");
        receiver.action();
    }
}


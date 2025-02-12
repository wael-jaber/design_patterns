package behavioral.mediator;

// ConcreteColleagueB: Another specific Colleague that communicates via the Mediator
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("ConcreteColleagueB: Sending message -> " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleagueB received message: " + message);
    }
}


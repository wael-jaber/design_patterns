package behavioral.mediator;

// ConcreteColleagueA: A specific Colleague that communicates via the Mediator
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("ConcreteColleagueA: Sending message -> " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleagueA received message: " + message);
    }
}


package behavioral.observer;

// ConcreteSubject: Maintains state and notifies observers of changes
public class ConcreteSubject extends Subject {
    private String state;

    public void setState(String state) {
        this.state = state;
        notifyObservers(state);
    }

    public String getState() {
        return state;
    }
}


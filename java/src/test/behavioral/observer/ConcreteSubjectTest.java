package behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConcreteSubjectTest {
    private ConcreteSubject subject;
    private ConcreteObserver observer1;
    private ConcreteObserver observer2;

    @BeforeEach
    void setUp() {
        subject = new ConcreteSubject();
        observer1 = new ConcreteObserver("Observer 1");
        observer2 = new ConcreteObserver("Observer 2");
    }

    @Test
    void testAttachAndNotifyObservers() {
        // Attach observers
        subject.attach(observer1);
        subject.attach(observer2);

        // Update subject state
        subject.setState("New State");

        // Verify that all observers received the update
        assertEquals("New State", observer1.getLastReceivedMessage(),
                "Observer 1 should receive the correct message.");
        assertEquals("New State", observer2.getLastReceivedMessage(),
                "Observer 2 should receive the correct message.");
    }

    @Test
    void testDetachObserver() {
        // Attach and then detach an observer
        subject.attach(observer1);
        subject.attach(observer2);
        subject.detach(observer1);

        // Update subject state
        subject.setState("Updated State");

        // Observer 1 should not receive the update
        assertNull(observer1.getLastReceivedMessage(),
                "Detached Observer 1 should not receive updates.");

        // Observer 2 should still receive the update
        assertEquals("Updated State", observer2.getLastReceivedMessage(),
                "Observer 2 should still receive updates.");
    }

    @Test
    void testMultipleStateChanges() {
        // Attach observers
        subject.attach(observer1);
        subject.attach(observer2);

        // Update state multiple times
        subject.setState("State 1");
        subject.setState("State 2");

        // Verify that the latest state is received
        assertEquals("State 2", observer1.getLastReceivedMessage(),
                "Observer 1 should receive the latest message.");
        assertEquals("State 2", observer2.getLastReceivedMessage(),
                "Observer 2 should receive the latest message.");
    }

    @Test
    void testNoObserversAttached() {
        // Update state without attaching observers
        subject.setState("Orphan State");

        // No exception should be thrown, and nothing should be updated
        assertEquals("Orphan State", subject.getState(),
                "Subject state should update even without observers.");
    }
}


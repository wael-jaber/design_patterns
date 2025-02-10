package behavioral.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcreteObserverTest {

    @Test
    void testObserverReceivesUpdate() {
        // Create an observer
        ConcreteObserver observer = new ConcreteObserver("TestObserver");

        // Simulate an update
        observer.update("Test Message");

        // Verify that the observer received the correct message
        assertEquals("Test Message", observer.getLastReceivedMessage(),
                "Observer should receive the correct message.");
    }

    @Test
    void testMultipleUpdates() {
        // Create an observer
        ConcreteObserver observer = new ConcreteObserver("TestObserver");

        // Send multiple updates
        observer.update("First Update");
        observer.update("Second Update");

        // Verify that the last received message is correct
        assertEquals("Second Update", observer.getLastReceivedMessage(),
                "Observer should store the latest received message.");
    }
}


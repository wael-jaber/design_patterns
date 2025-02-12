package behavioral.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteStateBTest {

    @Test
    void testConcreteStateBHandlesRequestAndChangesState() {
        // Initialize context and set it to ConcreteStateB
        Context context = new Context();
        context.request(); // Switch to ConcreteStateB
        State initialState = context.getCurrentState();

        // Execute request (should switch to ConcreteStateA)
        context.request();

        // Verify state transition
        assertTrue(initialState instanceof ConcreteStateB, "Initial state should be ConcreteStateB.");
        assertTrue(context.getCurrentState() instanceof ConcreteStateA, "State should switch to ConcreteStateA.");
    }
}


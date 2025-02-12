package behavioral.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteStateATest {

    @Test
    void testConcreteStateAHandlesRequestAndChangesState() {
        // Initialize context and set it to ConcreteStateA
        Context context = new Context();
        State initialState = context.getCurrentState();

        // Execute request (should switch to ConcreteStateB)
        context.request();

        // Verify state transition
        assertTrue(initialState instanceof ConcreteStateA, "Initial state should be ConcreteStateA.");
        assertTrue(context.getCurrentState() instanceof ConcreteStateB, "State should switch to ConcreteStateB.");
    }
}


package behavioral.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContextTest {
    private Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
    }

    @Test
    void testContextStartsWithConcreteStateA() {
        assertTrue(context.getCurrentState() instanceof ConcreteStateA, 
                "Context should initialize with ConcreteStateA.");
    }

    @Test
    void testContextStateTransitions() {
        // Initial state should be ConcreteStateA
        assertTrue(context.getCurrentState() instanceof ConcreteStateA, "Initial state should be ConcreteStateA.");

        // Switch to ConcreteStateB
        context.request();
        assertTrue(context.getCurrentState() instanceof ConcreteStateB, "State should switch to ConcreteStateB.");

        // Switch back to ConcreteStateA
        context.request();
        assertTrue(context.getCurrentState() instanceof ConcreteStateA, "State should switch back to ConcreteStateA.");
    }

    @Test
    void testMultipleStateTransitions() {
        // Initial state should be ConcreteStateA
        assertTrue(context.getCurrentState() instanceof ConcreteStateA, "Initial state should be ConcreteStateA.");

        // Switch states multiple times
        context.request(); // A -> B
        context.request(); // B -> A
        context.request(); // A -> B

        // Verify final state
        assertTrue(context.getCurrentState() instanceof ConcreteStateB, "Final state should be ConcreteStateB.");
    }
}


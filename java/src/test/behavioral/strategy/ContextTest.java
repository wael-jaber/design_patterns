package behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextTest {
    private Context context;

    @BeforeEach
    void setUp() {
        // Initialize the context with a default strategy
        context = new Context(new ConcreteStrategyAdd());
    }

    @Test
    void testContextWithAdditionStrategy() {
        int result = context.executeStrategy(10, 5);
        assertEquals(15, result, "Context should correctly execute addition strategy.");
    }

    @Test
    void testContextWithSubtractionStrategy() {
        context.setStrategy(new ConcreteStrategySubtract());
        int result = context.executeStrategy(10, 5);
        assertEquals(5, result, "Context should correctly execute subtraction strategy.");
    }

    @Test
    void testContextWithMultiplicationStrategy() {
        context.setStrategy(new ConcreteStrategyMultiply());
        int result = context.executeStrategy(10, 5);
        assertEquals(50, result, "Context should correctly execute multiplication strategy.");
    }

    @Test
    void testContextStrategySwitching() {
        context.setStrategy(new ConcreteStrategySubtract());
        assertEquals(5, context.executeStrategy(10, 5), "Context should correctly execute subtraction after switching.");

        context.setStrategy(new ConcreteStrategyMultiply());
        assertEquals(50, context.executeStrategy(10, 5), "Context should correctly execute multiplication after switching.");
    }
}


package behavioral.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcreteStrategySubtractTest {

    @Test
    void testSubtractionStrategy() {
        Strategy strategy = new ConcreteStrategySubtract();
        int result = strategy.execute(10, 5);
        
        assertEquals(5, result, "ConcreteStrategySubtract should correctly subtract two numbers.");
    }
}


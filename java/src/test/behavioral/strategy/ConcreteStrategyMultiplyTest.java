package behavioral.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcreteStrategyMultiplyTest {

    @Test
    void testMultiplicationStrategy() {
        Strategy strategy = new ConcreteStrategyMultiply();
        int result = strategy.execute(10, 5);
        
        assertEquals(50, result, "ConcreteStrategyMultiply should correctly multiply two numbers.");
    }
}


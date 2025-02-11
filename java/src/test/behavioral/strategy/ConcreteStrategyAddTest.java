package behavioral.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcreteStrategyAddTest {

    @Test
    void testAdditionStrategy() {
        Strategy strategy = new ConcreteStrategyAdd();
        int result = strategy.execute(10, 5);
        
        assertEquals(15, result, "ConcreteStrategyAdd should correctly add two numbers.");
    }
}


package creational.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryProducerTest {

    @Test
    void testGetFactoryA() {
        AbstractFactory factory = FactoryProducer.getFactory(FactoryType.FACTORY_A);
        assertNotNull(factory, "FactoryProducer should return a valid factory.");
        assertTrue(factory instanceof ConcreteFactoryA, "FactoryProducer should return an instance of ConcreteFactoryA.");
    }

    @Test
    void testGetFactoryB() {
        AbstractFactory factory = FactoryProducer.getFactory(FactoryType.FACTORY_B);
        assertNotNull(factory, "FactoryProducer should return a valid factory.");
        assertTrue(factory instanceof ConcreteFactoryB, "FactoryProducer should return an instance of ConcreteFactoryB.");
    }

    @Test
    void testInvalidFactoryType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactoryProducer.getFactory(null);
        });

        assertEquals("Factory type cannot be null", exception.getMessage());
    }
}

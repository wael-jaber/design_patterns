package creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteProductATest {

    @Test
    void testUseMethod() {
        Product product = new ConcreteProductA();
        assertNotNull(product, "ConcreteProductA should be instantiated.");
        assertDoesNotThrow(product::use, "Calling 'use' on ConcreteProductA should not throw an exception.");
    }
}

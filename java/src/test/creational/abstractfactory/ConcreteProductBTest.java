package creational.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteProductBTest {

    @Test
    void testUseMethod() {
        Product product = new ConcreteProductB();
        assertNotNull(product, "ConcreteProductB should be instantiated.");
        assertDoesNotThrow(product::use, "Calling 'use' on ConcreteProductB should not throw an exception.");
    }
}

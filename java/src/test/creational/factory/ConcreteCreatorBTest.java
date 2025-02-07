package creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteCreatorBTest {

    @Test
    void testCreateProduct() {
        Creator creator = new ConcreteCreatorB();
        Product product = creator.createProduct();

        assertNotNull(product, "ConcreteCreatorB should return a product.");
        assertTrue(product instanceof ConcreteProductB, "ConcreteCreatorB should create ConcreteProductB.");
    }
}

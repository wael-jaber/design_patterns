package creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteCreatorATest {

    @Test
    void testCreateProduct() {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.createProduct();

        assertNotNull(product, "ConcreteCreatorA should return a product.");
        assertTrue(product instanceof ConcreteProductA, "ConcreteCreatorA should create ConcreteProductA.");
    }
}

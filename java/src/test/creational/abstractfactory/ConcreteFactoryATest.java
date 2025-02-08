package creational.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteFactoryATest {

    @Test
    void testCreateProductA() {
        AbstractFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct(ProductType.A);

        assertNotNull(product, "ConcreteFactoryA should return a product.");
        assertTrue(product instanceof ConcreteProductA, "ConcreteFactoryA should create ConcreteProductA.");
    }

    @Test
    void testInvalidProductType() {
        AbstractFactory factory = new ConcreteFactoryA();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct(ProductType.B);
        });

        assertEquals("Factory A cannot create Product B", exception.getMessage());
    }
}

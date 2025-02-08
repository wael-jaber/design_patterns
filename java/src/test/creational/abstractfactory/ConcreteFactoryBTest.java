package creational.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteFactoryBTest {

    @Test
    void testCreateProductB() {
        AbstractFactory factory = new ConcreteFactoryB();
        Product product = factory.createProduct(ProductType.B);

        assertNotNull(product, "ConcreteFactoryB should return a product.");
        assertTrue(product instanceof ConcreteProductB, "ConcreteFactoryB should create ConcreteProductB.");
    }

    @Test
    void testInvalidProductType() {
        AbstractFactory factory = new ConcreteFactoryB();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct(ProductType.A);
        });

        assertEquals("Factory B cannot create Product A", exception.getMessage());
    }
}

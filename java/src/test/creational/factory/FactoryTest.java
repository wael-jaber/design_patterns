package creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void testCreateProductA() {
        Product product = Factory.createProduct(ProductType.A);
        assertNotNull(product, "Factory should return a valid product.");
        assertTrue(product instanceof ConcreteProductA, "Factory should return an instance of ConcreteProductA.");
    }

    @Test
    void testCreateProductB() {
        Product product = Factory.createProduct(ProductType.B);
        assertNotNull(product, "Factory should return a valid product.");
        assertTrue(product instanceof ConcreteProductB, "Factory should return an instance of ConcreteProductB.");
    }

    @Test
    void testInvalidProductType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factory.createProduct(null);
        });

        assertEquals("Product type cannot be null", exception.getMessage());
    }
}

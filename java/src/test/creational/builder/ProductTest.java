package creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testProductInitialization() {
        Product product = new ProductBuilder()
                .setPartA("Test A")
                .setPartB("Test B")
                .setPartC(123)
                .build();

        assertNotNull(product, "Product should be created successfully.");
        assertEquals("Test A", product.getPartA(), "Part A should be correctly assigned.");
        assertEquals("Test B", product.getPartB(), "Part B should be correctly assigned.");
        assertEquals(123, product.getPartC(), "Part C should be correctly assigned.");
    }

    @Test
    void testProductImmutability() {
        Product product = new ProductBuilder()
                .setPartA("Immutable A")
                .setPartB("Immutable B")
                .setPartC(500)
                .build();

        // Verify product values are correct
        assertEquals("Immutable A", product.getPartA());
        assertEquals("Immutable B", product.getPartB());
        assertEquals(500, product.getPartC());

        // Ensure the builder does not modify the product after building
        Product anotherProduct = new ProductBuilder()
                .setPartA("New A")
                .setPartB("New B")
                .setPartC(999)
                .build();

        assertNotEquals(product, anotherProduct, "Each build should create a new Product instance.");
    }
}

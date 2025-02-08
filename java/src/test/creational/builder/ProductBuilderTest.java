package creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductBuilderTest {

    @Test
    void testBuilderChaining() {
        ProductBuilder builder = new ProductBuilder()
                .setPartA("Chained A")
                .setPartB("Chained B")
                .setPartC(300);

        Product product = builder.build();

        assertNotNull(product, "Product should be built successfully.");
        assertEquals("Chained A", product.getPartA(), "Part A should be set via chaining.");
        assertEquals("Chained B", product.getPartB(), "Part B should be set via chaining.");
        assertEquals(300, product.getPartC(), "Part C should be set via chaining.");
    }

    @Test
    void testBuilderDefaultValues() {
        Product product = new ProductBuilder().build();

        // Default values should be null or 0 since they are not explicitly set
        assertNull(product.getPartA(), "Part A should be null by default.");
        assertNull(product.getPartB(), "Part B should be null by default.");
        assertEquals(0, product.getPartC(), "Part C should be 0 by default.");
    }
}

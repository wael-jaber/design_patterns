package creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DirectorTest {

    @Test
    void testConstructBasicProduct() {
        Director director = new Director();
        Product product = director.constructBasicProduct(new ProductBuilder());

        assertNotNull(product, "Director should create a product.");
        assertEquals("Default A", product.getPartA(), "Part A should have default value.");
        assertEquals("Default B", product.getPartB(), "Part B should have default value.");
        assertEquals(100, product.getPartC(), "Part C should have default value.");
    }

    @Test
    void testConstructCustomProduct() {
        Director director = new Director();
        Product product = director.constructCustomProduct(new ProductBuilder(), "Custom A", "Custom B", 250);

        assertNotNull(product, "Director should create a custom product.");
        assertEquals("Custom A", product.getPartA(), "Custom Part A should be set correctly.");
        assertEquals("Custom B", product.getPartB(), "Custom Part B should be set correctly.");
        assertEquals(250, product.getPartC(), "Custom Part C should be set correctly.");
    }
}

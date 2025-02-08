package creational.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcretePrototypeTest {

    @Test
    void testCloneCreatesNewInstance() {
        ConcretePrototype original = new ConcretePrototype("Original", 100);
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        assertNotNull(clone, "Cloned object should not be null.");
        assertNotSame(original, clone, "Cloned object should be a new instance.");
    }

    @Test
    void testCloneRetainsOriginalValues() {
        ConcretePrototype original = new ConcretePrototype("Original", 100);
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        assertEquals("Original", clone.getName(), "Cloned object should retain the original name.");
        assertEquals(100, clone.getValue(), "Cloned object should retain the original value.");
    }

    @Test
    void testModifyingCloneDoesNotAffectOriginal() {
        ConcretePrototype original = new ConcretePrototype("Original", 100);
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        // Modify the clone
        clone.setName("Modified Clone");
        clone.setValue(200);

        // Ensure the original object is unchanged
        assertEquals("Original", original.getName(), "Original object should remain unchanged.");
        assertEquals(100, original.getValue(), "Original object should retain its value.");
        assertEquals("Modified Clone", clone.getName(), "Clone should have the modified name.");
        assertEquals(200, clone.getValue(), "Clone should have the modified value.");
    }

    @Test
    void testCloningWithNullFields() {
        ConcretePrototype original = new ConcretePrototype(null, 0);
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        assertNull(clone.getName(), "Cloned object should have a null name if the original has it.");
        assertEquals(0, clone.getValue(), "Cloned object should retain zero value if the original has it.");
    }

    @Test
    void testCloningPerformance() {
        ConcretePrototype original = new ConcretePrototype("Performance Test", 999);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ConcretePrototype clone = (ConcretePrototype) original.clone();
            assertNotNull(clone, "Cloned object should not be null.");
        }
        long endTime = System.nanoTime();

        System.out.println("Cloning 1,000,000 objects took: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

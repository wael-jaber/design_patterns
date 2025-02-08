package structural.composite;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompositeTest {

    @Test
    void testCompositeOperationWithChildren() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create leaves
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        // Create a composite and add leaves
        Composite composite = new Composite("Composite 1");
        composite.add(leaf1);
        composite.add(leaf2);

        // Perform operation
        composite.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Composite: Composite 1 is performing an operation."),
                "Composite should perform its own operation.");
        assertTrue(output.contains("Leaf: Leaf 1 is performing an operation."),
                "Composite should delegate operation to its child Leaf 1.");
        assertTrue(output.contains("Leaf: Leaf 2 is performing an operation."),
                "Composite should delegate operation to its child Leaf 2.");
    }

    @Test
    void testCompositeRemoveChild() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create leaves
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        // Create a composite and add leaves
        Composite composite = new Composite("Composite 1");
        composite.add(leaf1);
        composite.add(leaf2);

        // Remove a leaf and perform operation
        composite.remove(leaf1);
        composite.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Composite: Composite 1 is performing an operation."),
                "Composite should perform its own operation.");
        assertTrue(output.contains("Leaf: Leaf 2 is performing an operation."),
                "Composite should delegate operation to its remaining child Leaf 2.");
        assertTrue(!output.contains("Leaf: Leaf 1 is performing an operation."),
                "Removed Leaf 1 should not perform any operation.");
    }

    @Test
    void testCompositeWithNestedComposites() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create leaves
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        // Create a nested composite
        Composite nestedComposite = new Composite("Nested Composite");
        nestedComposite.add(leaf1);
        nestedComposite.add(leaf2);

        // Create a root composite and add the nested composite
        Composite rootComposite = new Composite("Root Composite");
        rootComposite.add(nestedComposite);
        rootComposite.add(new Leaf("Leaf 3"));

        // Perform operation
        rootComposite.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Composite: Root Composite is performing an operation."),
                "Root Composite should perform its own operation.");
        assertTrue(output.contains("Composite: Nested Composite is performing an operation."),
                "Root Composite should delegate operation to its child Nested Composite.");
        assertTrue(output.contains("Leaf: Leaf 1 is performing an operation."),
                "Nested Composite should delegate operation to its child Leaf 1.");
        assertTrue(output.contains("Leaf: Leaf 2 is performing an operation."),
                "Nested Composite should delegate operation to its child Leaf 2.");
        assertTrue(output.contains("Leaf: Leaf 3 is performing an operation."),
                "Root Composite should delegate operation to its child Leaf 3.");
    }
}


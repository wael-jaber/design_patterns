package structural.composite;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeafTest {

    @Test
    void testLeafOperation() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test a leaf
        Leaf leaf = new Leaf("Leaf 1");
        leaf.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Leaf: Leaf 1 is performing an operation."),
                "Leaf's operation should print the correct message.");
    }
}


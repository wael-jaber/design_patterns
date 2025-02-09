package structural.bridge;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImplementorTest {

    @Test
    void testConcreteImplementorA() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test ConcreteImplementorA
        Implementor implementorA = new ConcreteImplementorA();
        implementorA.operationImplementation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteImplementorA: Performing operation implementation."),
                "ConcreteImplementorA should perform its operation correctly.");
    }

    @Test
    void testConcreteImplementorB() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test ConcreteImplementorB
        Implementor implementorB = new ConcreteImplementorB();
        implementorB.operationImplementation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteImplementorB: Performing operation implementation."),
                "ConcreteImplementorB should perform its operation correctly.");
    }
}


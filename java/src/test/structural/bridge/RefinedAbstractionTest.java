package structural.bridge;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RefinedAbstractionTest {

    @Test
    void testRefinedAbstractionWithConcreteImplementorA() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create an abstraction with ConcreteImplementorA
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementorA);
        abstraction.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("RefinedAbstraction: Delegating to implementation."),
                "RefinedAbstraction should delegate operation.");
        assertTrue(output.contains("ConcreteImplementorA: Performing operation implementation."),
                "ConcreteImplementorA should handle the operation implementation.");
    }

    @Test
    void testRefinedAbstractionWithConcreteImplementorB() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create an abstraction with ConcreteImplementorB
        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstraction = new RefinedAbstraction(implementorB);
        abstraction.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("RefinedAbstraction: Delegating to implementation."),
                "RefinedAbstraction should delegate operation.");
        assertTrue(output.contains("ConcreteImplementorB: Performing operation implementation."),
                "ConcreteImplementorB should handle the operation implementation.");
    }
}


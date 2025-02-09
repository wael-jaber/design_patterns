package structural.decorator;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteDecoratorATest {

    @Test
    void testConcreteDecoratorAOperation() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create a decorated component
        Component base = new ConcreteComponent();
        Component decoratorA = new ConcreteDecoratorA(base);
        decoratorA.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteComponent: Performing operation."),
                "DecoratorA should call the base component operation.");
        assertTrue(output.contains("ConcreteDecoratorA: Adding extra behavior."),
                "DecoratorA should add its own behavior.");
    }
}


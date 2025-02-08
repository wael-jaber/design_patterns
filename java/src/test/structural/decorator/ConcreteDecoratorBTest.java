package structural.decorator;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteDecoratorBTest {

    @Test
    void testConcreteDecoratorBOperation() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create a decorated component
        Component base = new ConcreteComponent();
        Component decoratorB = new ConcreteDecoratorB(base);
        decoratorB.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteComponent: Performing operation."),
                "DecoratorB should call the base component operation.");
        assertTrue(output.contains("ConcreteDecoratorB: Adding another behavior."),
                "DecoratorB should add its own behavior.");
    }
}


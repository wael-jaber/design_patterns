package structural.decorator;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombinedDecoratorTest {

    @Test
    void testMultipleDecorators() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create a base component
        Component base = new ConcreteComponent();

        // Apply multiple decorators
        Component decoratorA = new ConcreteDecoratorA(base);
        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteComponent: Performing operation."),
                "Base component should perform its operation.");
        assertTrue(output.contains("ConcreteDecoratorA: Adding extra behavior."),
                "DecoratorA should add its behavior.");
        assertTrue(output.contains("ConcreteDecoratorB: Adding another behavior."),
                "DecoratorB should add its behavior.");
    }
}


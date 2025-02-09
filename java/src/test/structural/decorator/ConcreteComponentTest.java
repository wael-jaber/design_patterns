package structural.decorator;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteComponentTest {

    @Test
    void testConcreteComponentOperation() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and execute ConcreteComponent
        Component component = new ConcreteComponent();
        component.operation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteComponent: Performing operation."),
                "ConcreteComponent should perform its operation correctly.");
    }
}


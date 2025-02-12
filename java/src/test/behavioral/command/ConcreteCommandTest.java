package behavioral.command;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteCommandTest {

    @Test
    void testConcreteCommandExecution() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create receiver and command
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        command.execute();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteCommand: Executing command."),
                "ConcreteCommand should log execution.");
        assertTrue(output.contains("Receiver: Performing an action."),
                "ConcreteCommand should call receiver's action.");
    }
}


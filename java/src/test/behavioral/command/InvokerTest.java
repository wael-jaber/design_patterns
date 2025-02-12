package behavioral.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvokerTest {
    private Invoker invoker;
    private Receiver receiver;
    private Command command;

    @BeforeEach
    void setUp() {
        invoker = new Invoker();
        receiver = new Receiver();
        command = new ConcreteCommand(receiver);
    }

    @Test
    void testInvokerStoresAndExecutesCommand() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Add and execute command
        invoker.addCommand(command);
        invoker.executeCommands();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteCommand: Executing command."),
                "Invoker should execute the stored command.");
        assertTrue(output.contains("Receiver: Performing an action."),
                "Invoker should correctly invoke receiver's action.");
    }

    @Test
    void testInvokerClearsCommandsAfterExecution() {
        // Add and execute command
        invoker.addCommand(command);
        invoker.executeCommands();

        // Capture output for verification after executing commands
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute again (should do nothing since queue is cleared)
        invoker.executeCommands();

        // Verify no additional output
        String output = outputStream.toString().trim();
        assertTrue(output.isEmpty(), "Invoker should clear commands after execution.");
    }
}


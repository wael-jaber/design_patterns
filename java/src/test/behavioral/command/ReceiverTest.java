package behavioral.command;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceiverTest {

    @Test
    void testReceiverAction() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute action on receiver
        Receiver receiver = new Receiver();
        receiver.action();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Receiver: Performing an action."),
                "Receiver should correctly execute its action.");
    }
}


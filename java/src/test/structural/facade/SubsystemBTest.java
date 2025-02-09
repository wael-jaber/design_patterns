package structural.facade;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsystemBTest {

    @Test
    void testOperationB() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test SubsystemB
        SubsystemB subsystemB = new SubsystemB();
        subsystemB.operationB();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("SubsystemB: Performing operation B."),
                "SubsystemB should correctly perform operation B.");
    }
}


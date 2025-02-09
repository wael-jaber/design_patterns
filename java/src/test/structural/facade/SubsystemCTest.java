package structural.facade;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsystemCTest {

    @Test
    void testOperationC() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test SubsystemC
        SubsystemC subsystemC = new SubsystemC();
        subsystemC.operationC();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("SubsystemC: Performing operation C."),
                "SubsystemC should correctly perform operation C.");
    }
}


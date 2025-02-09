package structural.facade;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsystemATest {

    @Test
    void testOperationA() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test SubsystemA
        SubsystemA subsystemA = new SubsystemA();
        subsystemA.operationA();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("SubsystemA: Performing operation A."),
                "SubsystemA should correctly perform operation A.");
    }
}


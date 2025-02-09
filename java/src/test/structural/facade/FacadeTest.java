package structural.facade;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacadeTest {

    @Test
    void testFacadeSimpleOperation() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create and test Facade
        Facade facade = new Facade();
        facade.simpleOperation();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Facade: Coordinating operations..."),
                "Facade should log that it is coordinating operations.");
        assertTrue(output.contains("SubsystemA: Performing operation A."),
                "Facade should call SubsystemA operation.");
        assertTrue(output.contains("SubsystemB: Performing operation B."),
                "Facade should call SubsystemB operation.");
        assertTrue(output.contains("SubsystemC: Performing operation C."),
                "Facade should call SubsystemC operation.");
        assertTrue(output.contains("Facade: Operation completed."),
                "Facade should log that the operation has been completed.");
    }
}


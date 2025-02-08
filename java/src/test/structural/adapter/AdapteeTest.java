package structural.adapter;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapteeTest {

    @Test
    void testSpecificRequest() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test Adaptee's specificRequest method
        Adaptee adaptee = new Adaptee();
        adaptee.specificRequest();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Adaptee: Specific request called."),
                "Adaptee's specificRequest should print the correct message.");
    }
}


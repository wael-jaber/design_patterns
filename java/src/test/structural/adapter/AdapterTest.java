package structural.adapter;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {

    @Test
    void testAdapterRequest() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test Adapter's request method
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        assertDoesNotThrow(adapter::request, "Adapter's request method should not throw any exceptions.");

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Adapter: Translating request..."),
                "Adapter's request should print the translation message.");
        assertTrue(output.contains("Adaptee: Specific request called."),
                "Adapter should delegate the call to Adaptee's specificRequest.");
    }
}


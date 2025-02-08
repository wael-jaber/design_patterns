package structural.proxy;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RealSubjectTest {

    @Test
    void testRealSubjectRequest() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test RealSubject's request method
        RealSubject realSubject = new RealSubject();
        realSubject.request();

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("RealSubject: Handling request."),
                "RealSubject's request method should print the correct message.");
    }
}


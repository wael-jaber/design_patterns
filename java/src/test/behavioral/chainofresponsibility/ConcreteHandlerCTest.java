package behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteHandlerCTest {

    @Test
    void testConcreteHandlerCHandlesRequest() {
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Handler handlerC = new ConcreteHandlerC();
        handlerC.handleRequest("C");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerC handled request: C"),
                "ConcreteHandlerC should handle request C.");
    }

    @Test
    void testConcreteHandlerCHandlesUnknownRequest() {
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Handler handlerC = new ConcreteHandlerC();
        handlerC.handleRequest("Unknown");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("No handler could process request: Unknown"),
                "ConcreteHandlerC should print that no handler could process unknown requests.");
    }
}


package behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteHandlerBTest {

    @Test
    void testConcreteHandlerBHandlesRequest() {
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Handler handlerB = new ConcreteHandlerB();
        handlerB.handleRequest("B");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerB handled request: B"),
                "ConcreteHandlerB should handle request B.");
    }

    @Test
    void testConcreteHandlerBPassesRequest() {
        // Mock next handler
        Handler nextHandler = new ConcreteHandlerC();
        ConcreteHandlerB handlerB = new ConcreteHandlerB();
        handlerB.setNextHandler(nextHandler);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        handlerB.handleRequest("C");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerC handled request: C"),
                "ConcreteHandlerB should pass request C to the next handler.");
    }
}


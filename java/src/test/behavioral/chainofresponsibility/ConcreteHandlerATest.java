package behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteHandlerATest {

    @Test
    void testConcreteHandlerAHandlesRequest() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Handler handlerA = new ConcreteHandlerA();
        handlerA.handleRequest("A");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerA handled request: A"),
                "ConcreteHandlerA should handle request A.");
    }

    @Test
    void testConcreteHandlerAPassesRequest() {
        // Mock next handler
        Handler nextHandler = new ConcreteHandlerB();
        ConcreteHandlerA handlerA = new ConcreteHandlerA();
        handlerA.setNextHandler(nextHandler);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        handlerA.handleRequest("B");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerB handled request: B"),
                "ConcreteHandlerA should pass request B to the next handler.");
    }
}


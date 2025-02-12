package behavioral.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {
    private Handler handlerA;

    @BeforeEach
    void setUp() {
        handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
    }

    @Test
    void testChainHandlesRequestsCorrectly() {
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        handlerA.handleRequest("A"); // Should be handled by A
        handlerA.handleRequest("B"); // Should be handled by B
        handlerA.handleRequest("C"); // Should be handled by C
        handlerA.handleRequest("D"); // No handler should process

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteHandlerA handled request: A"),
                "Handler A should handle request A.");
        assertTrue(output.contains("ConcreteHandlerB handled request: B"),
                "Handler B should handle request B.");
        assertTrue(output.contains("ConcreteHandlerC handled request: C"),
                "Handler C should handle request C.");
        assertTrue(output.contains("No handler could process request: D"),
                "Unprocessable request should be logged.");
    }
}


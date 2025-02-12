package behavioral.mediator;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteColleagueATest {

    @Test
    void testColleagueASendsMessage() {
        // Mock the mediator
        Mediator mediator = mock(Mediator.class);
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);

        // Send a message
        colleagueA.send("Hello from A!");

        // Verify that the mediator received the message
        verify(mediator, times(1)).sendMessage("Hello from A!", colleagueA);
    }

    @Test
    void testColleagueAReceivesMessage() {
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mock(Mediator.class));

        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        colleagueA.receiveMessage("Test message for A");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteColleagueA received message: Test message for A"),
                "Colleague A should correctly receive and print the message.");
    }
}


package behavioral.mediator;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteColleagueBTest {

    @Test
    void testColleagueBSendsMessage() {
        // Mock the mediator
        Mediator mediator = mock(Mediator.class);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        // Send a message
        colleagueB.send("Hi from B!");

        // Verify that the mediator received the message
        verify(mediator, times(1)).sendMessage("Hi from B!", colleagueB);
    }

    @Test
    void testColleagueBReceivesMessage() {
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mock(Mediator.class));

        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        colleagueB.receiveMessage("Test message for B");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteColleagueB received message: Test message for B"),
                "Colleague B should correctly receive and print the message.");
    }
}


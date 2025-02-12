package behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcreteMediatorTest {
    private ConcreteMediator mediator;
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @BeforeEach
    void setUp() {
        mediator = new ConcreteMediator();
        colleagueA = new ConcreteColleagueA(mediator);
        colleagueB = new ConcreteColleagueB(mediator);

        mediator.registerColleague(colleagueA);
        mediator.registerColleague(colleagueB);
    }

    @Test
    void testMediatorRelaysMessageToOtherColleagues() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Colleague A sends a message
        colleagueA.send("Hello from A!");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify that Colleague B receives the message but Colleague A does not receive its own message
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteColleagueB received message: Hello from A!"),
                "Colleague B should receive the message.");
        assertTrue(!output.contains("ConcreteColleagueA received message"),
                "Colleague A should not receive its own message.");
    }

    @Test
    void testMediatorDoesNotRelayMessageToSender() {
        // Capture output for verification
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Colleague B sends a message
        colleagueB.send("Hello from B!");

        // Restore original output stream
        System.setOut(originalOut);

        // Verify that Colleague A receives the message but Colleague B does not receive its own message
        String output = outputStream.toString().trim();
        assertTrue(output.contains("ConcreteColleagueA received message: Hello from B!"),
                "Colleague A should receive the message.");
        assertTrue(!output.contains("ConcreteColleagueB received message"),
                "Colleague B should not receive its own message.");
    }
}


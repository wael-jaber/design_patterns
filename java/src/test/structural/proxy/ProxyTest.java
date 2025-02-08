package structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testProxyRequest() {
        // Create a Proxy instance
        Proxy proxy = new Proxy();
        proxy.request();

        // Verify output
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Proxy: Checking access before delegating to RealSubject."),
                "Proxy should check access before delegating.");
        assertTrue(output.contains("Proxy: Initializing RealSubject for the first time."),
                "Proxy should initialize RealSubject when called for the first time.");
        assertTrue(output.contains("RealSubject: Handling request."),
                "Proxy should delegate request to RealSubject.");
        assertTrue(output.contains("Proxy: Logging the request."),
                "Proxy should log the request after delegation.");
    }

    @Test
    void testProxyLazyInitialization() {
        // Create a Proxy instance and call request twice
        Proxy proxy = new Proxy();
        proxy.request(); // First call should initialize RealSubject
        proxy.request(); // Second call should reuse the existing RealSubject

        // Verify output
        String output = outputStream.toString().trim();

        long firstTimeInitialization = output.lines()
                .filter(line -> line.contains("Proxy: Initializing RealSubject for the first time."))
                .count();

        long reusedInstance = output.lines()
                .filter(line -> line.contains("Proxy: Using existing RealSubject instance."))
                .count();

        // Assert that initialization happens only once
        assertEquals(1, firstTimeInitialization,
                "RealSubject should only be initialized once.");

        // Assert that subsequent calls use the same instance
        assertTrue(reusedInstance > 0,
                "Proxy should reuse the same RealSubject instance after first initialization.");
    }

    @Test
    void testProxyMultipleRequests() {
        // Create a Proxy instance
        Proxy proxy = new Proxy();

        // Call request multiple times
        proxy.request();
        proxy.request();
        proxy.request();

        // Verify output
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Proxy: Initializing RealSubject for the first time."),
                "RealSubject should only be initialized once.");
        assertTrue(output.contains("Proxy: Using existing RealSubject instance."),
                "Subsequent requests should reuse the same RealSubject instance.");
        assertEquals(1, output.lines()
                        .filter(line -> line.contains("Proxy: Initializing RealSubject for the first time."))
                        .count(),
                "RealSubject should be initialized only once.");
        assertEquals(2, output.lines()
                        .filter(line -> line.contains("Proxy: Using existing RealSubject instance."))
                        .count(),
                "Proxy should confirm reuse of RealSubject on second and third requests.");
    }
}


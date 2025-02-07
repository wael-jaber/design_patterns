package creational;

import creational.singleton.Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2, "Singleton instances should be the same");
    }

    @Test
    public void testSingletonFunctionality() {
        Singleton instance = Singleton.getInstance();
        assertDoesNotThrow(instance::showMessage, "showMessage method should not throw exceptions");
    }

    @Test
    public void testReflectionAttack() {
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
            fail("Reflection should not allow creating a new instance");
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                assertTrue(cause instanceof IllegalStateException, "Reflection attack should throw IllegalStateException");
            } else {
                fail("Unexpected exception: " + e.getClass().getName() + " - " + e.getMessage());
            }
        }
    }

    @Test
    public void testSerialization() throws Exception {
        Singleton instance1 = Singleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        assertSame(instance1, instance2, "Deserialization should return the same singleton instance");
    }

    @Test
    public void testMultithreadingSafety() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Singleton> future1 = executor.submit(Singleton::getInstance);
        Future<Singleton> future2 = executor.submit(Singleton::getInstance);

        Singleton instance1 = future1.get();
        Singleton instance2 = future2.get();

        executor.shutdown();

        assertSame(instance1, instance2, "Singleton should return the same instance in multithreaded environment");
    }
}

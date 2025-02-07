package creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return getInstance();
    }

    public void showMessage() {
        System.out.println("Singleton instance invoked!");
    }
}

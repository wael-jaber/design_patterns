package structural.proxy;

// RealSubject: The real object that the Proxy represents
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}


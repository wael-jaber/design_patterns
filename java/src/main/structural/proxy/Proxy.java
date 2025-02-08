package structural.proxy;

// Proxy: Provides controlled access to the RealSubject
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("Proxy: Checking access before delegating to RealSubject.");
        
        if (realSubject == null) {
            System.out.println("Proxy: Initializing RealSubject for the first time.");
            realSubject = new RealSubject();
        } else {
            System.out.println("Proxy: Using existing RealSubject instance.");
        }

        realSubject.request();
        System.out.println("Proxy: Logging the request.");
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         Subject proxy = new Proxy();
//
//         // Client interacts with the Proxy, not the RealSubject
//         proxy.request();
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Overcomplicating the Proxy:
//    - Mistake: Adding excessive logic to the Proxy, making it harder to maintain.
//    - Fix: Keep the Proxy focused on controlling access and delegating requests.
//
// 2. Ignoring Lazy Initialization:
//    - Mistake: Always initializing the RealSubject, defeating the purpose of the Proxy.
//    - Fix: Use lazy initialization to create the RealSubject only when needed.
//
// 3. Breaking Encapsulation:
//    - Mistake: Allowing direct access to the RealSubject from outside the Proxy.
//    - Fix: Ensure all access goes through the Proxy.
//
// 4. Inefficient Access Control:
//    - Mistake: Using inefficient checks or redundant logic in the Proxy.
//    - Fix: Optimize access control mechanisms to avoid performance overhead.


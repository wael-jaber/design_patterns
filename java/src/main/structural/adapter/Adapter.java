package structural.adapter;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Delegates the call to the Adaptee's specificRequest method
        System.out.println("Adapter: Translating request...");
        adaptee.specificRequest();
    }
}

// Example Usage
// public class Main {
//     public static void main(String[] args) {
//         Adaptee adaptee = new Adaptee();
//         Target adapter = new Adapter(adaptee);
//
//         // Client code works with the Target interface
//         adapter.request();
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Ignoring Interface Requirements:
//    - Mistake: Not implementing the entire Target interface.
//    - Fix: Ensure the Adapter class fully implements all methods of the Target interface.
//
// 2. Tight Coupling:
//    - Mistake: Directly modifying the Adaptee instead of adapting it.
//    - Fix: Always use the Adapter to mediate between the Target and Adaptee.
//
// 3. Overcomplicating the Adapter:
//    - Mistake: Adding unnecessary logic to the Adapter.
//    - Fix: Keep the Adapter focused on translation logic only.
//
// 4. Assuming Compatibility Without Testing:
//    - Mistake: Assuming the Adaptee will work seamlessly after adaptation.
//    - Fix: Test the Adapter thoroughly with the Target interface.


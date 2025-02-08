package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite: Represents a group of components
public class Composite implements Component {
    private final String name;
    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void operation() {
        System.out.println("Composite: " + name + " is performing an operation.");
        for (Component child : children) {
            child.operation();
        }
    }
}

// Example Usage:
// public class Main {
//     public static void main(String[] args) {
//         // Create leaf nodes
//         Component leaf1 = new Leaf("Leaf 1");
//         Component leaf2 = new Leaf("Leaf 2");
//
//         // Create a composite node
//         Composite composite = new Composite("Composite 1");
//         composite.add(leaf1);
//         composite.add(leaf2);
//
//         // Create a root composite
//         Composite root = new Composite("Root Composite");
//         root.add(composite);
//         root.add(new Leaf("Leaf 3"));
//
//         // Perform operations
//         root.operation();
//     }
// }
//
// Common Mistakes to Avoid:
//
// 1. Ignoring Null References:
//    - Mistake: Adding null components to a composite.
//    - Fix: Validate inputs before adding them to the children list.
//
// 2. Tight Coupling with Specific Components:
//    - Mistake: Treating Composite or Leaf differently in the client code.
//    - Fix: Use the Component interface for all interactions.
//
// 3. Inefficient Traversal:
//    - Mistake: Repeatedly iterating over children unnecessarily.
//    - Fix: Optimize traversal and caching mechanisms if needed.
//
// 4. Circular References:
//    - Mistake: Adding a composite to itself or creating loops.
//    - Fix: Validate and prevent circular references in the hierarchy.


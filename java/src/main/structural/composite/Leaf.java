package structural.composite;

// Leaf: Represents individual objects in the hierarchy
public class Leaf implements Component {
    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: " + name + " is performing an operation.");
    }
}


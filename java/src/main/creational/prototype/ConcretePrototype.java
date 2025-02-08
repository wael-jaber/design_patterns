package creational.prototype;

public class ConcretePrototype implements Prototype {
    private String name;
    private int value;

    public ConcretePrototype(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Copy constructor for deep copy
    private ConcretePrototype(ConcretePrototype prototype) {
        this.name = prototype.name;
        this.value = prototype.value;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this); // Calls copy constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{name='" + name + "', value=" + value + "}";
    }
}

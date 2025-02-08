package creational.builder;

public class ProductBuilder {
    protected String partA;
    protected String partB;
    protected int partC;

    public ProductBuilder setPartA(String partA) {
        this.partA = partA;
        return this; // Enables method chaining
    }

    public ProductBuilder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public ProductBuilder setPartC(int partC) {
        this.partC = partC;
        return this;
    }

    public Product build() {
        return new Product(this);
    }
}

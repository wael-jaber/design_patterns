package creational.builder;

public class Product {
    private final String partA;
    private final String partB;
    private final int partC;

    Product(ProductBuilder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public int getPartC() {
        return partC;
    }

    @Override
    public String toString() {
        return "Product [PartA=" + partA + ", PartB=" + partB + ", PartC=" + partC + "]";
    }
}

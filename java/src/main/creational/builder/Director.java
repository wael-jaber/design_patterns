package creational.builder;

public class Director {
    public Product constructBasicProduct(ProductBuilder builder) {
        return builder
                .setPartA("Default A")
                .setPartB("Default B")
                .setPartC(100)
                .build();
    }

    public Product constructCustomProduct(ProductBuilder builder, String partA, String partB, int partC) {
        return builder
                .setPartA(partA)
                .setPartB(partB)
                .setPartC(partC)
                .build();
    }
}

// Example Usage:
// public static void main(String[] args) {
// Director director = new Director();
//
// // Using the director to create a standard product
// Product standardProduct = director.constructBasicProduct(new ProductBuilder());
// System.out.println(standardProduct);
//
// // Creating a custom product
// Product customProduct = director.constructCustomProduct(new ProductBuilder(), "Custom A", "Custom B", 200);
// System.out.println(customProduct);
// }
//
//
// Common mistakes to avoid:
// 1. Not Making Builder Immutable
// Mistake: Modifying builder fields after calling build().
// Fix: Use a final private constructor in the Product.
// 2. Overcomplicating the Builder
// Mistake: Creating too many unnecessary methods.
// Fix: Keep only essential methods for setting attributes.
// 3. Missing Step Validation
// Mistake: Allowing invalid product states due to missing attributes.
// Fix: Validate inputs before calling build().
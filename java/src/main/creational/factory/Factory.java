package creational.factory;

// Factory class that selects the right creator dynamically using enums
public class Factory {
    public static Product createProduct(ProductType type) {
        if (type == null) {  // Fix: Handle null properly
            throw new IllegalArgumentException("Product type cannot be null");
        }

        Creator creator;
        switch (type) {
            case A:
                creator = new ConcreteCreatorA();
                break;
            case B:
                creator = new ConcreteCreatorB();
                break;
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
        return creator.createProduct();
    }
}


// Example Usage:
// public class FactoryMethodExample {
//     public static void main(String[] args) {
//         Product productA = Factory.createProduct(ProductType.A);
//         productA.use();
//         Product productB = Factory.createProduct(ProductType.B);
//         productB.use();
//     }
// }
//
// Common mistakes to avoid:
// 1. Tight Coupling Between Factory and Products
//    Mistake: Directly tying the factory to specific concrete classes.
//    Fix: Use abstractions (e.g., interfaces or base classes) to reduce coupling.
//
// 2. Missing Validation
//    Mistake: Not handling invalid inputs properly in the factory.
//    Fix: Always validate input and throw meaningful errors for unsupported cases.
//
// 3. Overcomplicating the Factory
//    Mistake: Adding too much logic to the factory, making it hard to maintain.
//    Fix: Keep the factory focused on object creation, and avoid business logic.
//
// 4. Hardcoding the Factory's Behavior
//    Mistake: Embedding product types as strings directly into the factory.
//    Fix: Use an enum (`ProductType`) to improve type safety and maintainability.


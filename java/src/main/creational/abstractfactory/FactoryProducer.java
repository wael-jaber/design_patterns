package creational.abstractfactory;

// Factory Producer that returns different factories
public class FactoryProducer {
    // we can use overloading or generic types,
    // overloading is better in this case, although it will result in code duplication
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (factoryType == null) {
            throw new IllegalArgumentException("Factory type cannot be null");
        }

        switch (factoryType) {
            case FACTORY_A:
                return new ConcreteFactoryA();
            case FACTORY_B:
                return new ConcreteFactoryB();
            default:
                throw new IllegalArgumentException("Invalid factory type: " + factoryType);
        }
    }
}

// Example Usage:

// public class AbstractFactoryExample {
//     public static void main(String[] args) {
//         AbstractFactory factoryA = FactoryProducer.getFactory(FactoryType.FACTORY_A);
//         Product productA = factoryA.createProduct(ProductType.A);
//         productA.use();
//
//         AbstractFactory factoryB = FactoryProducer.getFactory(FactoryType.FACTORY_B);
//         Product productB = factoryB.createProduct(ProductType.B);
//         productB.use();
//     }
// }
//
//
// Common mistakes to avoid:
// 1. Mixing Abstract Factory with Factory Method incorrectly.
//    Mistake: Using an Abstract Factory but treating it like a Factory Method.
//    Fix: Ensure the Abstract Factory is responsible for creating multiple related objects.
//
// 2. Hardcoding Factory Selection Logic.
//    Mistake: Hardcoding factory selection into application logic.
//    Fix: Use a Factory Producer or Dependency Injection.
//
// 3. Lack of Scalability.
//    Mistake: Making it difficult to add new factories and products.
//    Fix: Use a common interface so that new factories can be added seamlessly.


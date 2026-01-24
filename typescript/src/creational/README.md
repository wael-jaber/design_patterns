### **Creational Design Patterns in Java**

Creational design patterns deal with the process of object creation. They help make a system independent of how its objects are created, composed, and represented.

This repository contains implementations of the following creational patterns in Java:

- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Prototype](#prototype)
- [Singleton](#singleton)
- [Factory](#factory)

---

## **Abstract Factory**

The **Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Implementation Files

- [AbstractFactory.java](./abstractfactory/AbstractFactory.java)
- [ConcreteFactoryA.java](./abstractfactory/ConcreteFactoryA.java)
- [ConcreteFactoryB.java](./abstractfactory/ConcreteFactoryB.java)
- [FactoryProducer.java](./abstractfactory/FactoryProducer.java)
- [Product.java](./abstractfactory/Product.java)
- [ProductType.java](./abstractfactory/ProductType.java)

### Test Files

- [ConcreteFactoryATest.java](../../../test/creational/abstractfactory/ConcreteFactoryATest.java)
- [ConcreteFactoryBTest.java](../../../test/creational/abstractfactory/ConcreteFactoryBTest.java)
- [ConcreteProductATest.java](../../../test/creational/abstractfactory/ConcreteProductATest.java)
- [ConcreteProductBTest.java](../../../test/creational/abstractfactory/ConcreteProductBTest.java)
- [FactoryProducerTest.java](../../../test/creational/abstractfactory/FactoryProducerTest.java)

### Pitfalls

1. **Overcomplicated Factory Selection**:
   - Mistake: Hardcoding factory selection logic.
   - Fix: Use enums like `FactoryType` to simplify and type-safe factory creation.

2. **Tight Coupling Between Factories and Products**:
   - Mistake: Factories directly reference concrete products.
   - Fix: Use interfaces or abstract classes for product definitions.

### Tips

1. Use **enums** for factory types to ensure type safety and maintainability.
2. Encapsulate factory selection in a **FactoryProducer** to centralize logic.

---

## **Builder**

The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Implementation Files

- [Product.java](./builder/Product.java)
- [ProductBuilder.java](./builder/ProductBuilder.java)
- [Director.java](./builder/Director.java)

### Test Files

- [ProductTest.java](../../../test/creational/builder/ProductTest.java)
- [ProductBuilderTest.java](../../../test/creational/builder/ProductBuilderTest.java)
- [DirectorTest.java](../../../test/creational/builder/DirectorTest.java)

### Pitfalls

1. **Mutable Products After Build**:
   - Mistake: Allowing changes to the product after construction.
   - Fix: Use `final` fields and ensure immutability.

2. **Complex Builders**:
   - Mistake: Overcomplicating builders with unnecessary methods.
   - Fix: Include only essential methods to simplify usage.

### Tips

1. Use a **Director** to manage the building process for standard use cases.
2. Validate all inputs in the builder before creating the object.

---

## **Prototype**

The **Prototype** pattern creates new objects by copying an existing object, known as the prototype.

### Implementation Files

- [Prototype.java](./prototype/Prototype.java)
- [ConcretePrototype.java](./prototype/ConcretePrototype.java)

### Test Files

- [ConcretePrototypeTest.java](../../../test/creational/prototype/ConcretePrototypeTest.java)

### Pitfalls

1. **Shallow Copy vs. Deep Copy**:
   - Mistake: Cloning objects with nested references creates shallow copies.
   - Fix: Use a copy constructor or deep clone logic for complex objects.

2. **Prototype Pollution**:
   - Mistake: Improper handling of shared state in the cloned object.
   - Fix: Ensure that state is unique to each prototype instance.

### Tips

1. Use a **copy constructor** or a library like `Apache Commons Lang` for deep cloning.
2. Validate prototype objects before cloning to avoid propagating errors.

---

## **Singleton**

The **Singleton** pattern ensures a class has only one instance and provides a global point of access to it.

### Implementation Files

- [Singleton.java](./singleton/Singleton.java)

### Test Files

- [SingletonTest.java](../../../test/creational/singleton/SingletonTest.java)

### Pitfalls

1. **Thread Safety Issues**:
   - Mistake: Using lazy initialization without synchronization in a multi-threaded environment.
   - Fix: Use synchronized methods or double-checked locking for thread safety.

2. **Serialization Issues**:
   - Mistake: Losing singleton behavior during serialization.
   - Fix: Implement `readResolve` to ensure only one instance.

3. **Reflection Attacks**:
   - Mistake: Allowing reflection to break singleton constraints.
   - Fix: Throw exceptions in the constructor if an instance already exists.

### Tips

1. Use **enum singletons** for simplicity and built-in serialization support.
2. Test against edge cases like serialization and reflection attacks.

---

## **Factory**

The **Factory** pattern provides a method to create objects without specifying the exact class to be instantiated.

### Implementation Files

- [Creator.java](./factory/Creator.java)
- [ConcreteCreatorA.java](./factory/ConcreteCreatorA.java)
- [ConcreteCreatorB.java](./factory/ConcreteCreatorB.java)
- [Product.java](./factory/Product.java)
- [ConcreteProductA.java](./factory/ConcreteProductA.java)
- [ConcreteProductB.java](./factory/ConcreteProductB.java)
- [Factory.java](./factory/Factory.java)
- [ProductType.java](./factory/ProductType.java)

### Test Files

- [FactoryTest.java](../../../test/creational/factory/FactoryTest.java)
- [ConcreteCreatorATest.java](../../../test/creational/factory/ConcreteCreatorATest.java)
- [ConcreteCreatorBTest.java](../../../test/creational/factory/ConcreteCreatorBTest.java)
- [ConcreteProductATest.java](../../../test/creational/factory/ConcreteProductATest.java)
- [ConcreteProductBTest.java](../../../test/creational/factory/ConcreteProductBTest.java)

### Pitfalls

1. **Overuse of Factories**:
   - Mistake: Using factories unnecessarily for simple object creation.
   - Fix: Reserve factories for complex or polymorphic object creation.

2. **Tight Coupling**:
   - Mistake: Factories depend on specific concrete implementations.
   - Fix: Use abstractions for return types.

### Tips

1. Combine **Factory Method** with **Abstract Factory** for flexible object creation.
2. Use enums for product selection to simplify and type-safe the creation process.

---

## **Conclusion**

This repository demonstrates the use of creational patterns in Java with clear examples, test cases, pitfalls, and tips for each pattern. Follow the links above to explore the source code and learn best practices.

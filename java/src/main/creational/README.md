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

- [ConcreteFactoryATest.java](../../test/creational/abstractfactory/ConcreteFactoryATest.java)
- [ConcreteFactoryBTest.java](../../test/creational/abstractfactory/ConcreteFactoryBTest.java)
- [ConcreteProductATest.java](../../test/creational/abstractfactory/ConcreteProductATest.java)
- [ConcreteProductBTest.java](../../test/creational/abstractfactory/ConcreteProductBTest.java)
- [FactoryProducerTest.java](../../test/creational/abstractfactory/FactoryProducerTest.java)

---

## **Builder**

The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Implementation Files

- [Product.java](./builder/Product.java)
- [ProductBuilder.java](./builder/ProductBuilder.java)
- [Director.java](./builder/Director.java)

### Test Files

- [ProductTest.java](../../test/creational/builder/ProductTest.java)
- [ProductBuilderTest.java](../../test/creational/builder/ProductBuilderTest.java)
- [DirectorTest.java](../../test/creational/builder/DirectorTest.java)

---

## **Prototype**

The **Prototype** pattern creates new objects by copying an existing object, known as the prototype.

### Implementation Files

- [Prototype.java](./prototype/Prototype.java)
- [ConcretePrototype.java](./prototype/ConcretePrototype.java)

### Test Files

- [ConcretePrototypeTest.java](../../test/creational/prototype/ConcretePrototypeTest.java)

---

## **Singleton**

The **Singleton** pattern ensures a class has only one instance and provides a global point of access to it.

### Implementation Files

- [Singleton.java](./singleton/Singleton.java)

### Test Files

- [SingletonTest.java](../../test/creational/singleton/SingletonTest.java)

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

- [FactoryTest.java](../../test/creational/factory/FactoryTest.java)
- [ConcreteCreatorATest.java](../../test/creational/factory/ConcreteCreatorATest.java)
- [ConcreteCreatorBTest.java](../../test/creational/factory/ConcreteCreatorBTest.java)
- [ConcreteProductATest.java](../../test/creational/factory/ConcreteProductATest.java)
- [ConcreteProductBTest.java](../../test/creational/factory/ConcreteProductBTest.java)

---

## **Conclusion**

This repository demonstrates the use of creational patterns in Java with clear examples and test cases for each pattern. Follow the links above to view the source code and test files for detailed insights into each pattern.

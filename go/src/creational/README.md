### **Creational Design Patterns in Go**

Creational design patterns focus on object creation mechanisms, aiming to create objects in a manner suitable to the situation while promoting flexibility and reuse.

This directory contains idiomatic **Go** implementations of creational design patterns, emphasizing simplicity, composition, and testability.

- [Singleton](#singleton)
- [Factory](#factory)
- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Prototype](#prototype)

---

## **Singleton**

The **Singleton** pattern ensures a class has only one instance and provides a global point of access to it.

### Implementation Files

- [singleton.go](./singleton/singleton.go)

### Test Files

- [singleton_test.go](./singleton/singleton_test.go)

---

## **Factory**

The **Factory** pattern defines an interface for creating an object but lets subclasses or logic decide which class to instantiate.

### Implementation Files

- [product.go](./factory/product.go)
- [product_a.go](./factory/product_a.go)
- [product_b.go](./factory/product_b.go)
- [factory.go](./factory/factory.go)

### Test Files

- [product_test.go](./factory/product_test.go)
- [product_a_test.go](./factory/product_a_test.go)
- [product_b_test.go](./factory/product_b_test.go)
- [factory_test.go](./factory/factory_test.go)

---

## **Abstract Factory**

The **Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Implementation Files

- [factory.go](./abstractfactory/factory.go)
- [modern_factory.go](./abstractfactory/modern_factory.go)
- [victorian_factory.go](./abstractfactory/victorian_factory.go)
- [product_a.go](./abstractfactory/product_a.go)
- [modern_product_a.go](./abstractfactory/modern_product_a.go)
- [victorian_product_a.go](./abstractfactory/victorian_product_a.go)
- [product_b.go](./abstractfactory/product_b.go)
- [modern_product_b.go](./abstractfactory/modern_product_b.go)
- [victorian_product_b.go](./abstractfactory/victorian_product_b.go)

### Test Files

- [factory_test.go](./abstractfactory/factory_test.go)
- [modern_factory_test.go](./abstractfactory/modern_factory_test.go)
- [victorian_factory_test.go](./abstractfactory/victorian_factory_test.go)
- [product_a_test.go](./abstractfactory/product_a_test.go)
- [product_b_test.go](./abstractfactory/product_b_test.go)

---

## **Builder**

The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Implementation Files

- [builder.go](./builder/builder.go)
- [computer.go](./builder/computer.go)
- [computer_builder.go](./builder/computer_builder.go)

### Test Files

- [builder_test.go](./builder/builder_test.go)
- [computer_test.go](./builder/computer_test.go)
- [computer_builder_test.go](./builder/computer_builder_test.go)

---

## **Prototype**

The **Prototype** pattern creates new objects by copying existing ones, avoiding the cost of creating objects from scratch.

### Implementation Files

- [prototype.go](./prototype/prototype.go)
- [file.go](./prototype/file.go)
- [folder.go](./prototype/folder.go)

### Test Files

- [prototype_test.go](./prototype/prototype_test.go)
- [file_test.go](./prototype/file_test.go)
- [folder_test.go](./prototype/folder_test.go)

---

## **Conclusion**

This directory demonstrates idiomatic Go implementations of creational design patterns with a strong focus on:

- Composition over inheritance
- Minimal interfaces
- Clear separation of responsibilities
- Comprehensive unit testing
- Practical, real-world examples

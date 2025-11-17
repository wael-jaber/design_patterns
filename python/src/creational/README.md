### **Creational Design Patterns in Python**

Creational design patterns deal with the process of object creation. They help
make a system independent of how its objects are created, composed, and
represented.

This repository contains implementations of the following creational patterns
in Python:

- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Prototype](#prototype)
- [Singleton](#singleton)
- [Factory](#factory)

---

## **Abstract Factory**

The **Abstract Factory** pattern provides an interface for creating families
of related or dependent objects without specifying their concrete classes.

### Implementation Files

- [factory.py](../../src/creational/abstract_factory/factory.py)
- [product_type.py](../../src/creational/abstract_factory/product_type_a.py)
- [product.py](../../src/creational/abstract_factory/product.py)

### Test Files

- [test_factory.py](../../tests/creational/abstract_factory/test_factory.py)
- [test_product_type.py](../../tests/creational/abstract_factory/test_product_type.py)
- [test_product.py](../../tests/creational/abstract_factory/test_product.py)

---

## **Builder**

The **Builder** pattern separates the construction of a complex object from its
representation, allowing the same construction process to create different 
representations.

### Implementation Files

- [product.py](../../src/creational/builder/product.py)
- [builder.py](../../src/creational/builder/builder.py)
- [director.py](../../src/creational/builder/director.py)

### Test Files

- [test_product.py](../../tests/creational/builder/test_product.py)
- [test_builder.py](../../tests/creational/builder/test_builder.py)
- [test_director.py](../../tests/creational/builder/test_director.py)

---

## **Prototype**

The **Prototype** pattern creates new objects by copying an existing object,
known as the prototype.

### Implementation Files

- [prototype.py](../../src/creational/prototype/prototype.py)

### Test Files

- [test_prototype.py](../../tests/creational/prototype/test_prototype.py)

---

## **Singleton**

The **Singleton** pattern ensures a class has only one instance and provides
a global point of access to it.

### Implementation Files

- [singleton.py](../../src/creational/singleton/singleton.py)

### Test Files

- [test_singleton.py](../../tests/creational/singleton/test_singleton.py)

---

## **Factory**

The **Factory** pattern provides a method to create objects without specifying
the exact class to be instantiated.

### Implementation Files

- [factory.py](../../src/creational/factory/factory.py)
- [product.py](../../src/creational/factory/product.py)
- [product_type.py](../../src/creational/factory/product_type.py)

### Test Files

- [test_factory.py](../../tests/creational/factory/test_factory.py)
- [test_product.py](../../tests/creational/factory/test_product.py)
- [test_product_type.py](../../tests/creational/factory/test_product_type.py)

---

## **Conclusion**

This repository demonstrates the use of creational patterns in Python with
clear examples and separated test files. Follow the links above to view the
source code and test files for detailed insights into each pattern.

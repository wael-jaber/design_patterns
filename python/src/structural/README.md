# **Structural Design Patterns in Python**

Structural design patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

This repository contains implementations of the following structural patterns in Python:

- [Adapter](#adapter)
- [Composite](#composite)
- [Proxy](#proxy)
- [Decorator](#decorator)
- [Facade](#facade)
- [Bridge](#bridge)

---

## **Adapter**

The **Adapter** pattern allows incompatible interfaces to work together by converting the interface of one class into another interface the client expects.

### Implementation Files

- [adapter.py](../../src/structural/adapter/adapter.py)
- [adaptee.py](../../src/structural/adapter/adaptee.py)
- [target.py](../../src/structural/adapter/target.py)

### Test Files

- [test_adapter.py](../../tests/structural/adapter/test_adapter.py)
- [test_adaptee.py](../../tests/structural/adapter/test_adaptee.py)
- [test_target.py](../../tests/structural/adapter/test_target.py)

---

## **Composite**

The **Composite** pattern lets you compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions uniformly.

### Implementation Files

- [component.py](../../src/structural/composite/component.py)
- [composite.py](../../src/structural/composite/composite.py)
- [leaf.py](../../src/structural/composite/leaf.py)

### Test Files

- [test_component.py](../../tests/structural/composite/test_component.py)
- [test_composite.py](../../tests/structural/composite/test_composite.py)
- [test_leaf.py](../../tests/structural/composite/test_leaf.py)

---

## **Proxy**

The **Proxy** pattern provides a surrogate or placeholder for another object, controlling access to it.

### Implementation Files

- [proxy.py](../../src/structural/proxy/proxy.py)
- [real_subject.py](../../src/structural/proxy/real_subject.py)
- [subject.py](../../src/structural/proxy/subject.py)

### Test Files

- [test_proxy.py](../../tests/structural/proxy/test_proxy.py)
- [test_real_subject.py](../../tests/structural/proxy/test_real_subject.py)

---

## **Decorator**

The **Decorator** pattern lets you attach additional responsibilities to objects dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

### Implementation Files

- [component.py](../../src/structural/decorator/component.py)
- [concrete_component.py](../../src/structural/decorator/concrete_component.py)
- [concrete_decorator_a.py](../../src/structural/decorator/concrete_decorator_a.py)
- [concrete_decorator_b.py](../../src/structural/decorator/concrete_decorator_b.py)
- [decorator.py](../../src/structural/decorator/decorator.py)

### Test Files

- [test_component.py](../../tests/structural/decorator/test_component.py)
- [test_concrete_component.py](../../tests/structural/decorator/test_concrete_component.py)
- [test_concrete_decorator_a.py](../../tests/structural/decorator/test_concrete_decorator_a.py)
- [test_concrete_decorator_b.py](../../tests/structural/decorator/test_concrete_decorator_b.py)
- [test_decorator.py](../../tests/structural/decorator/test_decorator.py)

---

## **Facade**

The **Facade** pattern provides a simplified interface to a complex subsystem.

### Implementation Files

- [facade.py](../../src/structural/facade/facade.py)
- [subsystem_a.py](../../src/structural/facade/subsystem_a.py)
- [subsystem_b.py](../../src/structural/facade/subsystem_b.py)

### Test Files

- [test_facade.py](../../tests/structural/facade/test_facade.py)
- [test_subsystem_a.py](../../tests/structural/facade/test_subsystem_a.py)
- [test_subsystem_b.py](../../tests/structural/facade/test_subsystem_b.py)

---

## **Bridge**

The **Bridge** pattern decouples an abstraction from its implementation so the two can vary independently.

### Implementation Files

- [abstraction.py](../../src/structural/bridge/abstraction.py)
- [extended_abstraction.py](../../src/structural/bridge/extended_abstraction.py)
- [implementor.py](../../src/structural/bridge/implementor.py)
- [concrete_implementor_a.py](../../src/structural/bridge/concrete_implementor_a.py)
- [concrete_implementor_b.py](../../src/structural/bridge/concrete_implementor_b.py)

### Test Files

- [test_abstraction.py](../../tests/structural/bridge/test_abstraction.py)
- [test_extended_abstraction.py](../../tests/structural/bridge/test_extended_abstraction.py)
- [test_implementor.py](../../tests/structural/bridge/test_implementor.py)
- [test_concrete_implementor_a.py](../../tests/structural/bridge/test_concrete_implementor_a.py)
- [test_concrete_implementor_b.py](../../tests/structural/bridge/test_concrete_implementor_b.py)

---

## **Conclusion**

This repository demonstrates the use of structural design patterns in Python with clear examples and separated test files.
Each pattern is structured in its own folder with dedicated test coverage to ensure correct behavior and maintainability.

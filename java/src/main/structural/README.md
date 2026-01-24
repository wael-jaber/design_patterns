# **Structural Design Patterns in Java**

Structural design patterns help define the **composition** of classes and objects. These patterns simplify object relationships and ensure flexible and efficient designs.

This repository contains implementations of the following **structural design patterns** in Java:

- [Adapter](#adapter)
- [Bridge](#bridge)
- [Composite](#composite)
- [Decorator](#decorator)
- [Facade](#facade)
- [Proxy](#proxy)

---

## **Adapter**

The **Adapter Pattern** allows objects with incompatible interfaces to work together by providing an intermediary that translates one interface into another.

### Implementation Files

- [Target.java](./adapter/Target.java)
- [Adaptee.java](./adapter/Adaptee.java)
- [Adapter.java](./adapter/Adapter.java)

### Test Files

- [AdapteeTest.java](../../test/structural/adapter/AdapteeTest.java)
- [AdapterTest.java](../../test/structural/adapter/AdapterTest.java)

---

## **Bridge**

The **Bridge Pattern** decouples an abstraction from its implementation so that the two can vary independently.

### Implementation Files

- [Implementor.java](./bridge/Implementor.java)
- [ConcreteImplementorA.java](./bridge/ConcreteImplementorA.java)
- [ConcreteImplementorB.java](./bridge/ConcreteImplementorB.java)
- [Abstraction.java](./bridge/Abstraction.java)
- [RefinedAbstraction.java](./bridge/RefinedAbstraction.java)

### Test Files

- [ImplementorTest.java](../../test/structural/bridge/ImplementorTest.java)
- [RefinedAbstractionTest.java](../../test/structural/bridge/RefinedAbstractionTest.java)

---

## **Composite**

The **Composite Pattern** lets clients treat individual objects and compositions of objects uniformly, enabling tree structures.

### Implementation Files

- [Component.java](./composite/Component.java)
- [Leaf.java](./composite/Leaf.java)
- [Composite.java](./composite/Composite.java)

### Test Files

- [LeafTest.java](../../test/structural/composite/LeafTest.java)
- [CompositeTest.java](../../test/structural/composite/CompositeTest.java)

---

## **Decorator**

The **Decorator Pattern** allows behavior to be dynamically added to an object without modifying its structure.

### Implementation Files

- [Component.java](./decorator/Component.java)
- [ConcreteComponent.java](./decorator/ConcreteComponent.java)
- [Decorator.java](./decorator/Decorator.java)
- [ConcreteDecoratorA.java](./decorator/ConcreteDecoratorA.java)
- [ConcreteDecoratorB.java](./decorator/ConcreteDecoratorB.java)

### Test Files

- [ConcreteComponentTest.java](../../test/structural/decorator/ConcreteComponentTest.java)
- [ConcreteDecoratorATest.java](../../test/structural/decorator/ConcreteDecoratorATest.java)
- [ConcreteDecoratorBTest.java](../../test/structural/decorator/ConcreteDecoratorBTest.java)
- [CombinedDecoratorTest.java](../../test/structural/decorator/CombinedDecoratorTest.java)

---

## **Facade**

The **Facade Pattern** provides a simplified interface to a complex subsystem, making it easier for clients to interact with the system.

### Implementation Files

- [Facade.java](./facade/Facade.java)
- [SubsystemA.java](./facade/SubsystemA.java)
- [SubsystemB.java](./facade/SubsystemB.java)
- [SubsystemC.java](./facade/SubsystemC.java)

### Test Files

- [SubsystemATest.java](../../test/structural/facade/SubsystemATest.java)
- [SubsystemBTest.java](../../test/structural/facade/SubsystemBTest.java)
- [SubsystemCTest.java](../../test/structural/facade/SubsystemCTest.java)
- [FacadeTest.java](../../test/structural/facade/FacadeTest.java)

---

## **Proxy**

The **Proxy Pattern** provides a surrogate or placeholder object that controls access to another object.

### Implementation Files

- [Subject.java](./proxy/Subject.java)
- [RealSubject.java](./proxy/RealSubject.java)
- [Proxy.java](./proxy/Proxy.java)

### Test Files

- [RealSubjectTest.java](../../test/structural/proxy/RealSubjectTest.java)
- [ProxyTest.java](../../test/structural/proxy/ProxyTest.java)

---

## **Conclusion**

This repository demonstrates the use of **structural patterns** in Java with well-structured examples and test cases for each pattern. Follow the links above to explore each pattern in detail.

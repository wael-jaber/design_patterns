# Structural Design Patterns in TypeScript

Structural design patterns deal with the composition of classes and objects. They help ensure that entities are organized in a way that improves functionality, flexibility, and scalability.

This repository contains implementations of the following structural patterns:

- [Adapter](#adapter)
- [Bridge](#bridge)
- [Composite](#composite)
- [Decorator](#decorator)
- [Facade](#facade)
- [Proxy](#proxy)

---

## Adapter

The **Adapter** pattern allows objects with incompatible interfaces to work together by wrapping an existing class with a new interface.

### Example

- [Adapter Implementation](./adapter.ts)
- [Adapter Tests](./__tests__/adapter.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Overuse of Adapters**:

   - Using adapters for minor incompatibilities can add unnecessary complexity.

2. **Performance Overhead**:
   - Adapters introduce an additional layer of abstraction, which can impact performance in critical systems.

#### Tips:

1. Use adapters when integrating with legacy systems or third-party libraries.
2. Clearly document the relationship between the adapter and the adaptee.

---

## Bridge

The **Bridge** pattern decouples an abstraction from its implementation, allowing both to vary independently.

### Example

- [Bridge Implementation](./bridge.ts)
- [Bridge Tests](./__tests__/bridge.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Unnecessary Abstraction**:

   - Introducing a bridge where the abstraction and implementation do not vary can overcomplicate the design.

2. **Tight Coupling**:
   - Ensure the abstraction and implementation remain loosely coupled.

#### Tips:

1. Use this pattern when you anticipate changes in both abstraction and implementation.
2. Leverage TypeScript interfaces to enforce contracts between the abstraction and implementation.

---

## Composite

The **Composite** pattern allows you to compose objects into tree-like structures to represent part-whole hierarchies.

### Example

- [Composite Implementation](./composite.ts)
- [Composite Tests](./__tests__/composite.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Incorrect Recursive Logic**:

   - Ensure recursion in tree operations (e.g., calculating size) does not lead to infinite loops.

2. **Overhead in Simple Structures**:
   - Using this pattern for flat structures adds unnecessary complexity.

#### Tips:

1. Test edge cases like empty composites and deeply nested structures.
2. Use `private` members to encapsulate child management.

---

## Decorator

The **Decorator** pattern allows behavior to be added to individual objects dynamically without affecting the behavior of other objects from the same class.

### Example

- [Decorator Implementation](./decorator.ts)
- [Decorator Tests](./__tests__/decorator.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Uncontrolled Chaining**:

   - Excessive chaining of decorators can make debugging difficult.

2. **State Management Issues**:
   - Decorators should not maintain state that interferes with other decorators.

#### Tips:

1. Keep decorators focused on a single responsibility.
2. Test combinations of decorators to ensure they interact correctly.

---

## Facade

The **Facade** pattern provides a simplified interface to a larger body of code, such as a subsystem.

### Example

- [Facade Implementation](./facade.ts)
- [Facade Tests](./__tests__/facade.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Overloading the Facade**:

   - Adding too much logic to the facade defeats its purpose of simplifying interactions.

2. **Leaking Subsystem Details**:
   - Avoid exposing the inner workings of subsystems through the facade.

#### Tips:

1. Design the facade methods to align with the most common client use cases.
2. Keep subsystems accessible for advanced users while maintaining simplicity through the facade.

---

## Proxy

The **Proxy** pattern provides a surrogate or placeholder for another object to control access to it.

### Example

- [Proxy Implementation](./proxy.ts)
- [Proxy Tests](./__tests__/proxy.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Overhead for Simple Scenarios**:

   - Avoid using proxies for scenarios where direct access is sufficient.

2. **Tight Coupling**:
   - Ensure the proxy does not expose details of the real object unnecessarily.

#### Tips:

1. Use lazy initialization in proxies to save resources.
2. Implement access control and logging where necessary.

---

## Conclusion: Tips for Using Structural Patterns in JavaScript/TypeScript

1. **Leverage TypeScript**:

   - Use interfaces and types to define clear contracts between components.

2. **Avoid Overengineering**:

   - Use structural patterns only when the complexity of composition justifies the abstraction.

3. **Focus on Maintainability**:

   - Simplify implementations to ensure long-term readability and scalability.

4. **Test Extensively**:
   - Ensure all combinations of abstraction and implementation are tested to avoid unexpected behavior.

Explore the examples in this repository to see these patterns in action. Happy coding!

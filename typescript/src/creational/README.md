# Creational Design Patterns in TypeScript

Creational design patterns deal with the process of object creation. They help make a system independent of how its objects are created, composed, and represented.

This repository contains implementations of the following creational patterns:

- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Prototype](#prototype)
- [Singleton](#singleton)
- [Factory](#factory)

---

## Abstract Factory

The **Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Example

- [Abstract Factory Implementation](./abstract_factory.ts)
- [Abstract Factory Tests](./__tests__/abstract_factory.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Lack of Interface Enforcement**:

   - JavaScript does not support interfaces natively. Use TypeScript to enforce product and factory interfaces.

2. **Dynamic Type Issues**:
   - Runtime errors can occur if the factory is misused or returns unexpected product types.

#### Tips:

1. Use **TypeScript interfaces or abstract classes** to define product and factory contracts.
2. Employ a **factory registry** to handle dynamic factory lookups efficiently.

---

## Builder

The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Example

- [Builder Implementation](./builder.ts)
- [Builder Tests](./__tests__/builder.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **State Management Issues**:

   - Builders that do not reset their internal state can cause unintended side effects.

2. **Fluent API Pitfalls**:
   - Forgetting to return `this` in builder methods breaks method chaining.

#### Tips:

1. Ensure builders **reset their state** after calling `build`.
2. Use TypeScript’s **strict type annotations** to enforce correct usage.

---

## Prototype

The **Prototype** pattern creates new objects by copying an existing object, known as the prototype.

### Example

- [Prototype Implementation](./prototype.ts)
- [Prototype Tests](./__tests__/prototype.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Shallow vs. Deep Copy**:

   - Using `Object.assign` or the spread operator creates shallow copies, which may not work for nested structures.

2. **Prototype Pollution**:
   - Improper handling of prototypes can lead to vulnerabilities.

#### Tips:

1. Use a library like **lodash** for deep copying.
2. Define a **common interface** for prototypes in TypeScript to ensure consistency.

---

## Singleton

The **Singleton** pattern ensures a class has only one instance and provides a global point of access to it.

### Example

- [Singleton Implementation](./singleton.ts)
- [Singleton Tests](./__tests__/singleton.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Global State Issues**:

   - Singletons act as a global state, which can lead to tight coupling and hard-to-debug issues.

2. **Thread Safety**:
   - JavaScript is single-threaded, so thread safety isn’t a concern, but concurrent updates to shared resources can cause issues.

#### Tips:

1. Use **lazy initialization** to create the instance only when needed.
2. In TypeScript, use `private` constructors and `static` properties to enforce singleton behavior.

---

## Factory

The **Factory** pattern provides a method to create objects without specifying the exact class to be instantiated.

### Example

- [Factory Implementation](./factory.ts)
- [Factory Tests](./__tests__/factory.test.ts)

### JavaScript/TypeScript Pitfalls and Tips

#### Pitfalls:

1. **Overuse of Factories**:

   - Using factories unnecessarily can add complexity without benefit, especially for simple object creation.

2. **Dynamic Factory Resolution**:
   - Runtime type errors can occur if factory resolution logic is not robust.

#### Tips:

1. Use **TypeScript enums** or constants for type safety in factory resolution.
2. Combine with **Abstract Factory** for families of products.

---

## Conclusion: Tips for Using Creational Patterns in JavaScript/TypeScript

1. **Leverage TypeScript**:

   - Use interfaces, abstract classes, and type annotations to ensure consistency and type safety.

2. **Avoid Overengineering**:

   - Use creational patterns only when the complexity of object creation justifies the abstraction.

3. **Dynamic Typing**:

   - Handle JavaScript’s dynamic typing cautiously. TypeScript can help catch errors during development.

4. **Focus on Maintainability**:
   - Simplify your implementation by adhering to best practices and keeping classes focused on single responsibilities.

Explore the examples in this repository to see these patterns in action. Happy coding!

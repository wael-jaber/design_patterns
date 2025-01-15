import { AbstractFactoryTypes } from './types';

// Concrete Products
export class Circle implements AbstractFactoryTypes.Shape {
  draw(): string {
    return 'Drawing a Circle';
  }
}

export class Rectangle implements AbstractFactoryTypes.Shape {
  draw(): string {
    return 'Drawing a Rectangle';
  }
}

// Concrete Factories
export class CircleFactory implements AbstractFactoryTypes.ShapeFactory {
  createShape(): AbstractFactoryTypes.Shape {
    return new Circle();
  }
}

export class RectangleFactory implements AbstractFactoryTypes.ShapeFactory {
  createShape(): AbstractFactoryTypes.Shape {
    return new Rectangle();
  }
}

// Factory Producer to get factories dynamically
export class FactoryProducer {
  static getFactory(
    type: AbstractFactoryTypes.Factories
  ): AbstractFactoryTypes.ShapeFactory {
    switch (type) {
      case 'Circle':
        return new CircleFactory();

      case 'Rectangle':
        return new RectangleFactory();

      default:
        throw new Error('Invalid factory type');
    }
  }
}

//  Common Mistakes:
//  1. **Mixing Factory Responsibilities**:
//     - Avoid adding logic in factories beyond creating objects (e.g., initializing unrelated data).
//     - Factories should only deal with the creation of their specific products.
//
//  2. **Violating Open-Closed Principle**:
//     - If a new shape type is added (e.g., Triangle), you may need to modify multiple places (e.g., `FactoryProducer` and adding a new factory).
//     - To minimize changes, consider refactoring to a registration-based approach.
//
//  3. **Overusing the Pattern**:
//     - Abstract Factory is useful for families of related objects. If you only need one product type, a simple Factory Method might suffice.
//
//  4. **Not Handling Errors Gracefully**:
//     - Always validate input in the factory producer (e.g., returning clear error messages for invalid types).
//     - Throw meaningful exceptions rather than generic ones.
//
//  5. **Not Using Interfaces Properly**:
//     - Ensure your products (e.g., `Circle`, `Rectangle`) implement the product interface (`Shape`) to maintain flexibility.

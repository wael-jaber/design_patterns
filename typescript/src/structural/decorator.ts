import { DecoratorTypes } from './types';

// Concrete Component: The core object that will be decorated
export class SimpleCoffee implements DecoratorTypes.Coffee {
  getDescription(): string {
    return 'Simple Coffee';
  }

  getCost(): number {
    return 5; // Base cost of simple coffee
  }
}

// Base Decorator: Implements the Coffee interface and wraps a Coffee object
export abstract class CoffeeDecorator implements DecoratorTypes.Coffee {
  constructor(protected coffee: DecoratorTypes.Coffee) {}

  getDescription(): string {
    return this.coffee.getDescription(); // Delegates to the wrapped coffee
  }

  getCost(): number {
    return this.coffee.getCost(); // Delegates to the wrapped coffee
  }
}

// Concrete Decorators: Add new behaviors or properties
export class MilkDecorator extends CoffeeDecorator {
  getDescription(): string {
    return `${this.coffee.getDescription()}, Milk`;
  }

  getCost(): number {
    return this.coffee.getCost() + 2; // Adds the cost of milk
  }
}

export class SugarDecorator extends CoffeeDecorator {
  getDescription(): string {
    return `${this.coffee.getDescription()}, Sugar`;
  }

  getCost(): number {
    return this.coffee.getCost() + 1; // Adds the cost of sugar
  }
}

export class VanillaDecorator extends CoffeeDecorator {
  getDescription(): string {
    return `${this.coffee.getDescription()}, Vanilla`;
  }

  getCost(): number {
    return this.coffee.getCost() + 3; // Adds the cost of vanilla
  }
}

// Example Usage
// const simpleCoffee = new SimpleCoffee();
// console.log(simpleCoffee.getDescription());
// Output: Simple Coffee
// console.log(simpleCoffee.getCost());
// Output: 5
//
// const milkCoffee = new MilkDecorator(simpleCoffee);
// console.log(milkCoffee.getDescription());
// Output: Simple Coffee, Milk
// console.log(milkCoffee.getCost());
// Output: 7
//
// const vanillaMilkCoffee = new VanillaDecorator(milkCoffee);
// console.log(vanillaMilkCoffee.getDescription());
// Output: Simple Coffee, Milk, Vanilla
// console.log(vanillaMilkCoffee.getCost());
// Output: 10
//
//
// Common Mistakes to Avoid:
// 1. Overcomplicating the Decorators:
//    - Keep decorators focused on a single responsibility. Avoid adding unrelated behavior.
//
// 2. Losing Component Transparency:
//    - Ensure decorators conform to the same interface as the base component to maintain transparency.
//
// 3. Using Inheritance Instead of Composition:
//    - Always use composition for decorators. Direct inheritance can lead to tight coupling.
//
// 4. Forgetting to Delegate to the Component:
//    - Always delegate calls to the wrapped component where appropriate.

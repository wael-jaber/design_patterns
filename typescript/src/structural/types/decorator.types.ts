export namespace DecoratorTypes {
  export interface Coffee {
    getDescription(): string; // Returns a description of the coffee
    getCost(): number; // Returns the cost of the coffee
  }

  export abstract class CoffeeDecorator implements DecoratorTypes.Coffee {
    constructor(protected coffee: DecoratorTypes.Coffee) {}

    getDescription(): string {
      return this.coffee.getDescription(); // Delegates to the wrapped coffee
    }

    getCost(): number {
      return this.coffee.getCost(); // Delegates to the wrapped coffee
    }
  }
}

import { vehicleType } from './factory.types';
// Abstract Creator
abstract class Vehicle {
  abstract drive(): void;
}

// Concrete Creators
export class Car extends Vehicle {
  drive(): void {
    console.log('Driving a car!');
  }
}

export class Bike extends Vehicle {
  drive(): void {
    console.log('Riding a bike!');
  }
}

// Creator class
export class VehicleFactory {
  static createVehicle(type: vehicleType): Vehicle {
    if (type === vehicleType.car) {
      return new Car();
    } else if (type === vehicleType.bike) {
      return new Bike();
    } else {
      throw new Error('Unknown vehicle type');
    }
  }
}

// Common mistakes to avoid:

// 1. Tight Coupling Between Factory and Products
// Mistake: Directly tying the factory to specific concrete classes.
// Fix: Use abstractions (e.g., interfaces or base classes) to reduce coupling.

// 2. Missing Validation
// Mistake: Not handling invalid inputs properly in the factory.
// Fix: Always validate input and throw meaningful errors for unsupported cases.

// 3. Overcomplicating the Factory
// Mistake: Adding too much logic to the factory, making it hard to maintain.
// Fix: Keep the factory focused on object creation, and avoid business logic.

// 4. Hardcoding the Factory's Behavior
// Mistake: Embedding types like 'car' and 'bike' directly into the factory.
// Fix: Use a configuration file or dependency injection for extensibility.

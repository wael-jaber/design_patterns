import { vehicleType } from './factory.types';
// Abstract Creator
abstract class Vehicle {
  abstract drive(): void;
}

// Concrete Creators
class Car extends Vehicle {
  drive(): void {
    console.log('Driving a car!');
  }
}

class Bike extends Vehicle {
  drive(): void {
    console.log('Riding a bike!');
  }
}

// Creator class
class VehicleFactory {
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

// Usage
// const car = VehicleFactory.createVehicle('car');
// car.drive(); // Output: Driving a car!

// const bike = VehicleFactory.createVehicle('bike');
// bike.drive(); // Output: Riding a bike!

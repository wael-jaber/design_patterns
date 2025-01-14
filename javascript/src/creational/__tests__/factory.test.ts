import { expect, test, describe } from 'vitest';
import { Bike, Car, VehicleFactory } from '../factory';
import { vehicleType } from '../factory.types';

describe('Factory pattern tests', () => {
  test('should be able to drive car', () => {
    const car = new Car();
    expect(car).toHaveProperty('drive');
  });

  test('should be able to drive bike', () => {
    const bike = new Bike();
    expect(bike).toHaveProperty('drive');
  });

  test('should create car', () => {
    const car = VehicleFactory.createVehicle(vehicleType.car);
    expect(car).toBeInstanceOf(Car);
  });

  test('should create bike', () => {
    const bike = VehicleFactory.createVehicle(vehicleType.bike);
    expect(bike).toBeInstanceOf(Bike);
  });
});

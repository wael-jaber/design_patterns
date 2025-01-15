import { expect, test, describe } from 'vitest';

import { vehicleType } from '../factory.types';

describe('Factory pattern tests', () => {
  test('should be able to drive car', async () => {
    const { Car } = await import('../factory');
    const car = new Car();
    expect(car).toHaveProperty('drive');
  });

  test('should be able to drive bike', async () => {
    const { Bike } = await import('../factory');
    const bike = new Bike();
    expect(bike).toHaveProperty('drive');
  });

  test('should create car', async () => {
    const { VehicleFactory, Car } = await import('../factory');

    const car = VehicleFactory.createVehicle(vehicleType.car);
    expect(car).toBeInstanceOf(Car);
  });

  test('should create bike', async () => {
    const { Bike, VehicleFactory } = await import('../factory');

    const bike = VehicleFactory.createVehicle(vehicleType.bike);
    expect(bike).toBeInstanceOf(Bike);
  });
});

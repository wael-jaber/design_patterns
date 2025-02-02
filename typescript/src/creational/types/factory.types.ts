export namespace FactoryTypes {
  export enum vehicleType {
    bike = 'bike',
    car = 'car',
  }
  export abstract class Vehicle {
    abstract drive(): void;
  }
}

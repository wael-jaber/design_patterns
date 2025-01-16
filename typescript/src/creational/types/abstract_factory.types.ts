export namespace AbstractFactoryTypes {
  export interface Shape {
    draw(): string;
  }

  export interface ShapeFactory {
    createShape(): Shape;
  }

  export enum Factories {
    circle = 'Circle',
    rectangle = 'Rectangle',
  }
}

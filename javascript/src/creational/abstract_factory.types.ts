export interface Shape {
  draw(): string;
}

export interface ShapeFactory {
  createShape(): Shape;
}

export type Factories = 'Circle' | 'Rectangle';

import { describe, expect, test } from 'vitest';
import { AbstractFactoryTypes } from '../types';

describe('Abstract Factory pattern tests', () => {
  test('should have draw method on Circle instance', async () => {
    const { Circle } = await import('../abstract_factory');
    const circle = new Circle();
    expect(circle).toHaveProperty('draw');
    expect(circle.draw()).toBe('Drawing a Circle');
  });

  test('should have draw method on Rectangle instance', async () => {
    const { Rectangle } = await import('../abstract_factory');
    const rectangle = new Rectangle();
    expect(rectangle).toHaveProperty('draw');
    expect(rectangle.draw()).toBe('Drawing a Rectangle');
  });

  test('should have createShape method and return instance of circle', async () => {
    const { CircleFactory, Circle } = await import('../abstract_factory');
    const circleFactory = new CircleFactory();
    expect(circleFactory).toHaveProperty('createShape');
    const shape = circleFactory.createShape();
    expect(shape).toBeInstanceOf(Circle);
  });

  test('should have createShape method and return instance of rectangle', async () => {
    const { Rectangle, RectangleFactory } = await import('../abstract_factory');
    const rectangleFactory = new RectangleFactory();
    expect(rectangleFactory).toHaveProperty('createShape');
    const shape = rectangleFactory.createShape();
    expect(shape).toBeInstanceOf(Rectangle);
  });

  test('should have getFactory static method', async () => {
    const { FactoryProducer } = await import('../abstract_factory');

    expect(FactoryProducer).toHaveProperty('getFactory');
  });

  test('should return CircleFactory', async () => {
    const { FactoryProducer, CircleFactory } = await import(
      '../abstract_factory'
    );

    const circleFactory = FactoryProducer.getFactory(
      AbstractFactoryTypes.Factories.circle
    );
    expect(circleFactory).toBeInstanceOf(CircleFactory);
  });
  test('should return RectangleFactory', async () => {
    const { FactoryProducer, RectangleFactory } = await import(
      '../abstract_factory'
    );

    const rectangleFactory = FactoryProducer.getFactory(
      AbstractFactoryTypes.Factories.rectangle
    );
    expect(rectangleFactory).toBeInstanceOf(RectangleFactory);
  });

  test('should throw if the factory type is invalid', async () => {
    const { FactoryProducer } = await import('../abstract_factory');

    // @ts-expect-error : some devs will ignore ts and force this we need to make sure it throws no undefined behavior.
    expect(() => FactoryProducer.getFactory('triangle')).toThrowError(
      'Invalid factory type'
    );
  });
});

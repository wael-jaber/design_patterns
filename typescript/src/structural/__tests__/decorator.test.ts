import { describe, it, expect } from 'vitest';

describe('Decorator Pattern', () => {
  describe('SimpleCoffee', () => {
    it('should return the correct description and cost', async () => {
      const { SimpleCoffee } = await import('../decorator');

      const coffee = new SimpleCoffee();

      expect(coffee.getDescription()).toBe('Simple Coffee');
      expect(coffee.getCost()).toBe(5);
    });
  });

  describe('MilkDecorator', () => {
    it('should add milk to the description and increase the cost', async () => {
      const { SimpleCoffee, MilkDecorator } = await import('../decorator');

      const coffee = new SimpleCoffee();
      const milkCoffee = new MilkDecorator(coffee);

      expect(milkCoffee.getDescription()).toBe('Simple Coffee, Milk');
      expect(milkCoffee.getCost()).toBe(7);
    });
  });

  describe('SugarDecorator', () => {
    it('should add sugar to the description and increase the cost', async () => {
      const { SimpleCoffee, SugarDecorator } = await import('../decorator');

      const coffee = new SimpleCoffee();
      const sugarCoffee = new SugarDecorator(coffee);

      expect(sugarCoffee.getDescription()).toBe('Simple Coffee, Sugar');
      expect(sugarCoffee.getCost()).toBe(6);
    });
  });

  describe('VanillaDecorator', () => {
    it('should add vanilla to the description and increase the cost', async () => {
      const { SimpleCoffee, VanillaDecorator } = await import('../decorator');

      const coffee = new SimpleCoffee();
      const vanillaCoffee = new VanillaDecorator(coffee);
      expect(vanillaCoffee.getDescription()).toBe('Simple Coffee, Vanilla');
      expect(vanillaCoffee.getCost()).toBe(8);
    });
  });

  describe('Multiple Decorators', () => {
    it('should correctly combine multiple decorators', async () => {
      const { SimpleCoffee, MilkDecorator, SugarDecorator, VanillaDecorator } =
        await import('../decorator');

      const coffee = new SimpleCoffee();
      const milkCoffee = new MilkDecorator(coffee);
      const sugarMilkCoffee = new SugarDecorator(milkCoffee);
      const vanillaSugarMilkCoffee = new VanillaDecorator(sugarMilkCoffee);

      expect(vanillaSugarMilkCoffee.getDescription()).toBe(
        'Simple Coffee, Milk, Sugar, Vanilla'
      );
      expect(vanillaSugarMilkCoffee.getCost()).toBe(11);
    });
  });
});

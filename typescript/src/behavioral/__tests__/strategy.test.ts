import { describe, it, expect } from 'vitest';

describe('Strategy pattern tests', () => {
  describe('AddStrategy', () => {
    it('should correctly add two numbers', async () => {
      const { AddStrategy } = await import('../strategy');
      const strategy = new AddStrategy();
      expect(strategy.execute(5, 3)).toBe(8);
    });
  });

  describe('SubtractStrategy', () => {
    it('should correctly subtract two numbers', async () => {
      const { SubtractStrategy } = await import('../strategy');
      const strategy = new SubtractStrategy();
      expect(strategy.execute(5, 3)).toBe(2);
    });
  });

  describe('MultiplyStrategy', () => {
    it('should correctly multiply two numbers', async () => {
      const { MultiplyStrategy } = await import('../strategy');
      const strategy = new MultiplyStrategy();
      expect(strategy.execute(5, 3)).toBe(15);
    });
  });

  describe('Calculator (Context)', () => {
    it('should execute the strategy correctly', async () => {
      const { AddStrategy, Calculator } = await import('../strategy');
      const calculator = new Calculator(new AddStrategy());

      expect(calculator.calculate(4, 2)).toBe(6);
    });

    it('should allow strategy to be changed at runtime', async () => {
      const { AddStrategy, SubtractStrategy, Calculator } = await import(
        '../strategy'
      );
      const calculator = new Calculator(new AddStrategy());

      expect(calculator.calculate(10, 5)).toBe(15);

      calculator.setStrategy(new SubtractStrategy());
      expect(calculator.calculate(10, 5)).toBe(5);
    });

    it('should handle multiple strategies correctly', async () => {
      const { AddStrategy, SubtractStrategy, MultiplyStrategy, Calculator } =
        await import('../strategy');

      const calculator = new Calculator(new AddStrategy());
      expect(calculator.calculate(3, 3)).toBe(6);

      calculator.setStrategy(new SubtractStrategy());
      expect(calculator.calculate(10, 7)).toBe(3);

      calculator.setStrategy(new MultiplyStrategy());
      expect(calculator.calculate(4, 5)).toBe(20);
    });
  });
});

import { StrategyTypes } from './types';

// Concrete Strategies: Implement specific algorithms
export class AddStrategy implements StrategyTypes.Strategy {
  execute(a: number, b: number): number {
    return a + b;
  }
}

export class SubtractStrategy implements StrategyTypes.Strategy {
  execute(a: number, b: number): number {
    return a - b;
  }
}

export class MultiplyStrategy implements StrategyTypes.Strategy {
  execute(a: number, b: number): number {
    return a * b;
  }
}

// Context: Maintains a reference to the strategy object
export class Calculator {
  private strategy: StrategyTypes.Strategy;

  constructor(strategy: StrategyTypes.Strategy) {
    this.strategy = strategy;
  }

  // Sets a different strategy at runtime
  setStrategy(strategy: StrategyTypes.Strategy): void {
    this.strategy = strategy;
  }

  // Executes the strategy's algorithm
  calculate(a: number, b: number): number {
    return this.strategy.execute(a, b);
  }
}

//  Example Usage
//  const calculator = new Calculator(new AddStrategy());
//  console.log(calculator.calculate(5, 3)); // Output: 8
//
//  calculator.setStrategy(new SubtractStrategy());
//  console.log(calculator.calculate(5, 3)); // Output: 2
//
//  calculator.setStrategy(new MultiplyStrategy());
//  console.log(calculator.calculate(5, 3)); // Output: 15
//
//
//  Common Mistakes to Avoid:
//  1. **Hardcoding Strategies**:
//     - Avoid embedding strategy-specific logic directly in the context class. Always delegate to the strategy.
//
//  2. **Tight Coupling**:
//     - Ensure the context class does not depend on specific strategy implementations.
//
//  3. **Unused Strategies**:
//     - Adding too many strategies without practical use cases can bloat the codebase.
//
//  Tips:
//  - Use TypeScript interfaces to enforce a common contract for all strategies.
//  - Ensure the context class is flexible enough to switch strategies at runtime.
//  - Test each strategy independently to ensure correctness.

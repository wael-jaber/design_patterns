import { describe, it, expect } from 'vitest';

describe('State pattern tests', () => {
  describe('ConcreteStateA', () => {
    it('should handle request in State A', async () => {
      const { ConcreteStateA } = await import('../state');
      const state = new ConcreteStateA();

      expect(state.handle()).toBe('State A: Handling request.');
    });
  });

  describe('ConcreteStateB', () => {
    it('should handle request in State B', async () => {
      const { ConcreteStateB } = await import('../state');
      const state = new ConcreteStateB();

      expect(state.handle()).toBe('State B: Handling request.');
    });
  });

  describe('Context', () => {
    it('should execute the initial state correctly', async () => {
      const { Context, ConcreteStateA } = await import('../state');

      const context = new Context(new ConcreteStateA());
      expect(context.request()).toBe('State A: Handling request.');
    });

    it('should switch to another state dynamically', async () => {
      const { Context, ConcreteStateA, ConcreteStateB } = await import(
        '../state'
      );

      const context = new Context(new ConcreteStateA());
      expect(context.request()).toBe('State A: Handling request.');

      context.setState(new ConcreteStateB());
      expect(context.request()).toBe('State B: Handling request.');
    });

    it('should transition between states multiple times', async () => {
      const { Context, ConcreteStateA, ConcreteStateB } = await import(
        '../state'
      );

      const context = new Context(new ConcreteStateA());
      expect(context.request()).toBe('State A: Handling request.');

      context.setState(new ConcreteStateB());
      expect(context.request()).toBe('State B: Handling request.');

      context.setState(new ConcreteStateA());
      expect(context.request()).toBe('State A: Handling request.');
    });
  });
});

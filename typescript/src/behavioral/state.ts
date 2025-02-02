import { StateTypes } from './types';

// Concrete States: Implement specific behaviors
export class ConcreteStateA implements StateTypes.State {
  handle(): string {
    return 'State A: Handling request.';
  }
}

export class ConcreteStateB implements StateTypes.State {
  handle(): string {
    return 'State B: Handling request.';
  }
}

// Context: Maintains a reference to the current state and delegates behavior
export class Context {
  private state: StateTypes.State;

  constructor(initialState: StateTypes.State) {
    this.state = initialState;
  }

  // Sets a different state at runtime
  setState(state: StateTypes.State): void {
    this.state = state;
  }

  // Executes the current state's behavior
  request(): string {
    return this.state.handle();
  }
}

//  Example Usage
//  const context = new Context(new ConcreteStateA());
//  console.log(context.request()); // Output: State A: Handling request.
//
//  context.setState(new ConcreteStateB());
//  console.log(context.request()); // Output: State B: Handling request.
//
//
//  Common Mistakes to Avoid:
//  1. **Forgetting to Update the State**:
//     - Ensure `setState` is used when transitioning between states.
//
//  2. **Tight Coupling Between Context and States**:
//     - The context should not depend on specific states beyond the `State` interface.
//
//  3. **Creating Unnecessary States**:
//     - Only implement states that provide meaningful behavior changes.
//
//  Tips:
//  - Use TypeScript’s interfaces to enforce consistency across states.
//  - Ensure states remain interchangeable without modifying the context class.
//  - Test transitions between states to ensure correct behavior.

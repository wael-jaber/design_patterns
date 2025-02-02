import { MediatorTypes } from './types';

// Concrete Mediator: Implements communication logic between components
export class ConcreteMediator implements MediatorTypes.Mediator {
  private colleagues: MediatorTypes.Colleague[] = [];

  // Registers a colleague in the mediator
  register(colleague: MediatorTypes.Colleague): void {
    this.colleagues.push(colleague);
    colleague.setMediator(this);
  }

  // Handles communication between colleagues
  notify(sender: MediatorTypes.Colleague, event: string): void {
    for (const colleague of this.colleagues) {
      if (colleague !== sender) {
        colleague.receive(event);
      }
    }
  }
}

// Concrete Colleague A
export class ColleagueA extends MediatorTypes.Colleague {
  send(event: string): void {
    console.log(`ColleagueA sends: ${event}`);
    this.mediator.notify(this, event);
  }

  receive(event: string): void {
    console.log(`ColleagueA received: ${event}`);
  }
}

// Concrete Colleague B
export class ColleagueB extends MediatorTypes.Colleague {
  send(event: string): void {
    console.log(`ColleagueB sends: ${event}`);
    this.mediator.notify(this, event);
  }

  receive(event: string): void {
    console.log(`ColleagueB received: ${event}`);
  }
}

//  Example Usage
//  const mediator = new ConcreteMediator();
//
//  const colleagueA = new ColleagueA();
//  const colleagueB = new ColleagueB();
//
//  mediator.register(colleagueA);
//  mediator.register(colleagueB);
//
//  colleagueA.send("Hello from A!"); // B should receive the message
//  colleagueB.send("Hello from B!"); // A should receive the message
//
//
//  Common Mistakes to Avoid:
//  1. **Bypassing the Mediator**:
//     - Direct communication between colleagues defeats the purpose of the pattern.
//
//  2. **Overcomplicating Mediator Logic**:
//     - Keep the mediator’s logic simple and focused on coordination, not business rules.
//
//  3. **Tight Coupling Between Mediator and Colleagues**:
//     - The mediator should remain generic to facilitate easy reuse and extension.
//
//  Tips:
//  - Use TypeScript’s interfaces to enforce a clear contract for colleagues and the mediator.
//  - Ensure the mediator is responsible only for coordinating communication, not implementing business logic.
//  - Test interactions thoroughly to confirm correct communication flow.

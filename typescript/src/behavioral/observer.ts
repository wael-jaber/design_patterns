import { ObserverTypes } from './types';

// Concrete Subject: Maintains a list of observers and notifies them of changes
export class ConcreteSubject implements ObserverTypes.Subject {
  private observers: ObserverTypes.Observer[] = [];

  // Adds an observer to the list
  attach(observer: ObserverTypes.Observer): void {
    if (!this.observers.includes(observer)) {
      this.observers.push(observer);
    }
  }

  // Removes an observer from the list
  detach(observer: ObserverTypes.Observer): void {
    this.observers = this.observers.filter((obs) => obs !== observer);
  }

  // Notifies all observers about an event
  notify(message: string): void {
    for (const observer of this.observers) {
      observer.update(message);
    }
  }
}

// Concrete Observer: Implements the update method to handle notifications
export class ConcreteObserver implements ObserverTypes.Observer {
  constructor(private name: string) {}

  // Receives updates from the subject
  update(message: string): void {
    console.log(`${this.name} received message: ${message}`);
  }
}

//  Example Usage
//  const subject = new ConcreteSubject();
//
//  const observer1 = new ConcreteObserver("Observer 1");
//  const observer2 = new ConcreteObserver("Observer 2");
//
//  subject.attach(observer1);
//  subject.attach(observer2);
//
//  subject.notify("This is the first message."); // Both observers will receive the message
//
//  subject.detach(observer1);
//
//  subject.notify("This is the second message."); // Only Observer 2 will receive the message
//
//
//  Common Mistakes to Avoid:
//  1. **Memory Leaks**:
//     - Forgetting to detach observers can lead to memory leaks in applications with many dynamic observers.
//
//  2. **Overloading the Notify Loop**:
//     - Ensure the notify loop doesn’t contain heavy operations that could block the system.
//
//  3. **Tight Coupling**:
//     - Avoid creating dependencies between the subject and specific observer implementations.
//
//  Tips:
//  - Use weak references (if supported) to prevent memory leaks when observers are removed dynamically.
//  - Test the behavior with multiple observers and rapid updates to ensure the system scales well.
//  - Encapsulate complex update logic in the observers to keep the subject clean and focused on notification.

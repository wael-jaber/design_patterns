export class Singleton {
  // Static instance to hold the single instance of the class
  private static instance: Singleton;

  // Private constructor to prevent instantiation from outside
  private constructor() {
    console.log('Singleton instance created');
  }

  // Static method to provide access to the instance
  public static getInstance(): Singleton {
    if (!Singleton.instance) {
      Singleton.instance = new Singleton(); // Instance created here
    }
    return Singleton.instance;
  }

  // Example method
  public greet(): void {
    console.log('Hello from the Singleton!');
  }
}

// Common mistakes to avoid:

// 1. Direct instantiation:
// const singleton = new Singleton();
// Error: Constructor is private, but attempting this is a common mistake.
// Fix: Always use Singleton.getInstance() to access the instance.

// 2. Not handling multithreading in environments like Node.js.
// Example (theoretical):
// if (!Singleton.instance) {
//     Singleton.instance = new Singleton(); // Potential race condition
// }
// Fix: Use locking or synchronization mechanisms in environments where multithreading might cause issues.
// In a typical TypeScript project, this is less common but relevant for advanced cases.

// 3. Allowing the Singleton to manage mutable state directly:
// Singleton.instance.someState = 'value';
// Fix: Avoid using the Singleton to store mutable state. Instead, ensure the class's methods are stateless or properly encapsulated.

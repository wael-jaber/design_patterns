import { ChainOfResponsibilityTypes } from './types';

// Concrete Handlers: Implement specific request handling
export class AuthenticationHandler extends ChainOfResponsibilityTypes.AbstractHandler {
  handle(request: string): string | null {
    if (request === 'auth') {
      return 'Authentication successful';
    }
    return super.handle(request);
  }
}

export class AuthorizationHandler extends ChainOfResponsibilityTypes.AbstractHandler {
  handle(request: string): string | null {
    if (request === 'authorize') {
      return 'Authorization granted';
    }
    return super.handle(request);
  }
}

export class LoggingHandler extends ChainOfResponsibilityTypes.AbstractHandler {
  handle(request: string): string | null {
    console.log(`Logging request: ${request}`);
    return super.handle(request);
  }
}

//  Example Usage
//  const authHandler = new AuthenticationHandler();
//  const authorizeHandler = new AuthorizationHandler();
//  const logHandler = new LoggingHandler();
//
//  // Chain setup: log -> auth -> authorize
//  logHandler.setNext(authHandler).setNext(authorizeHandler);
//
//  console.log(logHandler.handle('auth')); // Output: Authentication successful
//  console.log(logHandler.handle('authorize')); // Output: Authorization granted
//  console.log(logHandler.handle('invalid')); // Output: No handler processed the request.
//
//
//  Common Mistakes to Avoid:
//  1. **Skipping the Next Handler**:
//     - Ensure each handler calls `super.handle(request)` if it does not process the request.
//
//  2. **Overcomplicating the Chain**:
//     - Only use handlers where necessary. Excessive handlers can make debugging harder.
//
//  3. **Improper Chain Setup**:
//     - Set handlers in a logical order based on dependency (e.g., logging → authentication → authorization).
//
//  Tips:
//  - Use TypeScript’s abstract classes to provide default handler behavior.
//  - Keep each handler focused on a single responsibility.
//  - Test chains with different configurations to ensure flexibility.

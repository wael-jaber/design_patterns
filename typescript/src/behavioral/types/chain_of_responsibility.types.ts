export namespace ChainOfResponsibilityTypes {
  export interface Handler {
    setNext(handler: Handler): Handler;
    handle(request: string): string | null;
  }

  export abstract class AbstractHandler implements Handler {
    private nextHandler: Handler | null = null;

    setNext(handler: Handler): Handler {
      this.nextHandler = handler;
      return handler; // Allows chaining
    }

    handle(request: string): string | null {
      if (this.nextHandler) {
        return this.nextHandler.handle(request);
      }
      return null;
    }
  }
}

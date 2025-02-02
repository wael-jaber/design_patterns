export namespace MediatorTypes {
  export interface Mediator {
    notify(sender: Colleague, event: string): void;
  }
  export abstract class Colleague {
    protected mediator!: MediatorTypes.Mediator;

    setMediator(mediator: MediatorTypes.Mediator): void {
      this.mediator = mediator;
    }

    abstract send(event: string): void;
    abstract receive(event: string): void;
  }
}

export namespace ObserverTypes {
  export interface Observer {
    update(message: string): void;
  }

  export interface Subject {
    attach(observer: Observer): void;
    detach(observer: Observer): void;
    notify(message: string): void;
  }
}

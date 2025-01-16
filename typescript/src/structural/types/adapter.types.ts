export namespace AdapterTypes {
  export interface NewPaymentGateway {
    pay(amount: number): void;
  }
}

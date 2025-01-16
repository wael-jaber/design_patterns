import { AdapterTypes } from './types';

// Adaptee: Old interface
export class OldPaymentGateway {
  processPayment(amount: number): void {
    console.log(`Processed $${amount} using OldPaymentGateway.`);
  }
}

// Adapter: Converts OldPaymentGateway to the NewPaymentGateway interface
export class PaymentAdapter implements AdapterTypes.NewPaymentGateway {
  private oldGateway: OldPaymentGateway;

  constructor(oldGateway: OldPaymentGateway) {
    this.oldGateway = oldGateway;
  }

  pay(amount: number): void {
    this.oldGateway.processPayment(amount); // Adapts the method
  }
}

// Usage Example: Client works with NewPaymentGateway
// const oldGateway = new OldPaymentGateway();
// const adapter = new PaymentAdapter(oldGateway);

// adapter.pay(100);
// Output: Processed $100 using OldPaymentGateway.

// Common Mistakes to Avoid:
// 1. **Skipping Interface Definition**:
//    - Always define the target interface (e.g., NewPaymentGateway) to ensure the adapter conforms to the expected methods.
//
// 2. **Overcomplicating the Adapter**:
//    - Keep the adapter's logic simple and focused on translating method calls.
//
// 3. **Modifying the Adaptee**:
//    - Avoid altering the original adaptee (OldPaymentGateway). The adapter should work independently.
//
// 4. **Not Handling Edge Cases**:
//    - Ensure the adapter gracefully handles scenarios like invalid arguments or unexpected behavior from the adaptee.
//
// 5. **Unnecessary Use of Adapter**:
//    - Only use the Adapter Pattern when you cannot modify the adaptee to meet the new requirements directly.

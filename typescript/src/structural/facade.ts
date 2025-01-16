/// Subsystem 1: Handles payment processing
export class PaymentSystem {
  processPayment(amount: number): string {
    return `Payment of $${amount} processed successfully.`;
  }
}

// Subsystem 2: Manages inventory
export class InventorySystem {
  checkStock(product: string): boolean {
    return true; // Mock implementation: all products are in stock
  }

  reduceStock(product: string, quantity: number): string {
    return `${quantity} unit(s) of ${product} reduced from stock.`;
  }
}

// Subsystem 3: Handles order notifications
export class NotificationSystem {
  sendOrderConfirmation(orderId: string): string {
    return `Order confirmation sent for order ID: ${orderId}.`;
  }
}

// Facade: Simplifies interactions with subsystems
export class OrderFacade {
  constructor(
    private paymentSystem: PaymentSystem,
    private inventorySystem: InventorySystem,
    private notificationSystem: NotificationSystem
  ) {}

  placeOrder(product: string, quantity: number, amount: number): string {
    if (!this.inventorySystem.checkStock(product)) {
      return 'Order failed: Product is out of stock.';
    }

    const paymentResult = this.paymentSystem.processPayment(amount);
    const stockResult = this.inventorySystem.reduceStock(product, quantity);
    const notificationResult =
      this.notificationSystem.sendOrderConfirmation('12345');

    return [
      paymentResult,
      stockResult,
      notificationResult,
      'Order placed successfully.',
    ].join('\n');
  }
}

// Example Usage
// const orderFacade = new OrderFacade();
// console.log(orderFacade.placeOrder("Laptop", 1, 1500));
//
// Common Mistakes to Avoid:
// 1. Tight Coupling:
//    - Avoid exposing the inner workings of subsystems through the facade. The goal is to simplify.
//
// 2. Overloading the Facade:
//    - Keep the facade focused on simplifying subsystem interactions. Don't add unrelated logic.
//
// 3. Ignoring Subsystem Usability:
//    - While the facade simplifies interactions, subsystems should remain usable for advanced use cases.

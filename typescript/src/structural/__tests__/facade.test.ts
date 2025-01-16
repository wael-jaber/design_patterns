import { describe, it, expect, vi } from 'vitest';

describe('Facade Pattern', () => {
  describe('PaymentSystem', () => {
    it('should process a payment and return a success message', async () => {
      const { PaymentSystem } = await import('../facade');

      const paymentSystem = new PaymentSystem();
      const result = paymentSystem.processPayment(500);

      expect(result).toBe('Payment of $500 processed successfully.');
    });
  });

  describe('InventorySystem', () => {
    it('should return true when a product is in stock', async () => {
      const { InventorySystem } = await import('../facade');

      const inventorySystem = new InventorySystem();
      const result = inventorySystem.checkStock('Laptop');

      expect(result).toBe(true);
    });

    it('should reduce stock and return a success message', async () => {
      const { InventorySystem } = await import('../facade');

      const inventorySystem = new InventorySystem();
      const result = inventorySystem.reduceStock('Laptop', 2);

      expect(result).toBe('2 unit(s) of Laptop reduced from stock.');
    });
  });

  describe('NotificationSystem', () => {
    it('should send an order confirmation and return a success message', async () => {
      const { NotificationSystem } = await import('../facade');

      const notificationSystem = new NotificationSystem();
      const result = notificationSystem.sendOrderConfirmation('12345');

      expect(result).toBe('Order confirmation sent for order ID: 12345.');
    });
  });

  describe('OrderFacade', () => {
    it('should place an order successfully when stock is available and payment is processed', async () => {
      const {
        PaymentSystem,
        InventorySystem,
        NotificationSystem,
        OrderFacade,
      } = await import('../facade');

      const paymentSystem = new PaymentSystem();
      const inventorySystem = new InventorySystem();
      const notificationSystem = new NotificationSystem();

      const facade = new OrderFacade(
        paymentSystem,
        inventorySystem,
        notificationSystem
      );
      const result = facade.placeOrder('Laptop', 1, 1500);

      expect(result).toContain('Payment of $1500 processed successfully.');
      expect(result).toContain('1 unit(s) of Laptop reduced from stock.');
      expect(result).toContain('Order confirmation sent for order ID: 12345.');
      expect(result).toContain('Order placed successfully.');
    });

    it('should fail the order when the product is out of stock', async () => {
      const {
        PaymentSystem,
        InventorySystem,
        NotificationSystem,
        OrderFacade,
      } = await import('../facade');

      const paymentSystem = new PaymentSystem();
      const inventorySystem = new InventorySystem();
      const notificationSystem = new NotificationSystem();

      const inventorySpy = vi
        .spyOn(inventorySystem, 'checkStock')
        .mockReturnValue(false);

      const facade = new OrderFacade(
        paymentSystem,
        inventorySystem,
        notificationSystem
      );
      const result = facade.placeOrder('Smartphone', 1, 1000);

      expect(result).toBe('Order failed: Product is out of stock.');

      inventorySpy.mockRestore();
    });

    it('should interact with all subsystems correctly', async () => {
      const {
        PaymentSystem,
        InventorySystem,
        NotificationSystem,
        OrderFacade,
      } = await import('../facade');

      const paymentSystem = new PaymentSystem();
      const inventorySystem = new InventorySystem();
      const notificationSystem = new NotificationSystem();

      const paymentSpy = vi.spyOn(paymentSystem, 'processPayment');
      const inventoryCheckSpy = vi.spyOn(inventorySystem, 'checkStock');
      const inventoryReduceSpy = vi.spyOn(inventorySystem, 'reduceStock');
      const notificationSpy = vi.spyOn(
        notificationSystem,
        'sendOrderConfirmation'
      );

      const facade = new OrderFacade(
        paymentSystem,
        inventorySystem,
        notificationSystem
      );
      facade.placeOrder('Tablet', 1, 800);

      expect(paymentSpy).toHaveBeenCalledWith(800);
      expect(inventoryCheckSpy).toHaveBeenCalledWith('Tablet');
      expect(inventoryReduceSpy).toHaveBeenCalledWith('Tablet', 1);
      expect(notificationSpy).toHaveBeenCalledWith('12345');
    });
  });
});

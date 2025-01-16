import { describe, it, expect, vi } from 'vitest';

describe('Adapter Pattern', () => {
  describe('OldPaymentGateway', () => {
    it('should process payment using the old interface', async () => {
      const { OldPaymentGateway } = await import('../adapter');
      const oldGateway = new OldPaymentGateway();
      const consoleSpy = vi.spyOn(console, 'log');

      oldGateway.processPayment(100);

      expect(consoleSpy).toHaveBeenCalledWith(
        'Processed $100 using OldPaymentGateway.'
      );
      consoleSpy.mockRestore();
    });
  });

  describe('PaymentAdapter', () => {
    it('should adapt the old interface to the new interface', async () => {
      const { OldPaymentGateway, PaymentAdapter } = await import('../adapter');

      const oldGateway = new OldPaymentGateway();
      const adapter = new PaymentAdapter(oldGateway);
      const consoleSpy = vi.spyOn(console, 'log');

      adapter.pay(100);

      expect(consoleSpy).toHaveBeenCalledWith(
        'Processed $100 using OldPaymentGateway.'
      );
      consoleSpy.mockRestore();
    });

    it('should allow the client to use the new interface seamlessly', async () => {
      const { OldPaymentGateway, PaymentAdapter } = await import('../adapter');
      const oldGateway = new OldPaymentGateway();
      const adapter = new PaymentAdapter(oldGateway);

      // Simulate client code using the new interface
      const payMethodSpy = vi.spyOn(adapter, 'pay');
      adapter.pay(200);

      expect(payMethodSpy).toHaveBeenCalledWith(200);
      payMethodSpy.mockRestore();
    });
  });
});

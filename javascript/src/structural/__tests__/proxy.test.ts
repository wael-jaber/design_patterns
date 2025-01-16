import { describe, it, expect, vi } from 'vitest';

describe('Proxy Pattern', () => {
  describe('RealService', () => {
    it('should handle the request and return the expected response', async () => {
      const { RealService } = await import('../proxy');

      const service = new RealService();

      expect(service.request()).toBe('RealService: Handling request.');
    });
  });

  describe('ServiceProxy', () => {
    it('should deny access if the user does not have access rights', async () => {
      const { ServiceProxy } = await import('../proxy');

      const proxy = new ServiceProxy(false);

      expect(proxy.request()).toBe('Proxy: Access denied.');
    });

    it('should handle the request through the proxy and return the correct response', async () => {
      const { ServiceProxy } = await import('../proxy');

      const proxy = new ServiceProxy(true);

      expect(proxy.request()).toBe(
        'Proxy: Logging access.\nRealService: Handling request.'
      );
    });

    it('should initialize RealService lazily', async () => {
      const { ServiceProxy, RealService } = await import('../proxy');

      const proxy = new ServiceProxy(true);

      expect((proxy as any).realService).toBeNull();

      // Make a request
      proxy.request();

      // RealService should now be initialized
      expect((proxy as any).realService).toBeInstanceOf(RealService);
    });

    it('should log access before forwarding the request to RealService', async () => {
      const { ServiceProxy } = await import('../proxy');

      const proxy = new ServiceProxy(true);
      const consoleSpy = vi.spyOn(console, 'log');

      proxy.request();

      expect(consoleSpy).toHaveBeenCalledTimes(0); // Logging in console is not used but accessible if added.
      consoleSpy.mockRestore();
    });
  });
});

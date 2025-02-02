import { describe, it, expect, vi } from 'vitest';

describe('Chain of Responsibility pattern tests', () => {
  describe('AuthenticationHandler', () => {
    it('should process authentication requests', async () => {
      const { AuthenticationHandler } = await import(
        '../chain_of_responsibility'
      );
      const handler = new AuthenticationHandler();

      expect(handler.handle('auth')).toBe('Authentication successful');
    });

    it('should pass unprocessed requests to the next handler', async () => {
      const { AuthenticationHandler, AuthorizationHandler } = await import(
        '../chain_of_responsibility'
      );

      const authHandler = new AuthenticationHandler();
      const authorizeHandler = new AuthorizationHandler();
      authHandler.setNext(authorizeHandler);

      expect(authHandler.handle('authorize')).toBe('Authorization granted');
    });
  });

  describe('AuthorizationHandler', () => {
    it('should process authorization requests', async () => {
      const { AuthorizationHandler } = await import(
        '../chain_of_responsibility'
      );
      const handler = new AuthorizationHandler();

      expect(handler.handle('authorize')).toBe('Authorization granted');
    });

    it('should return null if no handler processes the request', async () => {
      const { AuthorizationHandler } = await import(
        '../chain_of_responsibility'
      );
      const handler = new AuthorizationHandler();

      expect(handler.handle('unknown')).toBeNull();
    });
  });

  describe('LoggingHandler', () => {
    it('should log the request and pass it to the next handler', async () => {
      const { LoggingHandler, AuthenticationHandler } = await import(
        '../chain_of_responsibility'
      );

      const logHandler = new LoggingHandler();
      const authHandler = new AuthenticationHandler();
      logHandler.setNext(authHandler);

      const consoleSpy = vi.spyOn(console, 'log');

      logHandler.handle('auth');

      expect(consoleSpy).toHaveBeenCalledWith('Logging request: auth');
      expect(logHandler.handle('auth')).toBe('Authentication successful');

      consoleSpy.mockRestore();
    });
  });

  describe('Full Chain Execution', () => {
    it('should process requests through the full chain', async () => {
      const { AuthenticationHandler, AuthorizationHandler, LoggingHandler } =
        await import('../chain_of_responsibility');

      const logHandler = new LoggingHandler();
      const authHandler = new AuthenticationHandler();
      const authorizeHandler = new AuthorizationHandler();

      logHandler.setNext(authHandler).setNext(authorizeHandler);

      expect(logHandler.handle('auth')).toBe('Authentication successful');
      expect(logHandler.handle('authorize')).toBe('Authorization granted');
      expect(logHandler.handle('unknown')).toBeNull();
    });
  });
});

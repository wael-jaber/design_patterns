import { ProxyTypes } from './types';

// RealSubject: The actual implementation of the service
export class RealService implements ProxyTypes.Service {
  request(): string {
    return 'RealService: Handling request.';
  }
}

// Proxy: Controls access to the RealService
export class ServiceProxy implements ProxyTypes.Service {
  private realService: RealService | null = null; // Lazy initialization

  constructor(private hasAccess: boolean) {}

  request(): string {
    if (!this.hasAccess) {
      return 'Proxy: Access denied.';
    }

    // Initialize the RealService lazily
    if (this.realService === null) {
      this.realService = new RealService();
    }

    return `Proxy: Logging access.\n${this.realService.request()}`;
  }
}

// Example Usage
// const proxyWithAccess = new ServiceProxy(true);
// console.log(proxyWithAccess.request()); // Output: Proxy: Logging access. RealService: Handling request.
//
// const proxyWithoutAccess = new ServiceProxy(false);
// console.log(proxyWithoutAccess.request()); // Output: Proxy: Access denied.
//
//
// Common Mistakes to Avoid:
// 1. **Bypassing the Proxy**:
//    - Avoid scenarios where clients directly access the RealSubject, bypassing the Proxy.
//
// 2. **Unnecessary Complexity**:
//    - Only use the Proxy Pattern when access control, caching, or lazy initialization is required.
//
// 3. **Leaking Proxy Logic**:
//    - Ensure clients don't need to know whether they're dealing with the Proxy or the RealSubject.

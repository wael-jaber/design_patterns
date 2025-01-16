export namespace ProxyTypes {
  export interface Service {
    request(): string; // The operation exposed by both RealSubject and Proxy
  }
}

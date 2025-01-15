export interface Prototype<T> {
  clone(): T;
}

export interface DocumentType {
  title: string;
  content: string;
  metadata: Record<string, any>;
}

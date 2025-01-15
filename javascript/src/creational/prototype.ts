import { Prototype, DocumentType } from './prototype.types';

/**
 * Concrete Prototype: Implements the Prototype interface.
 */
export class Document implements Prototype<Document> {
  public title: string;
  public content: string;
  public metadata: Record<string, any>;

  constructor({ title, content, metadata = {} }: DocumentType) {
    this.title = title;
    this.content = content;
    this.metadata = metadata;
  }

  /**
   * Clone the document to create a new instance with the same data.
   */
  clone(): Document {
    return new Document({
      title: this.title,
      content: this.content,
      metadata: { ...this.metadata }, // Deep copy of the metadata object
    });
  }

  /**
   * Display the document's details.
   */
  describe(): string {
    return `Title: ${this.title}, Content: ${
      this.content
    }, Metadata: ${JSON.stringify(this.metadata)}`;
  }
}

// Common Mistakes:
// 1. **Shallow Copying Complex Objects**:
//    - Ensure deep copies are made for nested objects or arrays in the prototype.
//    - Using `{ ...this.metadata }` ensures the `metadata` object is not shared between clones.
//
// 2. **Directly Manipulating the Clone's State**:
//    - Avoid modifying shared data between the original and the clone, as it breaks the independence of prototypes.
//
// 3. **Using Prototype Where It's Unnecessary**:
//    - The Prototype pattern is most useful when object creation is costly or complex. For simple objects, it might add unnecessary complexity.
//
// 4. **Omitting the Prototype Interface**:
//    - Always define a `clone()` method to maintain consistency and clarity when working with the Prototype pattern.

import { describe, it, expect } from 'vitest';
import { DocumentType } from '../prototype.types';

describe('Prototype Pattern', () => {
  describe('Document class', () => {
    const initialData: DocumentType = {
      title: 'Sample Document',
      content: 'This is a test document.',
      metadata: { author: 'John Doe', pages: 10 },
    };

    it('should create a new document with the given properties', async () => {
      const { Document } = await import('../prototype');

      const document = new Document(initialData);

      expect(document.title).toBe(initialData.title);
      expect(document.content).toBe(initialData.content);
      expect(document.metadata).toEqual(initialData.metadata);
    });

    it('should clone the document with the same properties', async () => {
      const { Document } = await import('../prototype');

      const originalDocument = new Document(initialData);
      const clonedDocument = originalDocument.clone();

      expect(clonedDocument).not.toBe(originalDocument); // Ensure a new instance
      expect(clonedDocument.title).toBe(originalDocument.title);
      expect(clonedDocument.content).toBe(originalDocument.content);
      expect(clonedDocument.metadata).toEqual(originalDocument.metadata);
    });

    it('should create a deep copy of the metadata when cloning', async () => {
      const { Document } = await import('../prototype');

      const originalDocument = new Document(initialData);
      const clonedDocument = originalDocument.clone();

      // Modify the cloned metadata
      clonedDocument.metadata.author = 'Jane Doe';

      expect(clonedDocument.metadata.author).toBe('Jane Doe');
      expect(originalDocument.metadata.author).toBe('John Doe'); // Ensure the original is unaffected
    });

    it('should describe the document correctly', async () => {
      const { Document } = await import('../prototype');

      const document = new Document(initialData);
      const description = document.describe();

      expect(description).toBe(
        `Title: ${initialData.title}, Content: ${
          initialData.content
        }, Metadata: ${JSON.stringify(initialData.metadata)}`
      );
    });
  });
});

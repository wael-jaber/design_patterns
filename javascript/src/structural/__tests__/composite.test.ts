import { describe, it, expect } from 'vitest';

describe('Composite pattern tests', () => {
  describe('SystemFile', () => {
    it('should return the correct name and size for a file', async () => {
      const { SystemFile } = await import('../composite');

      const file = new SystemFile('file1.txt', 10);

      expect(file.getName()).toBe('file1.txt');
      expect(file.getSize()).toBe(10);
    });
  });

  describe('Directory', () => {
    it('should return the correct name for a directory', async () => {
      const { Directory } = await import('../composite');

      const directory = new Directory('my_folder');

      expect(directory.getName()).toBe('my_folder');
    });

    it('should calculate the total size of files in the directory', async () => {
      const { Directory, SystemFile } = await import('../composite');

      const file1 = new SystemFile('file1.txt', 10);
      const file2 = new SystemFile('file2.txt', 20);

      const directory = new Directory('my_folder');
      directory.add(file1);
      directory.add(file2);

      expect(directory.getSize()).toBe(30);
    });

    it('should handle nested directories correctly', async () => {
      const { Directory, SystemFile } = await import('../composite');

      const file1 = new SystemFile('file1.txt', 10);
      const file2 = new SystemFile('file2.txt', 20);

      const folder = new Directory('folder');
      folder.add(file1);

      const root = new Directory('root');
      root.add(folder);
      root.add(file2);

      expect(root.getSize()).toBe(30);
    });

    it('should allow removing a component', async () => {
      const { Directory, SystemFile } = await import('../composite');

      const file1 = new SystemFile('file1.txt', 10);
      const file2 = new SystemFile('file2.txt', 20);

      const directory = new Directory('my_folder');
      directory.add(file1);
      directory.add(file2);

      directory.remove(file1);

      expect(directory.getSize()).toBe(20);
    });

    it('should return an empty size for a directory with no children', async () => {
      const { Directory } = await import('../composite');

      const emptyDirectory = new Directory('empty_folder');
      expect(emptyDirectory.getSize()).toBe(0);
    });

    it('should return all children in the directory', async () => {
      const { Directory, SystemFile } = await import('../composite');

      const file1 = new SystemFile('file1.txt', 10);
      const file2 = new SystemFile('file2.txt', 20);

      const directory = new Directory('my_folder');
      directory.add(file1);
      directory.add(file2);

      const children = directory.getChildren();
      expect(children.length).toBe(2);
      expect(children[0]).toBe(file1);
      expect(children[1]).toBe(file2);
    });
  });
});

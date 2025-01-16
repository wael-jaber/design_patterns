import { CompositeTypes } from './types';

// Represents an individual file (Leaf in the Composite pattern)
export class SystemFile implements CompositeTypes.FileSystemComponent {
  constructor(private name: string, private size: number) {}

  // Returns the name of the file
  getName(): string {
    return this.name;
  }

  // Returns the size of the file
  getSize(): number {
    return this.size;
  }
}

// Represents a directory that can contain files and other directories (Composite in the Composite pattern)
export class Directory implements CompositeTypes.FileSystemComponent {
  private children: CompositeTypes.FileSystemComponent[] = []; // Holds the files and directories within this directory

  constructor(private name: string) {}

  // Returns the name of the directory
  getName(): string {
    return this.name;
  }

  // Calculates and returns the total size of all children
  getSize(): number {
    return this.children.reduce((total, child) => total + child.getSize(), 0);
  }

  // Adds a file or directory to this directory
  add(component: CompositeTypes.FileSystemComponent): void {
    this.children.push(component);
  }

  // Removes a file or directory from this directory
  remove(component: CompositeTypes.FileSystemComponent): void {
    this.children = this.children.filter((child) => child !== component);
  }

  // Returns the list of all children in this directory
  getChildren(): CompositeTypes.FileSystemComponent[] {
    return this.children;
  }
}
// Example usage
// const file1 = new File("file1.txt", 10);
//  const file2 = new File("file2.txt", 20);
//
//  const folder = new Directory("my_folder");
//  folder.add(file1);
//  folder.add(file2);
//
//  const root = new Directory("root");
//  root.add(folder);
//
//  console.log(`Total size of root: ${root.getSize()} bytes`);
//  // Output: Total size of root: 30 bytes
//
//  /*
//  Common Mistakes to Avoid:
//  1. Not adhering to the same interface for both leaf and composite:
//     - Ensure all components (files and directories) implement the `FileSystemComponent` interface.
//
//  2. Improper recursion:
//     - When calculating sizes or traversing directories, avoid infinite loops or stack overflow by handling cycles properly.
//
//  3. Failing to account for empty directories:
//     - Handle cases where directories have no children gracefully.
//
//  4. Poor removal logic:
//     - Ensure that the `remove` method works as intended by checking object equality correctly.

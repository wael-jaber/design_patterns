import { Computer, ComputerBuilder } from './builder.types';

/**
 * Concrete implementation of a computer product.
 */
export class ComputerImpl implements Computer {
  public CPU?: string;
  public RAM?: string;
  public storage?: string;
  public GPU?: string;

  describe(): string {
    return `Computer specs: CPU=${this.CPU}, RAM=${this.RAM}, Storage=${this.storage}, GPU=${this.GPU}`;
  }
}

/**
 * Concrete Builder: Implements the steps defined in the Builder interface.
 */
export class GamingComputerBuilder implements ComputerBuilder {
  private computer: ComputerImpl;

  constructor() {
    this.computer = new ComputerImpl();
  }

  setCPU(cpu: string): this {
    this.computer.CPU = cpu;
    return this;
  }

  setRAM(ram: string): this {
    this.computer.RAM = ram;
    return this;
  }

  setStorage(storage: string): this {
    this.computer.storage = storage;
    return this;
  }

  setGPU(gpu: string): this {
    this.computer.GPU = gpu;
    return this;
  }

  build(): Computer {
    const result = this.computer;
    this.computer = new ComputerImpl(); // Reset for the next build
    return result;
  }
}

/**
 * Director: Orchestrates the building process using the builder interface.
 */
export class ComputerDirector {
  static buildBasicComputer(builder: ComputerBuilder): Computer {
    return builder
      .setCPU('Intel i5')
      .setRAM('8GB')
      .setStorage('512GB SSD')
      .build();
  }

  static buildGamingComputer(builder: ComputerBuilder): Computer {
    return builder
      .setCPU('AMD Ryzen 9')
      .setRAM('32GB')
      .setStorage('2TB SSD')
      .setGPU('NVIDIA RTX 4090')
      .build();
  }
}

//  Common Mistakes:
//  1. **Overcomplicating the Builder**:
//     - Avoid adding too many methods or unnecessary logic in the builder.
//     - Keep the builder focused on assembling the product.
//
//  2. **Not Resetting the Builder State**:
//     - Ensure the builder's internal state is reset after building a product. This prevents unintended reuse.
//
//  3. **Skipping the Director**:
//     - If your construction process has predefined steps, using a Director can simplify client code.
//
//  4. **Misusing Fluent Interfaces**:
//     - Ensure that builder methods return `this` for proper chaining. Forgetting this breaks fluent usage.

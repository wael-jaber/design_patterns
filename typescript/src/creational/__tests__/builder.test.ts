import { describe, it, expect } from 'vitest';

describe('Builder pattern tests', () => {
  describe('GamingComputerBuilder', () => {
    it('should have the setters and build methods', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      expect(builder).toHaveProperty('setCPU');
      expect(builder).toHaveProperty('setGPU');
      expect(builder).toHaveProperty('setRAM');
      expect(builder).toHaveProperty('setStorage');
      expect(builder).toHaveProperty('build');
    });
    it('should set the CPU correctly', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      builder.setCPU('Intel i7');
      const computer = builder.build();
      expect(computer.CPU).toBe('Intel i7');
    });

    it('should set the RAM correctly', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      builder.setRAM('16GB');
      const computer = builder.build();
      expect(computer.RAM).toBe('16GB');
    });

    it('should set the storage correctly', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      builder.setStorage('1TB SSD');
      const computer = builder.build();
      expect(computer.storage).toBe('1TB SSD');
    });

    it('should set the GPU correctly', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      builder.setGPU('NVIDIA RTX 3080');
      const computer = builder.build();
      expect(computer.GPU).toBe('NVIDIA RTX 3080');
    });

    it('should chain methods to configure the computer', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      const computer = builder
        .setCPU('Intel i9')
        .setRAM('32GB')
        .setStorage('2TB SSD')
        .setGPU('NVIDIA RTX 4090')
        .build();

      expect(computer.CPU).toBe('Intel i9');
      expect(computer.RAM).toBe('32GB');
      expect(computer.storage).toBe('2TB SSD');
      expect(computer.GPU).toBe('NVIDIA RTX 4090');
    });

    it('should reset the builder state after building a computer', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      builder.setCPU('Intel i5');
      const computer1 = builder.build();

      // Build another computer without setting properties
      const computer2 = builder.build();

      expect(computer1.CPU).toBe('Intel i5');
      expect(computer2.CPU).toBeUndefined();
    });
  });

  describe('ComputerDirector', () => {
    it('should build a basic computer using the director', async () => {
      const { GamingComputerBuilder, ComputerDirector } = await import(
        '../builder'
      );
      const builder = new GamingComputerBuilder();
      const computer = ComputerDirector.buildBasicComputer(builder);

      expect(computer.CPU).toBe('Intel i5');
      expect(computer.RAM).toBe('8GB');
      expect(computer.storage).toBe('512GB SSD');
      expect(computer.GPU).toBeUndefined();
    });

    it('should build a gaming computer using the director', async () => {
      const { GamingComputerBuilder, ComputerDirector } = await import(
        '../builder'
      );
      const builder = new GamingComputerBuilder();
      const computer = ComputerDirector.buildGamingComputer(builder);

      expect(computer.CPU).toBe('AMD Ryzen 9');
      expect(computer.RAM).toBe('32GB');
      expect(computer.storage).toBe('2TB SSD');
      expect(computer.GPU).toBe('NVIDIA RTX 4090');
    });
  });

  describe('Computer', () => {
    it('should describe the computer configuration', async () => {
      const { GamingComputerBuilder } = await import('../builder');
      const builder = new GamingComputerBuilder();
      const computer = builder
        .setCPU('Intel i7')
        .setRAM('16GB')
        .setStorage('1TB SSD')
        .setGPU('NVIDIA RTX 3080')
        .build();

      expect(computer.describe()).toBe(
        'Computer specs: CPU=Intel i7, RAM=16GB, Storage=1TB SSD, GPU=NVIDIA RTX 3080'
      );
    });
  });
});

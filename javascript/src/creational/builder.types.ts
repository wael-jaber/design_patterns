import { describe } from 'vitest';
export interface Computer {
  CPU?: string;
  RAM?: string;
  storage?: string;
  GPU?: string;
  describe: () => string;
}

export interface ComputerBuilder {
  setCPU(cpu: string): this;
  setRAM(ram: string): this;
  setStorage(storage: string): this;
  setGPU(gpu: string): this;
  build(): Computer;
}

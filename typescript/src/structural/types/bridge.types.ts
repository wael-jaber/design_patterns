export namespace BridgeTypes {
  export interface Device {
    turnOn(): string; // Turns the device on
    turnOff(): string; // Turns the device off
    setVolume(level: number): string; // Sets the volume
  }
}

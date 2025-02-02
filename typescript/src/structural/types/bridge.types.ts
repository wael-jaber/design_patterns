export namespace BridgeTypes {
  export interface Device {
    turnOn(): string; // Turns the device on
    turnOff(): string; // Turns the device off
    setVolume(level: number): string; // Sets the volume
  }

  export abstract class RemoteControl {
    constructor(protected device: BridgeTypes.Device) {}

    abstract togglePower(): string; // Toggles power on/off
    abstract volumeUp(): string; // Increases the volume
    abstract volumeDown(): string; // Decreases the volume
  }
}

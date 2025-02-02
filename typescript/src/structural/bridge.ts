import { BridgeTypes } from './types';

// Concrete Implementation: Represents a specific type of device (e.g., TV)
export class TV implements BridgeTypes.Device {
  turnOn(): string {
    return 'TV is turned ON.';
  }

  turnOff(): string {
    return 'TV is turned OFF.';
  }

  setVolume(level: number): string {
    return `TV volume set to ${level}.`;
  }
}

// Concrete Implementation: Represents another specific type of device (e.g., Radio)
export class Radio implements BridgeTypes.Device {
  turnOn(): string {
    return 'Radio is turned ON.';
  }

  turnOff(): string {
    return 'Radio is turned OFF.';
  }

  setVolume(level: number): string {
    return `Radio volume set to ${level}.`;
  }
}

// Refined Abstraction: Extends the high-level control
export class BasicRemoteControl extends BridgeTypes.RemoteControl {
  private isOn = false;
  private volume = 10;

  togglePower(): string {
    this.isOn = !this.isOn;
    return this.isOn ? this.device.turnOn() : this.device.turnOff();
  }

  volumeUp(): string {
    this.volume += 1;
    return this.device.setVolume(this.volume);
  }

  volumeDown(): string {
    this.volume = Math.max(0, this.volume - 1);
    return this.device.setVolume(this.volume);
  }
}

// Example Usage
// const tv = new TV();
// const radio = new Radio();
//
// const tvRemote = new BasicRemoteControl(tv);
// console.log(tvRemote.togglePower()); // Output: TV is turned ON.
// console.log(tvRemote.volumeUp()); // Output: TV volume set to 11.
//
// const radioRemote = new BasicRemoteControl(radio);
// console.log(radioRemote.togglePower()); // Output: Radio is turned ON.
// console.log(radioRemote.volumeDown()); // Output: Radio volume set to 9.
//
// Common Mistakes to Avoid:
// 1. Tightly Coupling Abstraction and Implementation:
//    - Avoid embedding the implementation logic directly into the abstraction. Always delegate to the `Device`.
//
// 2. Overcomplicating the Abstraction:
//    - Keep the abstraction focused on high-level control. Do not include device-specific logic.
//
// 3. Ignoring Scalability:
//    - Ensure both the abstraction and implementation can evolve independently (e.g., adding new devices or controls).
//

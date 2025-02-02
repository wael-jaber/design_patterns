import { CommandTypes } from './types';

// Concrete Command: Implements a command to turn on a device
export class TurnOnCommand implements CommandTypes.Command {
  constructor(private device: Device) {}

  execute(): string {
    return this.device.turnOn();
  }

  undo(): string {
    return this.device.turnOff();
  }
}

// Concrete Command: Implements a command to turn off a device
export class TurnOffCommand implements CommandTypes.Command {
  constructor(private device: Device) {}

  execute(): string {
    return this.device.turnOff();
  }

  undo(): string {
    return this.device.turnOn();
  }
}

// Receiver: Represents a device that the commands will operate on
export class Device {
  private isOn = false;

  turnOn(): string {
    this.isOn = true;
    return 'Device is now ON.';
  }

  turnOff(): string {
    this.isOn = false;
    return 'Device is now OFF.';
  }
}

// Invoker: Stores and executes commands
export class RemoteControl {
  private history: CommandTypes.Command[] = [];

  executeCommand(command: CommandTypes.Command): string {
    this.history.push(command);
    return command.execute();
  }

  undoLastCommand(): string {
    const lastCommand = this.history.pop();
    return lastCommand ? lastCommand.undo() : 'No command to undo.';
  }
}

//  Example Usage
//  const device = new Device();
//  const turnOn = new TurnOnCommand(device);
//  const turnOff = new TurnOffCommand(device);
//
//  const remote = new RemoteControl();
//  console.log(remote.executeCommand(turnOn)); // Output: Device is now ON.
//  console.log(remote.executeCommand(turnOff)); // Output: Device is now OFF.
//  console.log(remote.undoLastCommand()); // Output: Device is now ON.
//
//
//  Common Mistakes to Avoid:
//  1. **Forgetting the Undo Mechanism**:
//     - A command pattern should generally provide an undo function to reverse actions.
//
//  2. **Overcomplicating Simple Operations**:
//     - If commands do not require history or undo, consider using a simpler approach.
//
//  3. **Tightly Coupling Commands with Receivers**:
//     - Ensure commands operate independently without embedding receiver-specific logic.
//
//  Tips:
//  - Use TypeScript’s interfaces to enforce consistent command structures.
//  - Store command history only if undo functionality is needed.
//  - Keep commands stateless when possible to improve reusability.

import { describe, it, expect } from 'vitest';

describe('Command pattern tests', () => {
  describe('Device (Receiver)', () => {
    it('should turn on the device', async () => {
      const { Device } = await import('../command');
      const device = new Device();

      expect(device.turnOn()).toBe('Device is now ON.');
    });

    it('should turn off the device', async () => {
      const { Device } = await import('../command');
      const device = new Device();

      expect(device.turnOff()).toBe('Device is now OFF.');
    });
  });

  describe('TurnOnCommand (Concrete Command)', () => {
    it('should execute the turn on command', async () => {
      const { Device, TurnOnCommand } = await import('../command');
      const device = new Device();
      const command = new TurnOnCommand(device);

      expect(command.execute()).toBe('Device is now ON.');
    });

    it('should undo the turn on command', async () => {
      const { Device, TurnOnCommand } = await import('../command');
      const device = new Device();
      const command = new TurnOnCommand(device);

      command.execute();
      expect(command.undo()).toBe('Device is now OFF.');
    });
  });

  describe('TurnOffCommand (Concrete Command)', () => {
    it('should execute the turn off command', async () => {
      const { Device, TurnOffCommand } = await import('../command');
      const device = new Device();
      const command = new TurnOffCommand(device);

      device.turnOn(); // Ensure the device is on before turning it off
      expect(command.execute()).toBe('Device is now OFF.');
    });

    it('should undo the turn off command', async () => {
      const { Device, TurnOffCommand } = await import('../command');
      const device = new Device();
      const command = new TurnOffCommand(device);

      command.execute();
      expect(command.undo()).toBe('Device is now ON.');
    });
  });

  describe('RemoteControl (Invoker)', () => {
    it('should execute a command and store it in history', async () => {
      const { Device, TurnOnCommand, RemoteControl } = await import(
        '../command'
      );

      const device = new Device();
      const command = new TurnOnCommand(device);
      const remote = new RemoteControl();

      expect(remote.executeCommand(command)).toBe('Device is now ON.');
    });

    it('should undo the last executed command', async () => {
      const { Device, TurnOnCommand, RemoteControl } = await import(
        '../command'
      );

      const device = new Device();
      const command = new TurnOnCommand(device);
      const remote = new RemoteControl();

      remote.executeCommand(command);
      expect(remote.undoLastCommand()).toBe('Device is now OFF.');
    });

    it('should return a message if there is no command to undo', async () => {
      const { RemoteControl } = await import('../command');
      const remote = new RemoteControl();

      expect(remote.undoLastCommand()).toBe('No command to undo.');
    });
  });
});

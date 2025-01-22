import { describe, it, expect } from 'vitest';

describe('Bridge Pattern', () => {
  describe('TV (Concrete Implementation)', () => {
    it('should return the correct message when turning on', async () => {
      const { TV } = await import('../bridge');
      const tv = new TV();

      expect(tv.turnOn()).toBe('TV is turned ON.');
    });

    it('should return the correct message when turning off', async () => {
      const { TV } = await import('../bridge');
      const tv = new TV();

      expect(tv.turnOff()).toBe('TV is turned OFF.');
    });

    it('should set the correct volume', async () => {
      const { TV } = await import('../bridge');
      const tv = new TV();

      expect(tv.setVolume(15)).toBe('TV volume set to 15.');
    });
  });

  describe('Radio (Concrete Implementation)', () => {
    it('should return the correct message when turning on', async () => {
      const { Radio } = await import('../bridge');
      const radio = new Radio();

      expect(radio.turnOn()).toBe('Radio is turned ON.');
    });

    it('should return the correct message when turning off', async () => {
      const { Radio } = await import('../bridge');
      const radio = new Radio();

      expect(radio.turnOff()).toBe('Radio is turned OFF.');
    });

    it('should set the correct volume', async () => {
      const { Radio } = await import('../bridge');
      const radio = new Radio();

      expect(radio.setVolume(5)).toBe('Radio volume set to 5.');
    });
  });

  describe('BasicRemoteControl (Refined Abstraction)', () => {
    it('should toggle power on and off for TV', async () => {
      const { TV, BasicRemoteControl } = await import('../bridge');
      const tv = new TV();
      const remote = new BasicRemoteControl(tv);

      expect(remote.togglePower()).toBe('TV is turned ON.');
      expect(remote.togglePower()).toBe('TV is turned OFF.');
    });

    it('should toggle power on and off for Radio', async () => {
      const { Radio, BasicRemoteControl } = await import('../bridge');
      const radio = new Radio();
      const remote = new BasicRemoteControl(radio);

      expect(remote.togglePower()).toBe('Radio is turned ON.');
      expect(remote.togglePower()).toBe('Radio is turned OFF.');
    });

    it('should increase volume for TV', async () => {
      const { TV, BasicRemoteControl } = await import('../bridge');
      const tv = new TV();
      const remote = new BasicRemoteControl(tv);

      expect(remote.volumeUp()).toBe('TV volume set to 11.');
    });

    it('should decrease volume for TV', async () => {
      const { TV, BasicRemoteControl } = await import('../bridge');
      const tv = new TV();
      const remote = new BasicRemoteControl(tv);

      expect(remote.volumeDown()).toBe('TV volume set to 9.');
    });

    it('should increase volume for Radio', async () => {
      const { Radio, BasicRemoteControl } = await import('../bridge');
      const radio = new Radio();
      const remote = new BasicRemoteControl(radio);

      expect(remote.volumeUp()).toBe('Radio volume set to 11.');
    });

    it('should decrease volume for Radio', async () => {
      const { Radio, BasicRemoteControl } = await import('../bridge');
      const radio = new Radio();
      const remote = new BasicRemoteControl(radio);

      expect(remote.volumeDown()).toBe('Radio volume set to 9.');
    });
  });
});

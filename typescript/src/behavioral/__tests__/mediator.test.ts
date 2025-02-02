import { describe, it, expect, vi } from 'vitest';

describe('Mediator pattern tests', () => {
  describe('ConcreteMediator', () => {
    it('should register colleagues and facilitate communication', async () => {
      const { ConcreteMediator, ColleagueA, ColleagueB } = await import(
        '../mediator'
      );

      const mediator = new ConcreteMediator();
      const colleagueA = new ColleagueA();
      const colleagueB = new ColleagueB();

      mediator.register(colleagueA);
      mediator.register(colleagueB);

      const colleagueAReceiveSpy = vi.spyOn(colleagueA, 'receive');
      const colleagueBReceiveSpy = vi.spyOn(colleagueB, 'receive');

      colleagueA.send('Message from A');
      expect(colleagueBReceiveSpy).toHaveBeenCalledWith('Message from A');
      expect(colleagueAReceiveSpy).not.toHaveBeenCalled();

      colleagueB.send('Message from B');
      expect(colleagueAReceiveSpy).toHaveBeenCalledWith('Message from B');
      expect(colleagueBReceiveSpy).toHaveBeenCalledTimes(1);
    });
  });

  describe('ColleagueA', () => {
    it('should send and receive messages via mediator', async () => {
      const { ConcreteMediator, ColleagueA, ColleagueB } = await import(
        '../mediator'
      );

      const mediator = new ConcreteMediator();
      const colleagueA = new ColleagueA();
      const colleagueB = new ColleagueB();

      mediator.register(colleagueA);
      mediator.register(colleagueB);

      const consoleSpy = vi.spyOn(console, 'log');

      colleagueA.send('Test from A');
      expect(consoleSpy).toHaveBeenCalledWith('ColleagueA sends: Test from A');
      expect(consoleSpy).toHaveBeenCalledWith(
        'ColleagueB received: Test from A'
      );

      consoleSpy.mockRestore();
    });
  });

  describe('ColleagueB', () => {
    it('should send and receive messages via mediator', async () => {
      const { ConcreteMediator, ColleagueA, ColleagueB } = await import(
        '../mediator'
      );

      const mediator = new ConcreteMediator();
      const colleagueA = new ColleagueA();
      const colleagueB = new ColleagueB();

      mediator.register(colleagueA);
      mediator.register(colleagueB);

      const consoleSpy = vi.spyOn(console, 'log');

      colleagueB.send('Test from B');
      expect(consoleSpy).toHaveBeenCalledWith('ColleagueB sends: Test from B');
      expect(consoleSpy).toHaveBeenCalledWith(
        'ColleagueA received: Test from B'
      );

      consoleSpy.mockRestore();
    });
  });
});

import { describe, it, expect, vi } from 'vitest';
import { ConcreteSubject, ConcreteObserver } from '../observer';
import { ObserverTypes } from '../types';

describe('Observer pattern tests', () => {
  describe('ConcreteSubject', () => {
    it('should attach observers and notify them', () => {
      const subject = new ConcreteSubject();

      const observer1: ObserverTypes.Observer = { update: vi.fn() };
      const observer2: ObserverTypes.Observer = { update: vi.fn() };

      subject.attach(observer1);
      subject.attach(observer2);

      subject.notify('Test Message');

      expect(observer1.update).toHaveBeenCalledWith('Test Message');
      expect(observer2.update).toHaveBeenCalledWith('Test Message');
    });

    it('should detach observers and not notify them after removal', () => {
      const subject = new ConcreteSubject();

      const observer1: ObserverTypes.Observer = { update: vi.fn() };
      const observer2: ObserverTypes.Observer = { update: vi.fn() };

      subject.attach(observer1);
      subject.attach(observer2);

      subject.detach(observer1);

      subject.notify('Another Test Message');

      expect(observer1.update).not.toHaveBeenCalled();
      expect(observer2.update).toHaveBeenCalledWith('Another Test Message');
    });

    it('should handle multiple notifications correctly', () => {
      const subject = new ConcreteSubject();

      const observer: ObserverTypes.Observer = { update: vi.fn() };

      subject.attach(observer);

      subject.notify('First Message');
      subject.notify('Second Message');

      expect(observer.update).toHaveBeenCalledTimes(2);
      expect(observer.update).toHaveBeenCalledWith('First Message');
      expect(observer.update).toHaveBeenCalledWith('Second Message');
    });
  });

  describe('ConcreteObserver', () => {
    it('should log received messages', () => {
      const consoleSpy = vi.spyOn(console, 'log');

      const observer = new ConcreteObserver('TestObserver');

      observer.update('Test Message');

      expect(consoleSpy).toHaveBeenCalledWith(
        'TestObserver received message: Test Message'
      );

      consoleSpy.mockRestore();
    });
  });
});

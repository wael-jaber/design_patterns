import { test, expect, vi, describe } from 'vitest';
import { Singleton } from '../singleton';

describe('Singleton pattern tests', () => {
  test('should return an instance of the singleton', () => {
    const inst = Singleton.getInstance();
    expect(inst).toBeInstanceOf(Singleton);
  });

  test('should return the same instance', () => {
    const ref1 = Singleton.getInstance();
    const ref2 = Singleton.getInstance();
    expect(ref1).toBe(ref2);
  });

  /**
   * Test to verify the `greet` method is called on the Singleton instance.
   * This test ensures that:
   * 1. The `greet` method can be spied upon and is correctly called.
   * 2. A mocked implementation of `greet` can return a custom value.
   * 3. Singleton instances share the same behavior for mocked methods.
   */
  test('should call the greet method on the instance', () => {
    // Retrieve two references to the Singleton instance
    const ref1 = Singleton.getInstance();
    const ref2 = Singleton.getInstance();

    // Spy on the 'greet' method of the Singleton instance
    const spy = vi.spyOn(ref1, 'greet');

    // Call the `greet` method on the first instance
    ref1.greet();

    // Verify the spy was called
    expect(spy).toBeCalled();

    // Mock the implementation of `greet` to return a custom value
    spy.mockImplementationOnce(() => 'test');

    // Call the `greet` method again
    ref1.greet();

    // Verify that the second instance's `greet` method returns the mocked value
    expect(ref2.greet).toHaveReturnedWith('test');
  });
});

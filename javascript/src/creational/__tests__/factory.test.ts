import { expect, test } from 'vitest';
import { Car } from '../factory';

test('should be able to drive', () => {
  const ford = new Car();
  expect(ford).toHaveProperty('drive');
});

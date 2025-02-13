import { defineConfig } from 'vitest/config';

export default defineConfig({
  test: {
    coverage: {
      provider: 'istanbul',
      reporter: ['text', 'json', 'html', 'lcov'],
    },
    exclude: ['**/types/**', '**/node_modules/**'], // Exclude types directories and node_modules
  },
});

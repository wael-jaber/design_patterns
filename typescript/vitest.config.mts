import { defineConfig } from 'vitest/config';

export default defineConfig({
  test: {
    coverage: {
      provider: 'istanbul',
    },
    exclude: ['**/types/**', '**/node_modules/**'], // Exclude types directories and node_modules
  },
});

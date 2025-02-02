# TypeScript Design Patterns Project

This repository demonstrates the implementation of various design patterns in **TypeScript**, organized into three main categories: **Behavioral**, **Creational**, and **Structural**. Each pattern includes both its implementation and corresponding tests using **Vitest**.

## Project Structure

The project is organized as follows:

```
typescript/
├── node_modules/       # Dependencies
├── src/                # Source code
│   ├── behavioral/     # Behavioral design patterns
│   ├── creational/     # Creational design patterns
│   ├── structural/     # Structural design patterns
├── .gitignore          # Ignored files and directories for Git
├── package.json        # Project metadata and scripts
├── pnpm-lock.yaml      # Dependency lockfile for pnpm
├── tsconfig.json       # TypeScript configuration
├── vitest.config.mts   # Vitest configuration
├── makefile            # Automate tasks
├── README.md           # Root project README
```

---

## Design Pattern Categories

### Behavioral Patterns

Behavioral patterns focus on how objects interact and communicate with each other.

- [Observer](./src/behavioral/observer.ts)
- [State](./src/behavioral/state.ts)
- [Strategy](./src/behavioral/strategy.ts)
- [Mediator](./src/behavioral/mediator.ts)
- [Command](./src/behavioral/command.ts)
- [Chain of Responsibility](./src/behavioral/chain_of_responsibility.ts)

### Creational Patterns

Creational patterns deal with the process of object creation, making a system independent of how its objects are created.

- [Abstract Factory](./src/creational/abstract_factory.ts)
- [Builder](./src/creational/builder.ts)
- [Factory](./src/creational/factory.ts)
- [Prototype](./src/creational/prototype.ts)
- [Singleton](./src/creational/singleton.ts)

### Structural Patterns

Structural patterns focus on composing objects and classes into larger structures while keeping them flexible and efficient.

- [Adapter](./src/structural/adapter.ts)
- [Bridge](./src/structural/bridge.ts)
- [Composite](./src/structural/composite.ts)
- [Decorator](./src/structural/decorator.ts)
- [Facade](./src/structural/facade.ts)
- [Proxy](./src/structural/proxy.ts)

---

## Testing

This project uses **Vitest** for testing. Each pattern has a dedicated test file located in the `__tests__` folder under its respective category.

### Running Tests

To run the tests, use the following commands:

1. Install dependencies:

   ```bash
   pnpm install
   ```

2. Run all tests:

   ```bash
   pnpm test
   ```

---

## Getting Started

1. Clone this repository:

   ```bash
   git clone <repository-url>
   cd typescript
   ```

2. Install dependencies:

   ```bash
   pnpm install
   ```

3. Run tests to verify the setup:

   ```bash
   pnpm test
   ```

---

## Configuration

### TypeScript

- `tsconfig.json`: Configures TypeScript options for the project.

### Vitest

- `vitest.config.mts`: Configures the test runner for the project.

### Makefile

- Automates common tasks such as running tests or linting.

---

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the MIT License.

---

Let me know if you'd like additional changes or enhancements! 🚀

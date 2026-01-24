# TypeScript Design Patterns

This directory contains **idiomatic TypeScript implementations** of classic software design patterns.
The focus is on **strong typing**, **clear contracts**, and **testability**, while staying close to
TypeScript and JavaScript ecosystem conventions.

Each pattern is implemented independently and validated with unit tests using **Vitest**.

---

## Project Structure

```
typescript/
├── src/
│   ├── behavioral/                 # Behavioral design patterns
│   ├── creational/                 # Creational design patterns
│   └── structural/                 # Structural design patterns
├── package.json                    # Project metadata and scripts
├── pnpm-lock.yaml                  # Dependency lockfile
├── tsconfig.json                   # TypeScript configuration
├── vitest.config.mts               # Vitest configuration
├── Makefile                        # Test and tooling automation
└── README.md                       # This file
```

Each pattern directory contains:

- One or more implementation files
- Corresponding test files
- No framework-specific dependencies beyond what is required

---

## Design Pattern Categories

### [Behavioral Patterns](./src/behavioral/README.md)

Behavioral patterns focus on **interaction and responsibility** between components.

- [Observer](./src/behavioral/observer.ts)
- [State](./src/behavioral/state.ts)
- [Strategy](./src/behavioral/strategy.ts)
- [Mediator](./src/behavioral/mediator.ts)
- [Command](./src/behavioral/command.ts)
- [Chain of Responsibility](./src/behavioral/chain_of_responsibility.ts)

---

### [Creational Patterns](./src/creational/README.md)

Creational patterns address **object creation** while keeping clients decoupled from concrete implementations.

- [Singleton](./src/creational/singleton.ts)
- [Factory](./src/creational/factory.ts)
- [Abstract Factory](./src/creational/abstract_factory.ts)
- [Builder](./src/creational/builder.ts)
- [Prototype](./src/creational/prototype.ts)

---

### [Structural Patterns](./src/structural/README.md)

Structural patterns focus on **composing objects and abstractions** into larger structures.

- [Adapter](./src/structural/adapter.ts)
- [Bridge](./src/structural/bridge.ts)
- [Composite](./src/structural/composite.ts)
- [Decorator](./src/structural/decorator.ts)
- [Facade](./src/structural/facade.ts)
- [Proxy](./src/structural/proxy.ts)

---

## Testing

All implementations are validated using **Vitest**.

Run tests:

```bash
pnpm test
```

---

## Coverage

Generate a coverage report:

```bash
pnpm test --coverage
```

Coverage output will be generated according to `vitest.config.mts`.

---

## Makefile Usage

A `Makefile` is provided to standardize common tasks:

```bash
make install   # Install dependencies
make test      # Run tests
make clean     # Remove build artifacts
```

---

## Tooling

- **TypeScript** for static typing and compile-time safety
- **pnpm** for fast, deterministic dependency management
- **Vitest** for fast unit testing with modern tooling

---

## Design Principles

- Strong typing and explicit contracts
- Prefer composition over inheritance
- Avoid unnecessary abstractions
- Tests as first-class citizens
- Idiomatic TypeScript over framework patterns

---

This directory is intended as a **reference and learning resource** for applying classic
design patterns in TypeScript with modern tooling and clean structure.

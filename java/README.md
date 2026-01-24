# Java Design Patterns

This directory contains **idiomatic Java implementations** of classic software design patterns.
The focus is on **clear object-oriented design**, **testability**, and **explicit structure**
using standard Java tooling.

Each pattern is implemented independently and validated with unit tests using **JUnit**.

---

## Project Structure

```
java/
├── src/
│   ├── main/
│   │   ├── behavioral/              # Behavioral design patterns
│   │   ├── creational/              # Creational design patterns
│   │   └── structural/              # Structural design patterns
│   ├── test/
│   │   ├── behavioral/              # Tests for behavioral patterns
│   │   ├── creational/              # Tests for creational patterns
│   │   └── structural/              # Tests for structural patterns
├── pom.xml                          # Maven configuration
├── Makefile                         # Test and coverage automation
└── README.md                        # This file
```

Each pattern package contains:

- One or more implementation classes
- Corresponding JUnit test classes
- No framework-specific dependencies beyond what is necessary

---

## Design Pattern Categories

### [Behavioral Patterns](./src/main/behavioral/README.md)

Behavioral patterns focus on **interaction and responsibility** between objects.

- [Observer](./src/main/behavioral/observer)
- [State](./src/main/behavioral/state)
- [Strategy](./src/main/behavioral/strategy)
- [Mediator](./src/main/behavioral/mediator)
- [Command](./src/main/behavioral/command)
- [Chain of Responsibility](./src/main/behavioral/chainofresponsibility)

---

### [Creational Patterns](./src/main/creational/README.md)

Creational patterns address **object creation concerns** while keeping clients decoupled from concrete implementations.

- [Singleton](./src/main/creational/singleton)
- [Factory](./src/main/creational/factory)
- [Abstract Factory](./src/main/creational/abstractfactory)
- [Builder](./src/main/creational/builder)
- [Prototype](./src/main/creational/prototype)

---

### [Structural Patterns](./src/main/structural/README.md)

Structural patterns focus on **composing objects and classes** into larger structures.

- [Adapter](./src/main/structural/adapter)
- [Bridge](./src/main/structural/bridge)
- [Composite](./src/main/structural/composite)
- [Decorator](./src/main/structural/decorator)
- [Facade](./src/main/structural/facade)
- [Proxy](./src/main/structural/proxy)

---

## Testing

All implementations are validated using **JUnit**.

Testing principles:

- Tests mirror the production package structure
- Focus on observable behavior
- Fast and deterministic execution

### Run Tests (Maven)

```bash
mvn test
```

---

## Coverage

Generate a coverage report using JaCoCo:

```bash
mvn test jacoco:report
```

The HTML report will be available under:

```
target/site/jacoco/index.html
```

---

## Makefile Usage

A `Makefile` is provided to standardize common tasks:

```bash
make install    # Resolve dependencies
make build      # Compile sources
make test       # Run tests
make coverage   # Generate coverage report
make clean      # Clean build artifacts
```

---

## Design Principles

- Clear separation of concerns
- Favor composition over inheritance where appropriate
- Explicit object lifecycles
- Avoid overengineering and unnecessary abstractions
- Tests as first-class citizens

---

This directory is intended as a **reference and learning resource** for applying classic
design patterns in Java using modern tooling and clean structure.

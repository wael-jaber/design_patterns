# Go Design Patterns

This directory contains **idiomatic Go implementations** of classic software design patterns.
The focus is on **composition over inheritance**, **clear interfaces**, **testability**, and
alignment with Go’s standard library and conventions.

Each pattern is implemented in isolation and accompanied by unit tests using Go’s built-in
`testing` package.

---

## Project Structure

```
go/
├── src/
│   ├── behavioral/                 # Behavioral design patterns
│   │   ├── observer/
│   │   ├── state/
│   │   ├── strategy/
│   │   ├── mediator/
│   │   ├── command/
│   │   └── chainofresponsibility/
│   ├── creational/                 # Creational design patterns
│   │   ├── singleton/
│   │   ├── factory/
│   │   ├── abstractfactory/
│   │   ├── builder/
│   │   └── prototype/
│   ├── structural/                 # Structural design patterns
│   │   ├── adapter/
│   │   ├── bridge/
│   │   ├── composite/
│   │   ├── decorator/
│   │   ├── facade/
│   │   └── proxy/
├── go.mod                          # Go module definition
├── go.sum                          # Dependency checksums
├── Makefile                        # Test and coverage automation
└── README.md                       # This file
```

Each pattern directory contains:

- One or more implementation files
- Corresponding `_test.go` files
- No external dependencies unless strictly necessary

---

## Design Pattern Categories

### [Behavioral Patterns](./src/behavioral/README.md)

Behavioral patterns focus on **communication and responsibility** between components.

- [Observer](./src/behavioral/observer)
- [State](./src/behavioral/state)
- [Strategy](./src/behavioral/strategy)
- [Mediator](./src/behavioral/mediator)
- [Command](./src/behavioral/command)
- [Chain of Responsibility](./src/behavioral/chainofresponsibility)

---

### [Creational Patterns](./src/creational/README.md)

Creational patterns address **object creation** while keeping code flexible and explicit.

- [Singleton](./src/creational/singleton)
- [Factory](./src/creational/factory)
- [Abstract Factory](./src/creational/abstractfactory)
- [Builder](./src/creational/builder)
- [Prototype](./src/creational/prototype)

---

### [Structural Patterns](./src/structural/README.md)

Structural patterns focus on **object composition** and structuring relationships.

- [Adapter](./src/structural/adapter)
- [Bridge](./src/structural/bridge)
- [Composite](./src/structural/composite)
- [Decorator](./src/structural/decorator)
- [Facade](./src/structural/facade)
- [Proxy](./src/structural/proxy)

---

## Testing

All implementations use Go’s standard `testing` package.

Testing principles:

- Tests are colocated with implementations
- Black-box testing is preferred (`package xxx_test`)
- No external test frameworks
- Deterministic and fast test execution

### Run Tests

```bash
go test ./...
```

### Test Coverage

Generate coverage data:

```bash
go test ./... -coverprofile=coverage.out
```

View coverage summary:

```bash
go tool cover -func=coverage.out
```

Generate an HTML coverage report:

```bash
go tool cover -html=coverage.out
```

---

## Makefile Usage

A `Makefile` is provided to standardize common tasks:

```bash
make install   # Tidy module dependencies
make test      # Run tests with coverage
make coverage  # Generate coverage reports
make clean     # Remove coverage artifacts
```

---

## Design Principles

- Idiomatic Go (interfaces, composition, explicit dependencies)
- No inheritance or class hierarchies
- Interfaces used only where they add clarity
- Prefer small packages and focused responsibilities
- Thread-safety where relevant (e.g. Observer, Mediator)
- Minimal abstractions, maximal readability

---

This directory is intended as a **reference and learning resource** for applying design patterns
in Go while respecting the language’s philosophy.

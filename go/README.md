# Go Design Patterns Project

This repository demonstrates the implementation of various design patterns in **Go**, organized into three main categories: **Behavioral**, **Creational**, and **Structural**. Each pattern includes its implementation and corresponding unit tests using Go’s built-in **testing** framework.

The goal of this project is to provide **idiomatic Go implementations** of classic design patterns, emphasizing interfaces, composition, simplicity, and testability.

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
│   │   ├── chainofresponsibility/
│   ├── creational/                 # Creational design patterns
│   │   ├── singleton/
│   │   ├── factory/
│   │   ├── abstractfactory/
│   │   ├── builder/
│   │   ├── prototype/
│   ├── structural/                 # Structural design patterns
│   │   ├── adapter/
│   │   ├── bridge/
│   │   ├── composite/
│   │   ├── decorator/
│   │   ├── facade/
│   │   ├── proxy/
├── go.mod                      # Go module definition
├── go.sum                      # Dependency checksums
├── Makefile                    # Test and coverage automation
├── .gitignore                  # Ignored files and directories for Git
├── README.md                   # Root project README
```

---

## Design Pattern Categories

### [Behavioral Patterns](./src/behavioral/README.md)

Behavioral patterns focus on how objects interact and communicate with each other.

- [Observer](./src/behavioral/observer)
- [State](./src/behavioral/state)
- [Strategy](./src/behavioral/strategy)
- [Mediator](./src/behavioral/mediator)
- [Command](./src/behavioral/command)
- [Chain of Responsibility](./src/behavioral/chainofresponsibility)

---

### [Creational Patterns](./src/creational/README.md)

Creational patterns deal with object creation mechanisms, providing flexibility and reuse.

- [Abstract Factory](./src/creational/abstractfactory)
- [Builder](./src/creational/builder)
- [Factory](./src/creational/factory)
- [Prototype](./src/creational/prototype)
- [Singleton](./src/creational/singleton)

---

### [Structural Patterns](./src/structural/README.md)

Structural patterns focus on composing objects into larger structures while keeping them flexible and efficient.

- [Adapter](./src/structural/adapter)
- [Bridge](./src/structural/bridge)
- [Composite](./src/structural/composite)
- [Decorator](./src/structural/decorator)
- [Facade](./src/structural/facade)
- [Proxy](./src/structural/proxy)

---

## Testing

This project uses Go’s built-in **testing** package.

- Tests are colocated with implementation files
- Each implementation file has a corresponding `_test.go` file
- Black-box testing (`package xxx_test`) is used
- Full coverage is supported via `go test`

### Running Tests

```bash
go test ./...
```

### Running Tests with Coverage

```bash
go test ./... -coverprofile=coverage.out
go tool cover -func=coverage.out
```

To generate an HTML coverage report:

```bash
go tool cover -html=coverage.out
```

---

## Configuration

### Go Modules

- `go.mod`: Defines the module path and Go version
- `go.sum`: Tracks dependency checksums

### Makefile

A `Makefile` is provided to simplify running tests and generating coverage reports.

---

## Design Principles Followed

- Idiomatic Go (interfaces, composition, minimal abstractions)
- No inheritance or forced OOP hierarchies
- Interfaces exist primarily for client typing
- Thread-safety where relevant (Observer, Mediator)
- Clear separation of concerns
- One responsibility per file

---

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the **MIT License**.

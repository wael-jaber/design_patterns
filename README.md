# Design Patterns Examples Repository

![Build](https://github.com/wael-jaber/design_patterns/actions/workflows/ci.yml/badge.svg?branch=main)

Welcome to the **Design Patterns Examples** repository! This repository serves as a personal project to document and showcase my understanding of design patterns through practical implementations in multiple programming languages. Each implementation is organized by language and categorized by the type of design pattern, offering a clear and structured reference.

## 📊 Code Coverage

| Language   | Coverage Badge                                                                                                                                                           |
| ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Java       | [![Java Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=java)](https://codecov.io/gh/wael-jaber/design_patterns)             |
| TypeScript | [![TypeScript Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=typescript)](https://codecov.io/gh/wael-jaber/design_patterns) |
| Python     | [![Python Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=python)](https://codecov.io/gh/wael-jaber/design_patterns)         |

## Repository Structure

```
design-patterns/
├── typescript/        # Design patterns implemented in TypeScript
├── java/              # Design patterns implemented in Java
├── python/            # Design patterns implemented in Python
├── rust/              # Design patterns implemented in Rust
├── go/                # Design patterns implemented in Go
└── README.md          # Root README file
```

Each language folder contains examples categorized into the following types:

1. **Creational Patterns**: Focused on object creation mechanisms.
2. **Structural Patterns**: Deal with object composition and relationships.
3. **Behavioral Patterns**: Concerned with object interaction and responsibilities.

## Roadmap

The project will be implemented step by step, with additional features like containerization and testing examples added along the way.

### Language Implementations

- [x] [**TypeScript**](./typescript/README.md)
  - Implement creational, structural, and behavioral patterns.
  - Include comments and clear explanations.
- [x] [**Java**](./java/README.md)
  - Translate TypeScript implementations into Java.
  - Highlight Java's object-oriented features.
- [ ] [**Python**](./python/README.md)
  - Implement patterns in Python.
  - Leverage the dynamic nature of the language.
- [ ] **Rust**
  - Implement patterns in Rust.
  - Focus on ownership, borrowing, and concurrency.
- [ ] **Go**
  - Implement patterns in Go.
  - Highlight simplicity and concurrency features.

### Additional Features

- [ ] **Testing Examples**
  - Provide test cases for each design pattern in all languages.
  - Use language-appropriate testing frameworks.
- [ ] **Dockerization**
  - Dockerize the project to provide a unified environment for running the examples.
  - Include a `Dockerfile` and `docker-compose.yml` to facilitate usage.

## Supported Design Patterns

### Creational Patterns

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

### Structural Patterns

- Adapter
- Composite
- Proxy
- Decorator
- Facade
- Bridge

### Behavioral Patterns

- Observer
- Strategy
- Command
- State
- Mediator
- Chain of Responsibility

## How to Use

### Prerequisites

Ensure you have the necessary tools installed for the language you wish to explore:

- **TypeScript**: [Node.js](https://nodejs.org/)
- **Java**: JDK 8+ and a Java build tool like Maven or Gradle
- **Python**: Python 3.8+
- **Rust**: Rustup or Cargo
- **Go**: Go 1.18+
- **Docker**: Docker Desktop or equivalent for your system

## Purpose

This repository is intended to:

- **Document Knowledge**: Provide a structured and practical way to record and showcase my understanding of design patterns.
- **Offer a Reference**: Serve as a resource for revisiting and reinforcing the principles of software architecture.
- **Highlight Cross-Language Implementation**: Demonstrate the application of design patterns in multiple programming languages.
- **Ensure Portability**: Dockerize the project to enable seamless execution across environments.
- **Improve Reliability**: Include testing examples to validate implementations.

---

Thank you for exploring this repository! Feel free to use it as a learning resource or reference for implementing design patterns. 🎉

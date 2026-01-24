# Design Patterns Examples Repository

![Build](https://github.com/wael-jaber/design_patterns/actions/workflows/ci.yml/badge.svg?branch=main)

Welcome to the **Design Patterns Examples** repository.

This project documents and demonstrates classic **software design patterns** through **practical, idiomatic implementations** in multiple programming languages.  
Each language implementation is self-contained and follows the conventions and tooling of its ecosystem.

The goal is clarity, correctness, and comparability — not framework abstraction or tooling experiments.

---

## 📊 Code Coverage

| Language   | Coverage |
| ---------- | -------- |
| Java       | [![Java Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=java)](https://codecov.io/gh/wael-jaber/design_patterns) |
| TypeScript | [![TypeScript Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=typescript)](https://codecov.io/gh/wael-jaber/design_patterns) |
| Python     | [![Python Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=python)](https://codecov.io/gh/wael-jaber/design_patterns) |
| Go         | [![Go Coverage](https://codecov.io/gh/wael-jaber/design_patterns/branch/main/graph/badge.svg?flag=go)](https://codecov.io/gh/wael-jaber/design_patterns) |

---

## Language Implementations

Each language has its **own README** with setup instructions, structure, and examples:

- **TypeScript** → [`typescript/README.md`](./typescript/README.md)
- **Java** → [`java/README.md`](./java/README.md)
- **Python** → [`python/README.md`](./python/README.md)
- **Go** → [`go/README.md`](./go/README.md)

---

## Repository Structure

```
design-patterns/
├── typescript/        # TypeScript implementations
├── java/              # Java implementations
├── python/            # Python implementations
├── go/                # Go implementations
├── Makefile           # Root orchestration Makefile
└── README.md
```

The root Makefile only orchestrates common tasks.  
All language-specific logic lives inside each directory.

---

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

---

## How to Use

### Prerequisites

Install the tooling for the language you want to explore:

- **TypeScript**: Node.js + pnpm
- **Java**: JDK 17+ and Maven
- **Python**: Python 3.9+
- **Go**: Go 1.22+

Each language directory can be used independently by following its README.

---

### Common Commands (Root)

```bash
make install   # Install dependencies for all languages
make test      # Run all tests
make clean     # Clean build artifacts
```

---

## Roadmap

- [ ] **Rust**
  - Implement design patterns in Rust
  - Focus on ownership, borrowing, and concurrency trade-offs

---

## Purpose

This repository exists to:

- Document design pattern knowledge in a concrete, runnable form
- Compare implementations across languages
- Serve as a long-term reference
- Favor correctness and clarity over abstraction

---

Feel free to explore, fork, or use this repository as a learning reference.

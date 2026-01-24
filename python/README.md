# Python Design Patterns

This directory contains **idiomatic Python implementations** of classic software design patterns.
The focus is on **readability**, **explicit behavior**, and **testability**, using Python’s dynamic
features responsibly.

Each pattern is implemented independently and validated with unit tests using **pytest**.

---

## Project Structure

```
python/
├── src/
│   ├── behavioral/                 # Behavioral design patterns
│   ├── creational/                 # Creational design patterns
│   └── structural/                 # Structural design patterns
├── tests/
│   ├── behavioral/                 # Tests for behavioral patterns
│   ├── creational/                 # Tests for creational patterns
│   └── structural/                 # Tests for structural patterns
├── pyproject.toml                  # Tooling configuration (pytest, black, mypy, etc.)
├── requirements.txt                # Python dependencies
├── Makefile                        # Test and tooling automation
└── README.md                       # This file
```

Each pattern directory contains:

- One or more implementation modules
- Corresponding test modules
- Minimal, explicit dependencies

---

## Design Pattern Categories

### [Behavioral Patterns](./src/behavioral/README.md)

Behavioral patterns focus on **object interaction and responsibility**.

- [Observer](./src/behavioral/observer/)
- [Strategy](./src/behavioral/strategy/)
- [Command](./src/behavioral/command/)
- [State](./src/behavioral/state/)
- [Mediator](./src/behavioral/mediator/)
- [Chain of Responsibility](./src/behavioral/chain_of_responsibility/)

---

### [Creational Patterns](./src/creational/README.md)

Creational patterns address **object creation** while keeping usage flexible and explicit.

- [Singleton](./src/creational/singleton/)
- [Factory](./src/creational/factory/)
- [Abstract Factory](./src/creational/abstract_factory/)
- [Builder](./src/creational/builder/)
- [Prototype](./src/creational/prototype/)

---

### [Structural Patterns](./src/structural/README.md)

Structural patterns focus on **composing objects** into larger structures.

- [Adapter](./src/structural/adapter/)
- [Bridge](./src/structural/bridge/)
- [Composite](./src/structural/composite/)
- [Decorator](./src/structural/decorator/)
- [Facade](./src/structural/facade/)
- [Proxy](./src/structural/proxy/)

---

## Environment Setup

Python requires an explicit virtual environment.

Create and activate a virtual environment:

```bash
python -m venv venv
source venv/bin/activate      # Linux / macOS
venv\Scripts\activate       # Windows
```

Install dependencies:

```bash
make install
```

> All Makefile commands assume an active virtual environment.

---

## Testing

All implementations are validated using **pytest**.

Run tests:

```bash
make test
```

Verbose output:

```bash
pytest -vv
```

---

## Coverage

Generate a coverage report:

```bash
pytest --cov=src --cov-report=xml
```

The coverage report will be generated as `coverage.xml`.

---

## Makefile Usage

A `Makefile` is provided to standardize common tasks:

```bash
make install   # Install dependencies
make format    # Format code (black)
make lint      # Static type checking (mypy)
make test      # Run tests with coverage
make clean     # Remove caches and artifacts
```

---

## Design Principles

- Pythonic and readable code
- Explicit is better than implicit
- Favor composition and clear data flow
- Minimal abstractions
- Tests as first-class citizens

---

This directory is intended as a **reference and learning resource** for applying classic
design patterns in Python while respecting Python’s design philosophy.

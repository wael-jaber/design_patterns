# Python Design Patterns Project

This repository demonstrates the implementation of various design patterns in **Python**, organized into three main categories: **Behavioral**, **Creational**, and **Structural**.
Each pattern includes its implementation and corresponding unit tests using **pytest**.

## Project Structure

The project is organized as follows:

```
python/
├── src/                        # Source code
│   ├── behavioral/             # Behavioral design patterns
│   ├── creational/             # Creational design patterns
│   ├── structural/             # Structural design patterns
│
├── tests/                      # Unit tests
│   ├── behavioral/             # Tests for behavioral patterns
│   ├── creational/             # Tests for creational patterns
│   ├── structural/             # Tests for structural patterns
│
├── .gitignore                  # Python-specific ignore rules
├── pyproject.toml              # Optional project configuration (pytest, tooling)
├── requirements.txt            # Python dependencies (if used)
├── README.md                   # Root project README
```

---

## Design Pattern Categories

### [Behavioral Patterns](./src/behavioral/README.md)

Behavioral patterns focus on how objects interact and communicate with each other.

- [Observer](./src/behavioral/observer/)
- [Strategy](./src/behavioral/strategy/)
- [Command](./src/behavioral/command/)
- [State](./src/behavioral/state/)
- [Mediator](./src/behavioral/mediator/)
- [Chain of Responsibility](./src/behavioral/chain_of_responsibility/)

### [Creational Patterns](./src/creational/README.md)

Creational patterns deal with the process of object creation, making a system independent of how its objects are created.

- [Abstract Factory](./src/creational/abstract_factory/)
- [Builder](./src/creational/builder/)
- [Factory](./src/creational/factory/)
- [Prototype](./src/creational/prototype/)
- [Singleton](./src/creational/singleton/)

### [Structural Patterns](./src/structural/README.md)

Structural patterns focus on composing objects and classes into larger structures while keeping them flexible and efficient.

- [Adapter](./src/structural/adapter/)
- [Bridge](./src/structural/bridge/)
- [Composite](./src/structural/composite/)
- [Decorator](./src/structural/decorator/)
- [Facade](./src/structural/facade/)
- [Proxy](./src/structural/proxy/)

---

## Testing

This project uses **pytest** for testing.
Each pattern has a dedicated test file located in the `tests` folder under its respective category.

### Running Tests

```bash
pytest
```

Or, for more detailed output:

```bash
pytest -vv
```

---

## Configuration

### Python Environment

- `requirements.txt`: Contains Python dependencies (if required)
- `pyproject.toml`: Optional configuration for tools such as pytest, black, isort, etc.

Create a virtual environment and install dependencies:

```bash
python -m venv venv
source venv/bin/activate   # Linux / macOS
venv\Scriptsctivate      # Windows

pip install -r requirements.txt
```

---

## Contributing

Contributions are welcome!
Feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the MIT License.

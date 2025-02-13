# Java Design Patterns Project

This repository demonstrates the implementation of various design patterns in **Java**, organized into three main categories: **Behavioral**, **Creational**, and **Structural**. Each pattern includes its implementation and corresponding unit tests using **JUnit**.

## Project Structure

The project is organized as follows:

```
java/
├── src/                    # Source code
│   ├── main/               # Main application code
│   │   ├── behavioral/     # Behavioral design patterns
│   │   ├── creational/     # Creational design patterns
│   │   ├── structural/     # Structural design patterns
│   ├── test/               # Unit tests
│       ├── behavioral/     # Tests for behavioral patterns
│       ├── creational/     # Tests for creational patterns
│       ├── structural/     # Tests for structural patterns
├── .gitignore              # Ignored files and directories for Git
├── pom.xml                 # Maven configuration (for dependencies and build)
├── build.gradle            # Gradle configuration (if using Gradle)
├── README.md               # Root project README
```

---

## Design Pattern Categories

### Behavioral Patterns

Behavioral patterns focus on how objects interact and communicate with each other.

- [Observer](./src/main/behavioral/Observer.java)
- [State](./src/main/behavioral/State.java)
- [Strategy](./src/main/behavioral/Strategy.java)
- [Mediator](./src/main/behavioral/Mediator.java)
- [Command](./src/main/behavioral/Command.java)
- [Chain of Responsibility](./src/main/behavioral/ChainOfResponsibility.java)

### Creational Patterns

Creational patterns deal with the process of object creation, making a system independent of how its objects are created.

- [Abstract Factory](./src/main/creational/AbstractFactory.java)
- [Builder](./src/main/creational/Builder.java)
- [Factory](./src/main/creational/Factory.java)
- [Prototype](./src/main/creational/Prototype.java)
- [Singleton](./src/main/creational/Singleton.java)

### Structural Patterns

Structural patterns focus on composing objects and classes into larger structures while keeping them flexible and efficient.

- [Adapter](./src/main/structural/Adapter.java)
- [Bridge](./src/main/structural/Bridge.java)
- [Composite](./src/main/structural/Composite.java)
- [Decorator](./src/main/structural/Decorator.java)
- [Facade](./src/main/structural/Facade.java)
- [Proxy](./src/main/structural/Proxy.java)

---

## Testing

This project uses **JUnit** for testing. Each pattern has a dedicated test file located in the `test` folder under its respective category.

### Running Tests

#### Using Maven

To run the tests using **Maven**, execute the following command:

```bash
mvn test
```

---

## Configuration

### Maven

- `pom.xml`: Configures dependencies and the build system.

---

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the MIT License.

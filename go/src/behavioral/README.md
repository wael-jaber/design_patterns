### **Behavioral Design Patterns in Go**

Behavioral design patterns focus on communication between objects and the delegation of responsibility. These patterns help define how objects interact while ensuring flexibility, scalability, and loose coupling.

This directory contains idiomatic **Go** implementations of the following behavioral design patterns, each with colocated unit tests using Go’s built-in `testing` package.

- [Observer](#observer)
- [Strategy](#strategy)
- [State](#state)
- [Mediator](#mediator)
- [Command](#command)
- [Chain of Responsibility](#chain-of-responsibility)

---

## **Observer**

The **Observer** pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

### Implementation Files

- [observer.go](./observer/observer.go)
- [subject.go](./observer/subject.go)
- [concrete_subject.go](./observer/concrete_subject.go)
- [concrete_observer_a.go](./observer/concrete_observer_a.go)
- [concrete_observer_b.go](./observer/concrete_observer_b.go)

### Test Files

- [observer_test.go](./observer/observer_test.go)
- [subject_test.go](./observer/subject_test.go)
- [concrete_subject_test.go](./observer/concrete_subject_test.go)
- [concrete_observer_a_test.go](./observer/concrete_observer_a_test.go)
- [concrete_observer_b_test.go](./observer/concrete_observer_b_test.go)

---

## **Strategy**

The **Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The algorithm can vary independently from clients that use it.

### Implementation Files

- [strategy.go](./strategy/strategy.go)
- [context.go](./strategy/context.go)
- [credit_card_strategy.go](./strategy/credit_card_strategy.go)
- [paypal_strategy.go](./strategy/paypal_strategy.go)
- [crypto_strategy.go](./strategy/crypto_strategy.go)

### Test Files

- [strategy_test.go](./strategy/strategy_test.go)
- [context_test.go](./strategy/context_test.go)
- [credit_card_strategy_test.go](./strategy/credit_card_strategy_test.go)
- [paypal_strategy_test.go](./strategy/paypal_strategy_test.go)
- [crypto_strategy_test.go](./strategy/crypto_strategy_test.go)

---

## **State**

The **State** pattern allows an object to alter its behavior when its internal state changes. The object appears to change its behavior dynamically at runtime.

### Implementation Files

- [state.go](./state/state.go)
- [traffic_light.go](./state/traffic_light.go)
- [red_state.go](./state/red_state.go)
- [green_state.go](./state/green_state.go)
- [yellow_state.go](./state/yellow_state.go)

### Test Files

- [state_test.go](./state/state_test.go)
- [traffic_light_test.go](./state/traffic_light_test.go)
- [red_state_test.go](./state/red_state_test.go)
- [green_state_test.go](./state/green_state_test.go)
- [yellow_state_test.go](./state/yellow_state_test.go)

---

## **Mediator**

The **Mediator** pattern defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly.

### Implementation Files

- [mediator.go](./mediator/mediator.go)
- [colleague.go](./mediator/colleague.go)
- [chat_mediator.go](./mediator/chat_mediator.go)
- [user.go](./mediator/user.go)

### Test Files

- [mediator_test.go](./mediator/mediator_test.go)
- [colleague_test.go](./mediator/colleague_test.go)
- [chat_mediator_test.go](./mediator/chat_mediator_test.go)
- [user_test.go](./mediator/user_test.go)

---

## **Command**

The **Command** pattern encapsulates a request as an object, allowing clients to parameterize requests, queue them, and support undoable operations.

### Implementation Files

- [command.go](./command/command.go)
- [receiver_light.go](./command/receiver_light.go)
- [turn_on_command.go](./command/turn_on_command.go)
- [turn_off_command.go](./command/turn_off_command.go)
- [invoker_remote.go](./command/invoker_remote.go)

### Test Files

- [command_test.go](./command/command_test.go)
- [receiver_light_test.go](./command/receiver_light_test.go)
- [turn_on_command_test.go](./command/turn_on_command_test.go)
- [turn_off_command_test.go](./command/turn_off_command_test.go)
- [invoker_remote_test.go](./command/invoker_remote_test.go)

---

## **Chain of Responsibility**

The **Chain of Responsibility** pattern allows a request to be passed along a chain of handlers until one of them handles it.

### Implementation Files

- [handler.go](./chainofresponsibility/handler.go)
- [request.go](./chainofresponsibility/request.go)
- [level1_support.go](./chainofresponsibility/level1_support.go)
- [level2_support.go](./chainofresponsibility/level2_support.go)
- [level3_support.go](./chainofresponsibility/level3_support.go)

### Test Files

- [handler_test.go](./chainofresponsibility/handler_test.go)
- [request_test.go](./chainofresponsibility/request_test.go)
- [level1_support_test.go](./chainofresponsibility/level1_support_test.go)
- [level2_support_test.go](./chainofresponsibility/level2_support_test.go)
- [level3_support_test.go](./chainofresponsibility/level3_support_test.go)

---

## **Conclusion**

This directory demonstrates idiomatic Go implementations of behavioral design patterns, with a strong focus on:

- Interfaces for client typing
- Composition over inheritance
- Thread-safety where applicable
- Clear separation of responsibilities
- Comprehensive unit tests

Happy coding! 🚀

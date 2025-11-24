# **Behavioral Design Patterns in Python**

Behavioral design patterns focus on how objects interact and communicate with each other.
They help define clear communication pathways, responsibilities, and execution flows.

This repository contains implementations of the following behavioral patterns in Python:

- [Observer](#observer)
- [Strategy](#strategy)
- [Command](#command)
- [State](#state)
- [Mediator](#mediator)
- [Chain of Responsibility](#chain-of-responsibility)

---

## **Observer**

The **Observer** pattern defines a one-to-many dependency between objects so that when one object changes state, all dependents are notified automatically.

### Implementation Files

- [subject.py](../../src/behavioral/observer/subject.py)
- [observer.py](../../src/behavioral/observer/observer.py)
- [concrete_subject.py](../../src/behavioral/observer/concrete_subject.py)
- [concrete_observer_a.py](../../src/behavioral/observer/concrete_observer_a.py)
- [concrete_observer_b.py](../../src/behavioral/observer/concrete_observer_b.py)

### Test Files

- [test_subject.py](../../tests/behavioral/observer/test_subject.py)
- [test_observer.py](../../tests/behavioral/observer/test_observer.py)
- [test_concrete_subject.py](../../tests/behavioral/observer/test_concrete_subject.py)
- [test_concrete_observer_a.py](../../tests/behavioral/observer/test_concrete_observer_a.py)
- [test_concrete_observer_b.py](../../tests/behavioral/observer/test_concrete_observer_b.py)

---

## **Strategy**

The **Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Implementation Files

- [strategy.py](../../src/behavioral/strategy/strategy.py)
- [concrete_strategy_a.py](../../src/behavioral/strategy/concrete_strategy_a.py)
- [concrete_strategy_b.py](../../src/behavioral/strategy/concrete_strategy_b.py)
- [context.py](../../src/behavioral/strategy/context.py)

### Test Files

- [test_strategy.py](../../tests/behavioral/strategy/test_strategy.py)
- [test_concrete_strategy_a.py](../../tests/behavioral/strategy/test_concrete_strategy_a.py)
- [test_concrete_strategy_b.py](../../tests/behavioral/strategy/test_concrete_strategy_b.py)
- [test_context.py](../../tests/behavioral/strategy/test_context.py)

---

## **Command**

The **Command** pattern turns requests into standalone objects, allowing operations such as queuing, logging, undo, and flexible invocation.

### Implementation Files

- [command.py](../../src/behavioral/command/command.py)
- [receiver.py](../../src/behavioral/command/receiver.py)
- [concrete_command_a.py](../../src/behavioral/command/concrete_command_a.py)
- [concrete_command_b.py](../../src/behavioral/command/concrete_command_b.py)
- [invoker.py](../../src/behavioral/command/invoker.py)

### Test Files

- [test_command.py](../../tests/behavioral/command/test_command.py)
- [test_receiver.py](../../tests/behavioral/command/test_receiver.py)
- [test_concrete_command_a.py](../../tests/behavioral/command/test_concrete_command_a.py)
- [test_concrete_command_b.py](../../tests/behavioral/command/test_concrete_command_b.py)
- [test_invoker.py](../../tests/behavioral/command/test_invoker.py)

---

## **State**

The **State** pattern lets an object alter its behavior when its internal state changes.
The object will appear to change its class.

### Implementation Files

- [state.py](../../src/behavioral/state/state.py)
- [concrete_state_a.py](../../src/behavioral/state/concrete_state_a.py)
- [concrete_state_b.py](../../src/behavioral/state/concrete_state_b.py)
- [context.py](../../src/behavioral/state/context.py)

### Test Files

- [test_state.py](../../tests/behavioral/state/test_state.py)
- [test_concrete_state_a.py](../../tests/behavioral/state/test_concrete_state_a.py)
- [test_concrete_state_b.py](../../tests/behavioral/state/test_concrete_state_b.py)
- [test_context.py](../../tests/behavioral/state/test_context.py)

---

## **Mediator**

The **Mediator** pattern defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing direct references.

### Implementation Files

- [mediator.py](../../src/behavioral/mediator/mediator.py)
- [colleague.py](../../src/behavioral/mediator/colleague.py)
- [concrete_mediator.py](../../src/behavioral/mediator/concrete_mediator.py)
- [concrete_colleague_a.py](../../src/behavioral/mediator/concrete_colleague_a.py)
- [concrete_colleague_b.py](../../src/behavioral/mediator/concrete_colleague_b.py)

### Test Files

- [test_mediator.py](../../tests/behavioral/mediator/test_mediator.py)
- [test_colleague.py](../../tests/behavioral/mediator/test_colleague.py)
- [test_concrete_colleague_a.py](../../tests/behavioral/mediator/test_concrete_colleague_a.py)
- [test_concrete_colleague_b.py](../../tests/behavioral/mediator/test_concrete_colleague_b.py)
- [test_concrete_mediator.py](../../tests/behavioral/mediator/test_concrete_mediator.py)

---

## **Chain of Responsibility**

The **Chain of Responsibility** pattern allows passing a request along a chain of handlers.
Each handler can choose to process the request or pass it onward.

### Implementation Files

- [handler.py](../../src/behavioral/chain_of_responsibility/handler.py)
- [abstract_handler.py](../../src/behavioral/chain_of_responsibility/abstract_handler.py)
- [concrete_handler_a.py](../../src/behavioral/chain_of_responsibility/concrete_handler_a.py)
- [concrete_handler_b.py](../../src/behavioral/chain_of_responsibility/concrete_handler_b.py)

### Test Files

- [test_handler.py](../../tests/behavioral/chain_of_responsibility/test_handler.py)
- [test_abstract_handler.py](../../tests/behavioral/chain_of_responsibility/test_abstract_handler.py)
- [test_concrete_handler_a.py](../../tests/behavioral/chain_of_responsibility/test_concrete_handler_a.py)
- [test_concrete_handler_b.py](../../tests/behavioral/chain_of_responsibility/test_concrete_handler_b.py)

---

## **Conclusion**

This repository demonstrates the use of behavioral design patterns in Python with clear, separated implementations and comprehensive tests.
Each pattern resides in its own folder and includes dedicated test coverage to ensure correctness, maintainability, and ease of understanding.

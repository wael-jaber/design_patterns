### **Behavioral Design Patterns in Java**

Behavioral design patterns focus on communication between objects and the delegation of responsibility. These patterns help define how objects interact while ensuring flexibility and scalability.

This repository contains implementations of the following behavioral patterns in Java:

- [Observer](#observer)
- [Strategy](#strategy)
- [State](#state)
- [Mediator](#mediator)
- [Command](#command)
- [Chain of Responsibility](#chain-of-responsibility)

---

## **Observer**

The **Observer** pattern defines a dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Implementation Files

- [Observer.java](./observer/Observer.java)
- [ConcreteSubject.java](./observer/ConcreteSubject.java)
- [ConcreteObserver.java](./observer/ConcreteObserver.java)

### Test Files

- [ConcreteObserverTest.java](../../test/behavioral/observer/ConcreteObserverTest.java)
- [ConcreteSubjectTest.java](../../test/behavioral/observer/ConcreteSubjectTest.java)

---

## **Strategy**

The **Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from the clients that use it.

### Implementation Files

- [Strategy.java](./strategy/Strategy.java)
- [ConcreteStrategyA.java](./strategy/ConcreteStrategyA.java)
- [ConcreteStrategyB.java](./strategy/ConcreteStrategyB.java)
- [Context.java](./strategy/Context.java)

### Test Files

- [ConcreteStrategyATest.java](../../test/behavioral/strategy/ConcreteStrategyATest.java)
- [ConcreteStrategyBTest.java](../../test/behavioral/strategy/ConcreteStrategyBTest.java)
- [ContextTest.java](../../test/behavioral/strategy/ContextTest.java)

---

## **State**

The **State** pattern allows an object to alter its behavior when its internal state changes. The object appears to change its class.

### Implementation Files

- [State.java](./state/State.java)
- [ConcreteStateA.java](./state/ConcreteStateA.java)
- [ConcreteStateB.java](./state/ConcreteStateB.java)
- [Context.java](./state/Context.java)

### Test Files

- [ConcreteStateATest.java](../../test/behavioral/state/ConcreteStateATest.java)
- [ConcreteStateBTest.java](../../test/behavioral/state/ConcreteStateBTest.java)
- [ContextTest.java](../../test/behavioral/state/ContextTest.java)

---

## **Mediator**

The **Mediator** pattern defines an object that encapsulates communication between multiple objects to promote loose coupling.

### Implementation Files

- [Mediator.java](./mediator/Mediator.java)
- [ConcreteMediator.java](./mediator/ConcreteMediator.java)
- [Colleague.java](./mediator/Colleague.java)
- [ConcreteColleagueA.java](./mediator/ConcreteColleagueA.java)
- [ConcreteColleagueB.java](./mediator/ConcreteColleagueB.java)

### Test Files

- [ConcreteColleagueATest.java](../../test/behavioral/mediator/ConcreteColleagueATest.java)
- [ConcreteColleagueBTest.java](../../test/behavioral/mediator/ConcreteColleagueBTest.java)
- [ConcreteMediatorTest.java](../../test/behavioral/mediator/ConcreteMediatorTest.java)

---

## **Command**

The **Command** pattern encapsulates a request as an object, thereby allowing parameterization of clients, queuing of requests, and logging of executed commands.

### Implementation Files

- [Command.java](./command/Command.java)
- [ConcreteCommand.java](./command/ConcreteCommand.java)
- [Receiver.java](./command/Receiver.java)
- [Invoker.java](./command/Invoker.java)

### Test Files

- [ReceiverTest.java](../../test/behavioral/command/ReceiverTest.java)
- [ConcreteCommandTest.java](../../test/behavioral/command/ConcreteCommandTest.java)
- [InvokerTest.java](../../test/behavioral/command/InvokerTest.java)

---

## **Chain of Responsibility**

The **Chain of Responsibility** pattern lets multiple objects handle a request without the sender needing to know which object will handle it.

### Implementation Files

- [Handler.java](./chainofresponsibility/Handler.java)
- [ConcreteHandlerA.java](./chainofresponsibility/ConcreteHandlerA.java)
- [ConcreteHandlerB.java](./chainofresponsibility/ConcreteHandlerB.java)
- [ConcreteHandlerC.java](./chainofresponsibility/ConcreteHandlerC.java)

### Test Files

- [ConcreteHandlerATest.java](../../test/behavioral/chainofresponsibility/ConcreteHandlerATest.java)
- [ConcreteHandlerBTest.java](../../test/behavioral/chainofresponsibility/ConcreteHandlerBTest.java)
- [ConcreteHandlerCTest.java](../../test/behavioral/chainofresponsibility/ConcreteHandlerCTest.java)
- [ChainOfResponsibilityTest.java](../../test/behavioral/chainofresponsibility/ChainOfResponsibilityTest.java)

---

## **Conclusion**

This repository demonstrates the use of behavioral patterns in Java with clear examples and test cases for each pattern. Follow the links above to view the source code and test files for detailed insights into each pattern.

Happy coding! 🚀


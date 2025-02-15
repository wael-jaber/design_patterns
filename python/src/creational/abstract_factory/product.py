
from abc import ABC, abstractmethod


class AbstractProductA(ABC):
    """
    Abstract Product A: Defines an interface that concrete
    products must implement.
    """

    @abstractmethod
    def operation_a(self) -> str:
        pass


class AbstractProductB(ABC):
    """
    Abstract Product B: Defines an interface that concrete
    products must implement.
    """

    @abstractmethod
    def operation_b(self) -> str:
        pass


class ConcreteProductA1(AbstractProductA):
    """
    Concrete Product A1: Implements AbstractProductA.
    """

    def operation_a(self) -> str:
        return "ConcreteProductA1 operation executed"


class ConcreteProductA2(AbstractProductA):
    """
    Concrete Product A2: Implements AbstractProductA.
    """

    def operation_a(self) -> str:
        return "ConcreteProductA2 operation executed"


class ConcreteProductB1(AbstractProductB):
    """
    Concrete Product B1: Implements AbstractProductB.
    """

    def operation_b(self) -> str:
        return "ConcreteProductB1 operation executed"


class ConcreteProductB2(AbstractProductB):
    """
    Concrete Product B2: Implements AbstractProductB.
    """

    def operation_b(self) -> str:
        return "ConcreteProductB2 operation executed"

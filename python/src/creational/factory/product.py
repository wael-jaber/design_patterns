from abc import ABC, abstractmethod


class Product(ABC):
    """
    Abstract Product: Defines an interface that concrete products must implement.
    """

    @abstractmethod
    def operation(self) -> str:
        """
        Abstract method to be implemented by concrete products.
        """
        pass


class ConcreteProductA(Product):
    """
    Concrete Product A: Implements the Product interface.
    """

    def operation(self) -> str:
        return "ConcreteProductA operation executed"


class ConcreteProductB(Product):
    """
    Concrete Product B: Implements the Product interface.
    """

    def operation(self) -> str:
        return "ConcreteProductB operation executed"

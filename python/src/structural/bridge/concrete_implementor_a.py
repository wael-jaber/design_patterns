from .implementor import Implementor


class ConcreteImplementorA(Implementor):
    """
    Concrete Implementor A provides a specific implementation.
    """

    def operation_implementation(self) -> str:
        return "ConcreteImplementorA: Operation"

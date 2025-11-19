from .implementor import Implementor


class ConcreteImplementorB(Implementor):
    """
    Concrete Implementor B provides a different implementation.
    """

    def operation_implementation(self) -> str:
        return "ConcreteImplementorB: Operation"

from .implementor import Implementor


class Abstraction:
    """
    The Abstraction defines the high-level control logic. It delegates the
    low-level work to the Implementor object.
    """

    def __init__(self, implementor: Implementor):
        self._implementor = implementor

    def operation(self) -> str:
        """
        Delegates the work to the implementor.
        """
        return self._implementor.operation_implementation()

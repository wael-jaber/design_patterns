from abc import ABC, abstractmethod


class Implementor(ABC):
    """
    Implementor declares the low-level interface used by Abstraction.
    Concrete implementors provide platform-specific implementations.
    """

    @abstractmethod
    def operation_implementation(self) -> str:
        pass

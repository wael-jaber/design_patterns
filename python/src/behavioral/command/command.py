from abc import ABC, abstractmethod


class Command(ABC):
    """
    The Command interface declares an execution method.
    """

    @abstractmethod
    def execute(self) -> None:
        pass

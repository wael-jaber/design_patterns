from abc import ABC, abstractmethod


class Mediator(ABC):
    """
    The Mediator interface declares communication methods
    used by Colleague objects.
    """

    @abstractmethod
    def notify(self, sender: object, event: str) -> str:
        pass

from abc import ABC, abstractmethod
from .observer import Observer


class Subject(ABC):
    """
    The Subject interface declares operations for managing subscribers.
    """

    @abstractmethod
    def attach(self, observer: Observer) -> None:
        pass

    @abstractmethod
    def detach(self, observer: Observer) -> None:
        pass

    @abstractmethod
    def notify(self, message: str) -> None:
        pass

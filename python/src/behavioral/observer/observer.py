from abc import ABC, abstractmethod


class Observer(ABC):
    """
    Observer interface declares the update method used by subjects.
    """

    @abstractmethod
    def update(self, message: str) -> None:
        pass

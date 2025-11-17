from abc import ABC, abstractmethod


class Component(ABC):
    @abstractmethod
    def operation(self) -> str:
        pass

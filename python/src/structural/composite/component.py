from abc import ABC, abstractmethod


class Component(ABC):
    @abstractmethod
    def operation(self) -> str:
        pass

    def add(self, component: "Component") -> None:
        pass

    def remove(self, component: "Component") -> None:
        pass

    def is_composite(self) -> bool:
        return False

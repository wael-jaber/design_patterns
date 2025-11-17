from .component import Component


class ConcreteComponent(Component):
    def operation(self) -> str:
        return "ConcreteComponent"

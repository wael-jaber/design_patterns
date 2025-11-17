from .component import Component


class Decorator(Component):
    def __init__(self, component: Component):
        self._component = component

    def operation(self) -> str:
        return self._component.operation()

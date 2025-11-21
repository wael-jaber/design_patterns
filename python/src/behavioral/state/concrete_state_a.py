from .state import State


class ConcreteStateA(State):
    """
    Concrete State A: defines behavior and transitions.
    """

    def handle(self) -> str:
        return "State A: Handling request."

    def next_state(self) -> State:
        from .concrete_state_b import ConcreteStateB
        return ConcreteStateB()

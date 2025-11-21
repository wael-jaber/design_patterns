from .state import State


class ConcreteStateB(State):
    """
    Concrete State B: defines different behavior and transitions.
    """

    def handle(self) -> str:
        return "State B: Handling request."

    def next_state(self) -> State:
        from .concrete_state_a import ConcreteStateA
        return ConcreteStateA()

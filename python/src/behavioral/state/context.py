from .state import State


class Context:
    """
    The Context maintains a reference to a State instance that determines
    its behavior.
    """

    def __init__(self, state: State):
        self._state: State = state

    def change_state(self) -> None:
        """
        Ask the current state what the next state should be.
        """
        self._state = self._state.next_state()

    def request(self) -> str:
        """
        Delegate behavior to current state.
        """
        return self._state.handle()


# Example Usage:
#
# from context import Context
# from concrete_state_a import ConcreteStateA
#
# context = Context(ConcreteStateA())
#
# print(context.request())  # "State A: Handling request."
# context.change_state()
#
# print(context.request())  # "State B: Handling request."
# context.change_state()
#
# print(context.request())  # "State A: Handling request."
#
#
# Common Mistakes to Avoid:
#
# 1. Hardcoding transitions inside Context.
#    - Fix: Transitions belong inside State classes.
#
# 2. Using too many states when if/else would be simpler.
#    - Fix: Use State Pattern only when behavior *must* change dynamically.
#
# 3. Exposing state-switching logic outside Context.
#    - Fix: Provide methods like request() and change_state() only.

from src.behavioral.state.concrete_state_b import ConcreteStateB
from src.behavioral.state.state import State


def test_state_b_handle():
    state = ConcreteStateB()
    assert state.handle() == "State B: Handling request."


def test_state_b_transitions_to_a():
    state = ConcreteStateB()
    next_state = state.next_state()

    from src.behavioral.state.concrete_state_a import ConcreteStateA
    assert isinstance(next_state, ConcreteStateA)
    assert isinstance(next_state, State)

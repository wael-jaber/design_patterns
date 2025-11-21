from src.behavioral.state.concrete_state_a import ConcreteStateA
from src.behavioral.state.state import State


def test_state_a_handle():
    """
    Test the handle method of ConcreteStateA.
    """
    state = ConcreteStateA()
    assert state.handle() == "State A: Handling request."


def test_state_a_transitions_to_b():
    """
    Test that ConcreteStateA transitions to ConcreteStateB.
    """
    state = ConcreteStateA()
    next_state = state.next_state()

    from src.behavioral.state.concrete_state_b import ConcreteStateB
    assert isinstance(next_state, ConcreteStateB)
    assert isinstance(next_state, State)

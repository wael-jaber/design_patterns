from src.behavioral.state.context import Context
from src.behavioral.state.concrete_state_a import ConcreteStateA
from src.behavioral.state.concrete_state_b import ConcreteStateB


def test_context_uses_initial_state():
    """
    Test that the Context uses the initial state correctly.
    """
    context = Context(ConcreteStateA())

    assert context.request() == "State A: Handling request."


def test_context_switches_state():
    """
    Test that the Context can switch states correctly.
    """
    context = Context(ConcreteStateA())

    # First state
    assert context.request() == "State A: Handling request."

    # Switch to StateB
    context.change_state()
    assert context.request() == "State B: Handling request."

    # Switch back to StateA
    context.change_state()
    assert context.request() == "State A: Handling request."


def test_context_state_type_changes_correctly():
    """
    Test that the Context's state type changes correctly.
    """
    context = Context(ConcreteStateA())

    assert isinstance(context._state, ConcreteStateA)

    context.change_state()
    assert isinstance(context._state, ConcreteStateB)

    context.change_state()
    assert isinstance(context._state, ConcreteStateA)

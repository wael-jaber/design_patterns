import pytest
from src.behavioral.state.state import State


def test_state_is_abstract():
    """
    Test that the State class cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        State()

import pytest
from src.behavioral.mediator.mediator import Mediator


def test_mediator_is_abstract():
    """
    Test that Mediator cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Mediator()

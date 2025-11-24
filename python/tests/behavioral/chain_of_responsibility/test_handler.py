import pytest
from src.behavioral.chain_of_responsibility.handler import Handler


def test_handler_is_abstract():
    """
    Test that Handler cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Handler()

import pytest
from src.structural.bridge.implementor import Implementor


def test_implementor_is_abstract():
    """
    Test that Implementor cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Implementor()  # abstract — cannot be instantiated

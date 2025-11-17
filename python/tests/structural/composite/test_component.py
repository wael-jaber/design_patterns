from src.structural.composite.component import Component
import pytest


def test_component_instantiation_should_fail():
    """
    Test that Component is abstract and should not be instantiated.
    """
    with pytest.raises(TypeError):
        Component()

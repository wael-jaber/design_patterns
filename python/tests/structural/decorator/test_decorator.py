from src.structural.decorator.decorator import Decorator
from src.structural.decorator.concrete_component import ConcreteComponent


def test_decorator_forwards_operation():
    """
    Test that Decorator delecate the call to the wrapper component.
    """
    component = ConcreteComponent()
    decorator = Decorator(component)
    assert decorator.operation() == "ConcreteComponent"

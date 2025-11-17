from src.structural.decorator.concrete_component import ConcreteComponent
from src.structural.decorator.concrete_decorator_a import ConcreteDecoratorA


def test_concrete_decorator_a_wraps_component():
    """
    Test that the decorated string is returned from the ConcreteDecoratorA.
    """
    component = ConcreteComponent()
    decorator_a = ConcreteDecoratorA(component)
    assert decorator_a.operation() == "ConcreteDecoratorA(ConcreteComponent)"

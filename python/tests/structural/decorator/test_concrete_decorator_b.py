from src.structural.decorator.concrete_component import ConcreteComponent
from src.structural.decorator.concrete_decorator_a import ConcreteDecoratorA
from src.structural.decorator.concrete_decorator_b import ConcreteDecoratorB


def test_concrete_decorator_b_wraps_component():
    """
    Test decorated string is returned from ConcreteDecoratorB
    """
    component = ConcreteComponent()
    decorator_b = ConcreteDecoratorB(component)
    assert decorator_b.operation() == "ConcreteDecoratorB(ConcreteComponent)"


def test_decorator_layering():
    """
    Test that nested decorated string is returned : B wraps A wraps Component.
    """
    component = ConcreteComponent()
    decorator_a = ConcreteDecoratorA(component)
    decorator_b = ConcreteDecoratorB(decorator_a)
    assert decorator_b.operation() == (
            "ConcreteDecoratorB(ConcreteDecoratorA(ConcreteComponent))"
            )

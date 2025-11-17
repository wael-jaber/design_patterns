from src.structural.decorator.concrete_component import ConcreteComponent


def test_concrete_component_operation():
    """
    Test that ConcreteComponent operation return string.
    """
    component = ConcreteComponent()
    assert component.operation() == "ConcreteComponent"

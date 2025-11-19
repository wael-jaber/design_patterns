from src.structural.bridge.concrete_implementor_b import ConcreteImplementorB


def test_concrete_implementor_b_operation():
    """
    Test that ConcreteImplementorB returns a string.
    """
    impl = ConcreteImplementorB()
    assert impl.operation_implementation() == "ConcreteImplementorB: Operation"

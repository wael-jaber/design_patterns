from src.structural.bridge.concrete_implementor_a import ConcreteImplementorA


def test_concrete_implementor_a_operation():
    """
    Test that ConcreteImplementorA return a string.
    """
    impl = ConcreteImplementorA()
    assert impl.operation_implementation() == "ConcreteImplementorA: Operation"

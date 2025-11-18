from src.structural.bridge.extended_abstraction import ExtendedAbstraction


class FakeImplementor:
    def operation_implementation(self):
        return "Base Operation"


def test_extended_abstraction_adds_extra_behavior():
    """
    Test that ExtendedAbstraction adds extra behaviour.
    """
    abstraction = ExtendedAbstraction(FakeImplementor())
    result = abstraction.operation()

    assert "ExtendedAbstraction" in result
    assert "Base Operation" in result

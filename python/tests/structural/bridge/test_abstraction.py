from src.structural.bridge.abstraction import Abstraction
from src.structural.bridge.implementor import Implementor


class FakeImplementor(Implementor):
    def operation_implementation(self) -> str:
        return "Fake Operation"


def test_abstraction_delegates_to_implementor():
    """
    Test that Abstraction delegates to Implementor.
    """
    abstraction = Abstraction(FakeImplementor())
    assert abstraction.operation() == "Fake Operation"

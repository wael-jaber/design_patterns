from src.structural.facade.facade import Facade
from src.structural.facade.subsystem_a import SubsystemA
from src.structural.facade.subsystem_b import SubsystemB


def test_facade_operation_default_subsystems():
    """
    Test that Facade works correctly with default subsystems.
    """
    facade = Facade()
    result = facade.operation()
    assert "SubsystemA: Ready" in result
    assert "SubsystemB: Go!" in result


def test_facade_operation_with_custom_subsystems():
    """
    Test that Facade uses the custom subsystems passed to it.
    """
    class MockSubsystemA(SubsystemA):
        def operation_a(self) -> str:
            return "Mock A\n"

    class MockSubsystemB(SubsystemB):
        def operation_b(self) -> str:
            return "Mock B\n"

    facade = Facade(subsystem_a=MockSubsystemA(), subsystem_b=MockSubsystemB())
    result = facade.operation()
    assert "Mock A" in result
    assert "Mock B" in result

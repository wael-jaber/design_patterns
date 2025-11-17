from src.structural.facade.subsystem_b import SubsystemB


def test_operation_b_returns_expected_output():
    """
    Test that SubsystemB returns the correct string.
    """
    subsystem = SubsystemB()
    assert subsystem.operation_b() == "SubsystemB: Go!\n"

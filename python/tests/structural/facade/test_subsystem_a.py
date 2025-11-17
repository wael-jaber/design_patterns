from src.structural.facade.subsystem_a import SubsystemA


def test_operation_a_returns_expected_output():
    """
    Test that SubsystemA returns the correct string.
    """
    subsystem = SubsystemA()
    assert subsystem.operation_a() == "SubsystemA: Ready\n"

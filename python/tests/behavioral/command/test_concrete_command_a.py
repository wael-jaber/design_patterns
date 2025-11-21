from src.behavioral.command.concrete_command_a import ConcreteCommandA
from src.behavioral.command.receiver import Receiver


def test_concrete_command_a_triggers_action_a():
    """
    Test that ConcreteCommandA correctly triggers Receiver's action A.
    """
    receiver = Receiver()
    command = ConcreteCommandA(receiver)

    result = command.execute()

    assert result == "Receiver: Action A executed."

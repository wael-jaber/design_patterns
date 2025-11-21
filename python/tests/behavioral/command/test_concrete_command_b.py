from src.behavioral.command.concrete_command_b import ConcreteCommandB
from src.behavioral.command.receiver import Receiver


def test_concrete_command_b_triggers_action_b():
    """
    Test that ConcreteCommandB correctly triggers Receiver's action B.
    """
    receiver = Receiver()
    command = ConcreteCommandB(receiver)

    result = command.execute()

    assert result == "Receiver: Action B executed."

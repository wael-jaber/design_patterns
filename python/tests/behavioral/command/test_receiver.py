from src.behavioral.command.receiver import Receiver


def test_receiver_actions():
    """
    Test that the Receiver performs its actions correctly.
    """
    receiver = Receiver()

    assert receiver.action_a() == "Receiver: Action A executed."
    assert receiver.action_b() == "Receiver: Action B executed."

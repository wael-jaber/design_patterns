from .command import Command
from .receiver import Receiver


class ConcreteCommandB(Command):
    """
    Concrete Command B triggers Receiver's action B.
    """

    def __init__(self, receiver: Receiver):
        self._receiver = receiver

    def execute(self) -> str:
        return self._receiver.action_b()

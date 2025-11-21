from .command import Command
from .receiver import Receiver


class ConcreteCommandA(Command):
    """
    Concrete Command A triggers Receiver's action A.
    """

    def __init__(self, receiver: Receiver):
        self._receiver = receiver

    def execute(self) -> str:
        return self._receiver.action_a()

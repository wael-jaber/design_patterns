from typing import Optional
from .command import Command


class Invoker:
    """
    The Invoker stores and triggers commands.
    """

    def __init__(self):
        self._on_start: Optional[Command] = None
        self._on_finish: Optional[Command] = None

    def set_on_start(self, command: Command) -> None:
        self._on_start = command

    def set_on_finish(self, command: Command) -> None:
        self._on_finish = command

    def run(self) -> list[str]:
        output = []

        if self._on_start:
            output.append("Invoker: Starting operation...")
            output.append(self._on_start.execute())

        if self._on_finish:
            output.append("Invoker: Finishing operation...")
            output.append(self._on_finish.execute())

        return output


# Example Usage:
#
# from receiver import Receiver
# from concrete_command_a import ConcreteCommandA
# from concrete_command_b import ConcreteCommandB
# from invoker import Invoker
#
# receiver = Receiver()
# invoker = Invoker()
#
# command_a = ConcreteCommandA(receiver)
# command_b = ConcreteCommandB(receiver)
#
# invoker.set_on_start(command_a)
# invoker.set_on_finish(command_b)
#
# invoker.run()
#
# Output:
# Invoker: Starting operation...
# Receiver: Action A executed.
# Invoker: Finishing operation...
# Receiver: Action B executed.
#
#
# Common Mistakes to Avoid:
#
# 1. Putting business logic inside Commands.
#    - Fix: Keep logic in Receiver, commands should delegate only.
#
# 2. Using too many command classes for trivial operations.
#    - Fix: Use Command Pattern only when you need undo/queue/logging/execution control.
#
# 3. Tight coupling Invoker <-> concrete commands.
#    - Fix: Invoker should work with the Command interface only.

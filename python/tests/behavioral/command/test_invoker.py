from src.behavioral.command.invoker import Invoker
from src.behavioral.command.concrete_command_a import ConcreteCommandA
from src.behavioral.command.concrete_command_b import ConcreteCommandB
from src.behavioral.command.receiver import Receiver


def test_invoker_runs_start_and_finish_commands():
    """
    Test that Invoker runs both start and finish commands correctly.
    """
    receiver = Receiver()

    command_a = ConcreteCommandA(receiver)
    command_b = ConcreteCommandB(receiver)

    invoker = Invoker()
    invoker.set_on_start(command_a)
    invoker.set_on_finish(command_b)

    output = invoker.run()

    assert output == [
        "Invoker: Starting operation...",
        "Receiver: Action A executed.",
        "Invoker: Finishing operation...",
        "Receiver: Action B executed.",
    ]


def test_invoker_runs_only_start_if_finish_not_set():
    """
    Test that Invoker runs only the start command if finish command is not set.
    """
    receiver = Receiver()
    command_a = ConcreteCommandA(receiver)

    invoker = Invoker()
    invoker.set_on_start(command_a)

    output = invoker.run()

    assert output == [
        "Invoker: Starting operation...",
        "Receiver: Action A executed.",
    ]


def test_invoker_runs_only_finish_if_start_not_set():
    """
    Test that Invoker runs only the finish command if start command is not set.
    """
    receiver = Receiver()
    command_b = ConcreteCommandB(receiver)

    invoker = Invoker()
    invoker.set_on_finish(command_b)

    output = invoker.run()

    assert output == [
        "Invoker: Finishing operation...",
        "Receiver: Action B executed.",
    ]


def test_invoker_runs_nothing_if_no_commands_set():
    """
    Test that Invoker runs nothing if no commands are set.
    """
    invoker = Invoker()

    output = invoker.run()

    assert output == []

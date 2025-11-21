import pytest
from src.behavioral.command.command import Command


def test_command_is_abstract():
    """
    Test that the Command class cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Command()

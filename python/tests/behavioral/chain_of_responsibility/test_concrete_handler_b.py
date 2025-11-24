from src.behavioral.chain_of_responsibility.concrete_handler_b import (
        ConcreteHandlerB
        )


def test_handler_b_processes_requests_starting_with_b():
    """
    Test that ConcreteHandlerB processes requests starting with 'B'.
    """
    handler = ConcreteHandlerB()

    result = handler.handle("Blueberry")

    assert result == "Handler B processed: Blueberry"


def test_handler_b_returns_none_when_no_next_handler():
    """
    Test that ConcreteHandlerB returns None when it cannot handle the request.
    """
    handler = ConcreteHandlerB()

    result = handler.handle("Cherry")

    assert result is None

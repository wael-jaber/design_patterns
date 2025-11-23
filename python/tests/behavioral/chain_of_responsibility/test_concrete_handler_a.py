from src.behavioral.chain_of_responsibility.concrete_handler_a import (
        ConcreteHandlerA
        )
from src.behavioral.chain_of_responsibility.concrete_handler_b import (
        ConcreteHandlerB
        )


def test_handler_a_processes_requests_starting_with_a():
    """
    Test that ConcreteHandlerA processes requests starting with 'A'.
    """
    handler = ConcreteHandlerA()

    result = handler.handle("Apple")

    assert result == "Handler A processed: Apple"


def test_handler_a_forwards_to_b_when_cannot_handle():
    """
    Test that ConcreteHandlerA forwards the request to ConcreteHandlerB
    """
    h1 = ConcreteHandlerA()
    h2 = ConcreteHandlerB()
    h1.set_next(h2)

    result = h1.handle("Banana")

    assert result == "Handler B processed: Banana"

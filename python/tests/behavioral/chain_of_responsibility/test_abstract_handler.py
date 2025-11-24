from src.behavioral.chain_of_responsibility.abstract_handler import (
        AbstractHandler
        )


def test_abstract_handler_forwards_when_no_handler_can_process():
    """
    Test that AbstractHandler forwards the request when no handler can process
    it.
    """
    handler = AbstractHandler()

    result = handler.handle("Request")

    # Base handler returns None when nothing handles it
    assert result is None


def test_abstract_handler_sets_next_and_allows_chaining():
    """
    Test that AbstractHandler can set the next handler and supports chaining.
    """
    h1 = AbstractHandler()
    h2 = AbstractHandler()

    returned = h1.set_next(h2)

    assert h1._next_handler is h2
    assert returned is h2  # chaining supported

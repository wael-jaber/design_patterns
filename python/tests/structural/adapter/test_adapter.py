from src.structural.adapter.adaptee import Adaptee
from src.structural.adapter.adapter import Adapter


def test_request_translates_adaptee_output():
    """
    Test that the addapter returns the special behaviour of the adaptee.
    """
    adaptee = Adaptee()
    adapter = Adapter(adaptee)
    result = adapter.request()
    assert result == (
            "Adapter: (TRANSLATED) Special behavior of the Adaptee."
            )

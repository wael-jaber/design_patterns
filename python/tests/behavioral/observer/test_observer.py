import pytest
from src.behavioral.observer.observer import Observer


def test_observer_is_abstract():
    """
    Test that the Observer class cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Observer()

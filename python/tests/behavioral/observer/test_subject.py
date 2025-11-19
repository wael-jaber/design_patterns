import pytest
from src.behavioral.observer.subject import Subject


def test_subject_interface_is_abstract():
    """
    Test that the Subject class cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Subject()

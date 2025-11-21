import pytest
from src.behavioral.strategy.strategy import Strategy


def test_strategy_is_abstract():
    """
    Test that the Strategy class cannot be instantiated directly.
    """
    with pytest.raises(TypeError):
        Strategy()

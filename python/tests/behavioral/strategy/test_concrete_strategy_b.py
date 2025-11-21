from src.behavioral.strategy.concrete_strategy_b import ConcreteStrategyB


def test_concrete_strategy_b_multiplies_numbers():
    """
    Test that ConcreteStrategyB correctly multiplies two numbers.
    """
    strategy = ConcreteStrategyB()

    result = strategy.execute(5, 3)

    assert result == 15

from src.behavioral.strategy.concrete_strategy_a import ConcreteStrategyA


def test_concrete_strategy_a_adds_numbers():
    """
    Test that ConcreteStrategyA correctly adds two numbers.
    """
    strategy = ConcreteStrategyA()

    result = strategy.execute(5, 3)

    assert result == 8

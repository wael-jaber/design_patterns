from src.behavioral.strategy.context import Context
from src.behavioral.strategy.concrete_strategy_a import ConcreteStrategyA
from src.behavioral.strategy.concrete_strategy_b import ConcreteStrategyB


def test_context_uses_initial_strategy():
    context = Context(ConcreteStrategyA())

    result = context.execute_strategy(10, 2)

    assert result == 12  # addition from Strategy A


def test_context_can_switch_strategies():
    context = Context(ConcreteStrategyA())
    context.set_strategy(ConcreteStrategyB())

    result = context.execute_strategy(10, 2)

    assert result == 20  # multiplication from Strategy B


def test_context_calls_correct_strategy_method():
    class CustomStrategy:
        def __init__(self):
            self.called = False

        def execute(self, a, b):
            self.called = True
            return a - b

    strategy = CustomStrategy()
    context = Context(strategy)

    result = context.execute_strategy(10, 2)

    assert strategy.called is True
    assert result == 8

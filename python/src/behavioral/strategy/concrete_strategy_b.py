from .strategy import Strategy


class ConcreteStrategyB(Strategy):
    """
    Strategy B performs multiplication.
    """

    def execute(self, a: int, b: int) -> int:
        return a * b

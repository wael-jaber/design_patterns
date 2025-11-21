from .strategy import Strategy


class ConcreteStrategyA(Strategy):
    """
    Strategy A performs addition.
    """

    def execute(self, a: int, b: int) -> int:
        return a + b

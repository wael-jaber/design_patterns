from .strategy import Strategy


class Context:
    """
    The Context maintains a reference to a Strategy object and delegates
    the work to it instead of implementing multiple algorithm variations.
    """

    def __init__(self, strategy: Strategy):
        self._strategy: Strategy = strategy

    def set_strategy(self, strategy: Strategy) -> None:
        self._strategy = strategy

    def execute_strategy(self, a: int, b: int) -> int:
        return self._strategy.execute(a, b)


# Example Usage:
# from context import Context
# from concrete_strategy_a import ConcreteStrategyA
# from concrete_strategy_b import ConcreteStrategyB
#
# context = Context(ConcreteStrategyA())
# print(context.execute_strategy(5, 3))
# # Output: 8
#
# context.set_strategy(ConcreteStrategyB())
# print(context.execute_strategy(5, 3))
# # Output: 15
#
#
# Common Mistakes to Avoid:
#
# 1. Adding conditional logic inside the Context instead of strategies.
#    - Fix: Move algorithm variations into separate Strategy classes.
#
# 2. Creating too many strategies for trivial operations.
#    - Fix: Only use Strategy when you truly need interchangeable algorithms.
#
# 3. Forgetting to make Strategy methods consistent.
#    - Fix: Ensure all strategies implement the same method signature.

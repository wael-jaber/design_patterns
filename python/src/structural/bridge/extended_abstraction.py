from .abstraction import Abstraction
from .implementor import Implementor


class ExtendedAbstraction(Abstraction):
    """
    Extended version of Abstraction. Additional logic can be placed here.
    """

    def __init__(self, implementor: Implementor):
        super().__init__(implementor)

    def operation(self) -> str:
        """
        Extends the base operation with extra behavior.
        """
        return f"ExtendedAbstraction: {super().operation()}"


# Example Usage:
# class Main:
#     if __name__ == "__main__":
#         from concrete_implementor_a import ConcreteImplementorA
#         from concrete_implementor_b import ConcreteImplementorB
#         from extended_abstraction import ExtendedAbstraction
#
#         abstraction = ExtendedAbstraction(ConcreteImplementorA())
#         print(abstraction.operation())
#
#         abstraction = ExtendedAbstraction(ConcreteImplementorB())
#         print(abstraction.operation())
#
#
# Common Mistakes to Avoid:
#
# 1. Tight coupling between abstraction and implementation.
#    - Fix: Keep them separate and inject the implementor.
# 2. Misusing the pattern when there is no variation in implementation.
#    - Fix: Use Bridge only when you need multiple abstractions AND multiple
#      implementations.
# 3. Overcomplicating a simple hierarchy.
#    - Fix: Don't introduce Bridge unless both sides genuinely vary
#      independently.

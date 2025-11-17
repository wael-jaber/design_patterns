from .component import Component


class Leaf(Component):
    def operation(self) -> str:
        return "Leaf"

    def is_composite(self) -> bool:
        return False

# Example Usage:
# leaf = Leaf()
# print(leaf.operation())  # Output: Leaf
#
# Common Mistakes to Avoid:
# 1. Treating Leaf as a composite:
#    - Mistake: Calling add/remove on Leaf.
#    - Fix: Only call add/remove on composites that override those methods.

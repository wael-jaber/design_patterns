from .component import Component


class Composite(Component):
    def __init__(self):
        self._children: list[Component] = []

    def add(self, component: Component) -> None:
        self._children.append(component)

    def remove(self, component: Component) -> None:
        self._children.remove(component)

    def is_composite(self) -> bool:
        return True

    def operation(self) -> str:
        results = [child.operation() for child in self._children]
        return f"Branch({'+'.join(results)})"

# Example Usage:
# leaf1 = Leaf()
# leaf2 = Leaf()
# tree = Composite()
# tree.add(leaf1)
# tree.add(leaf2)
# print(tree.operation())  # Output: Branch(Leaf+Leaf)
#
# Common Mistakes to Avoid:
# 1. Forgetting to check is_composite:
#    - Mistake: Treating all Components as composites.
#    - Fix: Use `is_composite()` before calling add/remove.
# 2. Modifying internal children list directly:
#    - Mistake: Accessing _children from outside.
#    - Fix: Always use add/remove methods.

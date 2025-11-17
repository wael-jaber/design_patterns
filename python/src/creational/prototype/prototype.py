import copy
from abc import ABC, abstractmethod


class Prototype(ABC):
    @abstractmethod
    def clone(self):
        pass


class ConcretePrototype(Prototype):
    def __init__(self, name: str, data: list):
        self.name = name
        self.data = data

    def clone(self):
        return copy.deepcopy(self)

    def __str__(self):
        return f"ConcretePrototype(name={self.name}, data={self.data})"


# Example Usage:
# if __name__ == "__main__":
#     original = ConcretePrototype("original", [1, 2, 3])
#     cloned = original.clone()
#     print(original)  # ConcretePrototype(name=original, data=[1, 2, 3])
#     print(cloned)    # ConcretePrototype(name=original, data=[1, 2, 3])
#     print(original is cloned)             # False
#     print(original.data is cloned.data)   # False

# Common Mistakes to Avoid:
#
# 1. Using Shallow Copy Instead of Deep Copy:
#    - Mistake: Using `copy.copy()` or direct assignment can result in shared
#      references.
#    - Fix: Use `copy.deepcopy()` to ensure nested mutable objects are cloned
#      properly.
#
# 2. Forgetting to Implement Clone Method:
#    - Mistake: Missing `clone()` implementation in derived classes.
#    - Fix: Always ensure each subclass of `Prototype` overrides `clone()`
#      correctly.
#
# 3. Mutating Shared State:
#    - Mistake: Cloned object sharing references to mutable objects of the
#      original.
#    - Fix: Validate that all necessary fields are deeply copied and
#      independent.
#
# 4. Ignoring Inheritance for Prototypes:
#    - Mistake: Duplicating clone logic across classes.
#    - Fix: Use an abstract `Prototype` base class to enforce a consistent
#      cloning interface.

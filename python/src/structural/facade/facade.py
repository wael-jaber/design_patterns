from src.structural.facade.subsystem_a import SubsystemA
from src.structural.facade.subsystem_b import SubsystemB


class Facade:
    def __init__(self, subsystem_a: SubsystemA = None,
                 subsystem_b: SubsystemB = None):
        self._subsystem_a = subsystem_a or SubsystemA()
        self._subsystem_b = subsystem_b or SubsystemB()

    def operation(self) -> str:
        results = []
        results.append("Facade initializes subsystems:")
        results.append(self._subsystem_a.operation_a())
        results.append("Facade orders subsystems to perform the action:")
        results.append(self._subsystem_b.operation_b())
        return "".join(results)

# Example Usage:
# if __name__ == "__main__":
#     facade = Facade()
#     print(facade.operation())
#
# Expected Output:
# Facade initializes subsystems:
# SubsystemA: Ready
# Facade orders subsystems to perform the action:
# SubsystemB: Go!

# Common Mistakes to Avoid:
#
# 1. Violating Encapsulation:
#    - Mistake: Exposing too much of the subsystem through the facade.
#    - Fix: Only expose the necessary operations.
#
# 2. Overcomplicating the Facade:
#    - Mistake: Adding logic that belongs to subsystems.
#    - Fix: Keep the facade lightweight and delegate work.
#
# 3. Using Facade as God Object:
#    - Mistake: Making the facade do everything.
#    - Fix: Keep responsibilities separate and only orchestrate interactions.
#
# 4. Tight Coupling:
#    - Mistake: Hardcoding specific subsystem behavior into the facade.
#    - Fix: Inject subsystems if custom behavior is needed (as in the constructor).

from src.structural.adapter.target import Target
from src.structural.adapter.adaptee import Adaptee


class Adapter(Target):
    def __init__(self, adaptee: Adaptee):
        self._adaptee = adaptee

    def request(self) -> str:
        return (
            f"Adapter: (TRANSLATED) {self._adaptee.specific_request()[::-1]}"
            )

# Example Usage:
# if __name__ == "__main__":
#     adaptee = Adaptee()
#     target = Adapter(adaptee)
#     print(target.request())
#
# Output:
# Adapter: (TRANSLATED) Special behavior of the Adaptee.

# Common Mistakes to Avoid:
#
# 1. Misunderstanding Adapter's Role:
#    - Mistake: Implementing business logic inside the adapter.
#    - Fix: Keep the adapter focused only on translating interfaces.
#
# 2. Tight Coupling to the Adaptee:
#    - Mistake: Directly exposing Adaptee methods in the Adapter.
#    - Fix: Hide adaptee-specific logic from the client interface.
#
# 3. Violating Liskov Substitution Principle:
#    - Mistake: Making Adapter behave differently than Target.
#    - Fix: Ensure Adapter is substitutable for Target without side effects.
#
# 4. Ignoring Composition:
#    - Mistake: Using inheritance when composition is more appropriate.
#    - Fix: Favor composition over inheritance for more flexibility.

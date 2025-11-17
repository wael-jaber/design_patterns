from .decorator import Decorator


class ConcreteDecoratorB(Decorator):
    def operation(self) -> str:
        return f"ConcreteDecoratorB({super().operation()})"

# Example Usage:
# from concrete_component import ConcreteComponent
# from concrete_decorator_a import ConcreteDecoratorA
# from concrete_decorator_b import ConcreteDecoratorB
#
# component = ConcreteComponent()
# decorated = ConcreteDecoratorB(ConcreteDecoratorA(component))
# print(decorated.operation())
#
# # Expected Output:
# # ConcreteDecoratorB(ConcreteDecoratorA(ConcreteComponent))
#
# Common Mistakes to Avoid:
#
# 1. Skipping the Base Interface:
#    - Mistake: Not using a shared interface for components and decorators.
#    - Fix: Always derive decorators and components from a common abstract base
#      class.
#
# 2. Not Forwarding Calls:
#    - Mistake: Forgetting to delegate to the wrapped object.
#    - Fix: Always call `super().operation()` or equivalent inside your
#      decorators.
#
# 3. Overusing Decorators:
#    - Mistake: Nesting too many decorators can complicate debugging.
#    - Fix: Use layering when necessary, and document each decorator’s purpose.
#
# 4. Rigid Decorators:
#    - Mistake: Writing decorators that tightly couple to specific components.
#    - Fix: Use composition and interfaces to allow any component to be
#      decorated.

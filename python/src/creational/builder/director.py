from .builder import Builder


class Director:
    """
    Director: Defines the order in which steps are executed.
    """

    def __init__(self, builder: Builder):
        self.builder = builder

    def construct_minimal_product(self):
        """
        Constructs a minimal product with only part A.
        """
        self.builder.reset()
        self.builder.build_part_a()

    def construct_full_product(self):
        """
        Constructs a full product with both part A and part B.
        """
        self.builder.reset()
        self.builder.build_part_a()
        self.builder.build_part_b()

# Example Usage:
#
# from src.creational.builder.builder import ConcreteBuilder
# from src.creational.builder.director import Director
#
# builder = ConcreteBuilder()
# director = Director(builder)
#
# director.construct_full_product()
# product = builder.get_result()
#
# print(product.list_parts())  # Output: "Part A, Part B"
#
# Common Mistakes to Avoid:
#
# 1. Forgetting to Call `reset()`:
#    - Mistake: Not resetting the builder before constructing a new product.
#    - Fix: Always call `reset()` before starting a new build process.
#
# 2. Using Builder When Simple Instantiation Works:
#    - Mistake: Using Builder Pattern when the product can be created easily
#    via a constructor.
#    - Fix: Only use Builder when constructing the product is complex.
#
# 3. Tightly Coupling Director to Concrete Builders:
#    - Mistake: The Director should use the abstract `Builder` interface.
#    - Fix: Use dependency injection to allow different builders.

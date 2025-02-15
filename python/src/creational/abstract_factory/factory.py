from abc import ABC, abstractmethod
from .product import (
    AbstractProductA, AbstractProductB,
    ConcreteProductA1, ConcreteProductA2,
    ConcreteProductB1, ConcreteProductB2
)


class AbstractFactory(ABC):
    """
    Abstract Factory: Declares methods for creating abstract products.
    """

    @abstractmethod
    def create_product_a(self) -> AbstractProductA:
        pass

    @abstractmethod
    def create_product_b(self) -> AbstractProductB:
        pass


class ConcreteFactory1(AbstractFactory):
    """
    Concrete Factory 1: Creates products of Variant 1.
    """

    def create_product_a(self) -> AbstractProductA:
        return ConcreteProductA1()

    def create_product_b(self) -> AbstractProductB:
        return ConcreteProductB1()


class ConcreteFactory2(AbstractFactory):
    """
    Concrete Factory 2: Creates products of Variant 2.
    """

    def create_product_a(self) -> AbstractProductA:
        return ConcreteProductA2()

    def create_product_b(self) -> AbstractProductB:
        return ConcreteProductB2()


# Example Usage:
#
# from src.creational.abstract_factory.factory import ConcreteFactory1, ConcreteFactory2
#
# factory_1 = ConcreteFactory1()
# product_a1 = factory_1.create_product_a()
# product_b1 = factory_1.create_product_b()
#
# print(product_a1.operation_a())
# Output: "ConcreteProductA1 operation executed"
# print(product_b1.operation_b())
# Output: "ConcreteProductB1 operation executed"
#
# factory_2 = ConcreteFactory2()
# product_a2 = factory_2.create_product_a()
# product_b2 = factory_2.create_product_b()
#
# print(product_a2.operation_a())
# Output: "ConcreteProductA2 operation executed"
# print(product_b2.operation_b())
# Output: "ConcreteProductB2 operation executed"
#
# Common Mistakes to Avoid:
#
# 1. Forgetting to Implement All Methods in Concrete Factories:
#    - Mistake: Not implementing both `create_product_a`
#    and `create_product_b`.
#    - Fix: Ensure all abstract methods are implemented to
#    avoid runtime errors.
#
# 2. Using the Wrong Factory:
#    - Mistake: Instantiating the wrong factory when different
#    product variants are needed.
#    - Fix: Validate the correct factory before instantiating it.
#
# 3. Overengineering When Simple Factory Works:
#    - Mistake: Using Abstract Factory when a simple Factory
#    Method is sufficient.
#    - Fix: Only use Abstract Factory when multiple related
#    products must be created.

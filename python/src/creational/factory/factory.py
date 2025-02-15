from .product import Product, ConcreteProductA, ConcreteProductB
from .product_type import ProductType


class Factory:
    """
    Factory: Provides a method to create objects without
    specifying the exact class.
    """

    @staticmethod
    def create_product(product_type: ProductType) -> Product:
        """
        Factory Method: Returns an instance of a
        product based on the provided type.
        """
        if product_type == ProductType.PRODUCT_A:
            return ConcreteProductA()
        elif product_type == ProductType.PRODUCT_B:
            return ConcreteProductB()
        else:
            raise ValueError(f"Unknown product type: {product_type}")

# Example Usage:
#
# from src.creational.factory.factory import Factory
# from src.creational.factory.product_type import ProductType
#
# product_a = Factory.create_product(ProductType.PRODUCT_A)
# print(product_a.operation())  # Output: "ConcreteProductA operation executed"
#
# product_b = Factory.create_product(ProductType.PRODUCT_B)
# print(product_b.operation())  # Output: "ConcreteProductB operation executed"
#
# Common Mistakes to Avoid:
#
# 1. Hardcoding Class Names in Factory:
#    - Mistake: Using raw strings to determine product types.
#    - Fix: Use enums (`ProductType`) to avoid typos and
#    improve maintainability.
#
# 2. Allowing Factory to Grow Uncontrollably:
#    - Mistake: Adding too many `if-elif` conditions inside the factory.
#    - Fix: Use a registry pattern if new products need
#    to be added dynamically.
#
# 3. Misusing the Factory for Simple Object Creation:
#    - Mistake: Using the factory when simple instantiation
#    (`ConcreteProductA()`) is sufficient.
#    - Fix: Use Factory only when object creation logic is complex or varies.

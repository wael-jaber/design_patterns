from abc import ABC, abstractmethod
from .product import Product


class Builder(ABC):
    """
    Abstract Builder: Declares product creation steps.
    """

    @abstractmethod
    def reset(self):
        pass

    @abstractmethod
    def build_part_a(self):
        pass

    @abstractmethod
    def build_part_b(self):
        pass

    @abstractmethod
    def get_result(self) -> Product:
        pass


class ConcreteBuilder(Builder):
    """
    Concrete Builder: Implements the building steps.
    """

    def __init__(self):
        self.product = Product()

    def reset(self):
        self.product = Product()

    def build_part_a(self):
        self.product.add_part("Part A")

    def build_part_b(self):
        self.product.add_part("Part B")

    def get_result(self) -> Product:
        return self.product

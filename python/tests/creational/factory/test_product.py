import pytest
from src.creational.factory.product import ConcreteProductA, ConcreteProductB, Product


def test_concrete_product_a():
    """
    Test that ConcreteProductA executes the correct operation.
    """
    product = ConcreteProductA()
    # Ensure it implements the abstract Product class
    assert isinstance(product, Product)
    assert product.operation() == "ConcreteProductA operation executed"


def test_concrete_product_b():
    """
    Test that ConcreteProductB executes the correct operation.
    """
    product = ConcreteProductB()
    # Ensure it implements the abstract Product class
    assert isinstance(product, Product)
    assert product.operation() == "ConcreteProductB operation executed"

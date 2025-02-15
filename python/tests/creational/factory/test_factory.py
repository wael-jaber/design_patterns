import pytest
from src.creational.factory.factory import Factory
from src.creational.factory.product import ConcreteProductA, ConcreteProductB, Product
from src.creational.factory.product_type import ProductType


def test_factory_create_product_a():
    """
    Test that Factory correctly creates ConcreteProductA.
    """
    product = Factory.create_product(ProductType.PRODUCT_A)
    assert isinstance(product, ConcreteProductA)
    # Ensures it follows the Product interface
    assert isinstance(product, Product)
    assert product.operation() == "ConcreteProductA operation executed"


def test_factory_create_product_b():
    """
    Test that Factory correctly creates ConcreteProductB.
    """
    product = Factory.create_product(ProductType.PRODUCT_B)
    assert isinstance(product, ConcreteProductB)
    # Ensures it follows the Product interface
    assert isinstance(product, Product)
    assert product.operation() == "ConcreteProductB operation executed"


def test_factory_invalid_product():
    """
    Test that Factory raises an error when given an invalid ProductType.
    """
    with pytest.raises(ValueError, match="Unknown product type"):
        # Should raise ValueError
        Factory.create_product("invalid_product")

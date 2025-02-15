import pytest
from src.creational.abstract_factory.product import (
    AbstractProductA, AbstractProductB,
    ConcreteProductA1, ConcreteProductA2,
    ConcreteProductB1, ConcreteProductB2
)


@pytest.mark.parametrize("product_class, expected_output", [
    (ConcreteProductA1, "ConcreteProductA1 operation executed"),
    (ConcreteProductA2, "ConcreteProductA2 operation executed")
])
def test_concrete_product_a(product_class, expected_output):
    """
    Test that ConcreteProductA1 and ConcreteProductA2 execute
    the correct operation.
    """
    product = product_class()
    assert isinstance(product, AbstractProductA)
    assert product.operation_a() == expected_output


@pytest.mark.parametrize("product_class, expected_output", [
    (ConcreteProductB1, "ConcreteProductB1 operation executed"),
    (ConcreteProductB2, "ConcreteProductB2 operation executed")
])
def test_concrete_product_b(product_class, expected_output):
    """
    Test that ConcreteProductB1 and ConcreteProductB2 execute
    the correct operation.
    """
    product = product_class()
    assert isinstance(product, AbstractProductB)
    assert product.operation_b() == expected_output

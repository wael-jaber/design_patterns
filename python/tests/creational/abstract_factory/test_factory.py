import pytest
from src.creational.abstract_factory.factory import (
        ConcreteFactory1, ConcreteFactory2, AbstractFactory
        )
from src.creational.abstract_factory.product import (
        AbstractProductA, AbstractProductB
        )


@pytest.mark.parametrize("factory_class, expected_a, expected_b", [
    (ConcreteFactory1,
     "ConcreteProductA1 operation executed",
     "ConcreteProductB1 operation executed"),
    (ConcreteFactory2,
     "ConcreteProductA2 operation executed",
     "ConcreteProductB2 operation executed")
    ])
def test_concrete_factories(factory_class, expected_a, expected_b):
    """
    Test that ConcreteFactory1 and ConcreteFactory2 create
    the correct products.
    """
    factory = factory_class()

    product_a = factory.create_product_a()
    product_b = factory.create_product_b()

    assert isinstance(factory, AbstractFactory)
    assert isinstance(product_a, AbstractProductA)
    assert isinstance(product_b, AbstractProductB)

    assert product_a.operation_a() == expected_a
    assert product_b.operation_b() == expected_b

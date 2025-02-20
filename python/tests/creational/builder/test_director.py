from src.creational.builder.director import Director
from src.creational.builder.builder import ConcreteBuilder


def test_director_construct_minimal_product():
    """
    Test that the director correctly constructs a minimal product
    with only Part A.
    """
    builder = ConcreteBuilder()
    director = Director(builder)

    director.construct_minimal_product()
    product = builder.get_result()

    assert product.list_parts() == "Part A"


def test_director_construct_full_product():
    """
    Test that the director correctly constructs a full product
    with Part A and Part B.
    """
    builder = ConcreteBuilder()
    director = Director(builder)

    director.construct_full_product()
    product = builder.get_result()

    assert product.list_parts() == "Part A, Part B"

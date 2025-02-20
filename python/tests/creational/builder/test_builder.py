from src.creational.builder.builder import ConcreteBuilder
from src.creational.builder.product import Product


def test_concrete_builder_initialization():
    """
    Test that a ConcreteBuilder is initialized with an empty product.
    """
    builder = ConcreteBuilder()
    assert isinstance(builder.get_result(), Product)
    assert builder.get_result().list_parts() == ""


def test_concrete_builder_build_part_a():
    """
    Test that ConcreteBuilder correctly adds Part A.
    """
    builder = ConcreteBuilder()
    builder.build_part_a()
    product = builder.get_result()
    assert product.list_parts() == "Part A"


def test_concrete_builder_build_part_b():
    """
    Test that ConcreteBuilder correctly adds Part B.
    """
    builder = ConcreteBuilder()
    builder.build_part_b()
    product = builder.get_result()
    assert product.list_parts() == "Part B"


def test_concrete_builder_reset():
    """
    Test that calling reset() clears the product.
    """
    builder = ConcreteBuilder()
    builder.build_part_a()
    builder.reset()
    assert builder.get_result().list_parts() == ""

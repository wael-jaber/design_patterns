from src.creational.builder.product import Product


def test_product_initialization():
    """
    Test that a new product is initialized with an empty list.
    """
    product = Product()
    assert product.list_parts() == ""


def test_product_add_part():
    """
    Test that parts can be added to the product.
    """
    product = Product()
    product.add_part("Part A")
    assert product.list_parts() == "Part A"

    product.add_part("Part B")
    assert product.list_parts() == "Part A, Part B"

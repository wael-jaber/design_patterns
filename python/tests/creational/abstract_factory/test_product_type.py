from src.creational.abstract_factory.product_type import ProductType


def test_enum_values():
    """
    Test that the ProductType enum contains the correct values.
    """
    assert ProductType.VARIANT_1.value == "variant_1"
    assert ProductType.VARIANT_2.value == "variant_2"


def test_enum_members():
    """
    Test that the ProductType enum contains the correct members.
    """
    assert list(ProductType) == [ProductType.VARIANT_1, ProductType.VARIANT_2]

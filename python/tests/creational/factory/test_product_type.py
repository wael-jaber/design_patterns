from src.creational.factory.product_type import ProductType


def test_enum_values():
    """
    Test that the ProductType enum contains the correct values.
    """
    assert ProductType.PRODUCT_A.value == "product_a"
    assert ProductType.PRODUCT_B.value == "product_b"


def test_enum_members():
    """
    Test that the ProductType enum contains the correct members.
    """
    assert list(ProductType) == [ProductType.PRODUCT_A, ProductType.PRODUCT_B]

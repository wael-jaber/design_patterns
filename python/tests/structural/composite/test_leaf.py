from src.structural.composite.leaf import Leaf


def test_leaf_is_not_composite():
    """
    Test that Leaf should not be composite.
    """
    leaf = Leaf()
    assert not leaf.is_composite()


def test_leaf_operation():
    """
    Test That Leaf operation should return its default name.
    """
    leaf = Leaf()
    assert leaf.operation() == "Leaf"

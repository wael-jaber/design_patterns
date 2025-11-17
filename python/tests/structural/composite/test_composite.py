from src.structural.composite.composite import Composite
from src.structural.composite.leaf import Leaf


def test_composite_is_composite():
    """
    Test that Composite should be composite.
    """
    composite = Composite()
    assert composite.is_composite()


def test_composite_operation_with_leaves():
    """
    Test that Composite operation shoudl aggregate child operations.
    """
    composite = Composite()
    composite.add(Leaf())
    composite.add(Leaf())
    assert composite.operation() == "Branch(Leaf+Leaf)"


def test_composite_removal():
    """
    Test that Composite removes child correctly.
    """
    composite = Composite()
    leaf1 = Leaf()
    leaf2 = Leaf()
    composite.add(leaf1)
    composite.add(leaf2)
    composite.remove(leaf1)
    assert composite.operation() == "Branch(Leaf)"

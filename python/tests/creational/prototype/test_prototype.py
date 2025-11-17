from src.creational.prototype import ConcretePrototype


def test_clone_creates_deep_copy():
    """
    Test that the deep copy is create correctly
    """
    original = ConcretePrototype("Test", [1, 2, 3])
    clone = original.clone()

    assert clone is not original
    assert clone.name == original.name
    assert clone.data == original.data
    assert clone.data is not original.data  # Deep copy check


def test_changing_clone_does_not_affect_original():
    """
    Test that changes to clone dont affect the original
    """
    original = ConcretePrototype("Original", [1, 2, 3])
    clone = original.clone()

    clone.name = "Clone"
    clone.data.append(4)

    assert original.name == "Original"
    assert original.data == [1, 2, 3]
    assert clone.name == "Clone"
    assert clone.data == [1, 2, 3, 4]


def test_str_representation():
    """
    Test that the string representation is correct
    """
    prototype = ConcretePrototype("Sample", [10, 20])
    expected = "ConcretePrototype(name=Sample, data=[10, 20])"
    assert str(prototype) == expected

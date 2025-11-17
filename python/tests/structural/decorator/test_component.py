from src.structural.decorator.component import Component


def test_component_is_abstract():
    """
    Test that Component cannont be instantiated directly.
    """
    try:
        Component()
        assert False, "Component should be abstract and not instantiable"
    except TypeError:
        pass

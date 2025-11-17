from src.structural.adapter.adaptee import Adaptee


def test_specific_request():
    """
    Test the specific_request return the expected output
    """
    adaptee = Adaptee()
    assert adaptee.specific_request() == ".eetpadA eht fo roivaheb laicepS"

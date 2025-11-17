from src.structural.adapter.target import Target


def test_request():
    """
    Test for the target return the expected output.
    """
    target = Target()
    assert target.request() == "Target: The default target's behavior."

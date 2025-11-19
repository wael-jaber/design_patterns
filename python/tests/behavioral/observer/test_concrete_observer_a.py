from src.behavioral.observer.concrete_observer_a import ConcreteObserverA


def test_observer_a_updates_message():
    """
    Test that ConcreteObserverA updates its last_message attribute correctly
    when the update method is called.
    """
    observer = ConcreteObserverA()

    observer.update("hello world")

    assert observer.last_message == "Observer A received: hello world"

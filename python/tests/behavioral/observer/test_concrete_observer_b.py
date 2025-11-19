from src.behavioral.observer.concrete_observer_b import ConcreteObserverB


def test_observer_b_updates_message_uppercase():
    """
    Test that ConcreteObserverB updates its last_message attribute correctly
    when the update method is called, converting the message to uppercase.
    """
    observer = ConcreteObserverB()

    observer.update("hello world")

    assert observer.last_message == "Observer B processed: HELLO WORLD"

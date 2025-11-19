from src.behavioral.observer.concrete_subject import ConcreteSubject
from src.behavioral.observer.observer import Observer


class DummyObserver(Observer):
    def __init__(self):
        self.last_message = None

    def update(self, message: str) -> None:
        self.last_message = message


def test_attach_observer():
    """
    Test that an observer is notified when the subject's state changes.
    """
    subject = ConcreteSubject()
    observer = DummyObserver()

    subject.attach(observer)
    subject.set_state("ready")

    assert observer.last_message == "State changed to: ready"


def test_detach_observer():
    """
    Test that a detached observer does not receive notifications.
    """
    subject = ConcreteSubject()
    observer = DummyObserver()

    subject.attach(observer)
    subject.detach(observer)
    subject.set_state("running")

    # Must stay None because observer is detached
    assert observer.last_message is None


def test_subject_state_storage():
    """
    Test that the subject correctly stores and retrieves its state.
    """
    subject = ConcreteSubject()
    subject.set_state("active")

    assert subject.get_state() == "active"

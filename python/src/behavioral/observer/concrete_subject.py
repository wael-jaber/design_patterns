from .subject import Subject
from .observer import Observer
from typing import Optional


class ConcreteSubject(Subject):
    """
    Concrete Subject stores state of interest and sends notifications
    when its state changes.
    """

    def __init__(self):
        self._observers: list[Observer] = []
        self._state: str | None = None

    def attach(self, observer: Observer) -> None:
        if observer not in self._observers:
            self._observers.append(observer)

    def detach(self, observer: Observer) -> None:
        if observer in self._observers:
            self._observers.remove(observer)

    def notify(self, message: str) -> None:
        for observer in self._observers:
            observer.update(message)

    def set_state(self, new_state: str) -> None:
        self._state = new_state
        self.notify(f"State changed to: {new_state}")

    def get_state(self) -> Optional[str]:
        return self._state


# Example Usage
#
# from .concrete_subject import ConcreteSubject
# from .concrete_observer_a import ConcreteObserverA
# from .concrete_observer_b import ConcreteObserverB
#
# subject = ConcreteSubject()
#
# observer_a = ConcreteObserverA()
# observer_b = ConcreteObserverB()
#
# subject.attach(observer_a)
# subject.attach(observer_b)
#
# subject.set_state("running")
#
# print(observer_a.last_message)
# # Observer A received: State changed to: running
#
# print(observer_b.last_message)
# # Observer B processed: STATE CHANGED TO: RUNNING
#
#
# Notes:
# - Observers are notified immediately when subject state changes.
# - You can detach observers at any time using subject.detach(observer).
# - The subject does not need to know the concrete observer types.

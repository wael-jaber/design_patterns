from .observer import Observer


class ConcreteObserverA(Observer):
    """
    Concrete Observer A reacts to subject updates.
    """

    def __init__(self):
        self.last_message: str | None = None

    def update(self, message: str) -> None:
        self.last_message = f"Observer A received: {message}"

from .observer import Observer


class ConcreteObserverB(Observer):
    """
    Concrete Observer B reacts differently to updates.
    """

    def __init__(self):
        self.last_message: str | None = None

    def update(self, message: str) -> None:
        self.last_message = f"Observer B processed: {message.upper()}"

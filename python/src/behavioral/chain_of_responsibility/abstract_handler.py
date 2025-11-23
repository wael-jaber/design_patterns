from typing import Optional
from .handler import Handler


class AbstractHandler(Handler):
    """
    Base handler that stores the next handler in the chain.
    """

    def __init__(self):
        self._next_handler: Optional[Handler] = None

    def set_next(self, handler: Handler) -> Handler:
        self._next_handler = handler
        return handler  # Allows chaining

    def handle(self, request: str) -> Optional[str]:
        if self._next_handler:
            return self._next_handler.handle(request)
        return None

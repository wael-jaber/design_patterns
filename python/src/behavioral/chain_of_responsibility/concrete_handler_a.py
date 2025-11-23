from .abstract_handler import AbstractHandler


class ConcreteHandlerA(AbstractHandler):
    """
    Handles requests starting with 'A'.
    """

    def handle(self, request: str) -> str:
        if request.startswith("A"):
            return f"Handler A processed: {request}"
        return super().handle(request)

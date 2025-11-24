from .abstract_handler import AbstractHandler


class ConcreteHandlerB(AbstractHandler):
    """
    Handles requests starting with 'B'.
    """

    def handle(self, request: str) -> str:
        if request.startswith("B"):
            return f"Handler B processed: {request}"
        return super().handle(request)


# Example Usage:
#
# h1 = ConcreteHandlerA()
# h2 = ConcreteHandlerB()
# h1.set_next(h2)
#
# print(h1.handle("Apple"))   # Handler A processed: Apple
# print(h1.handle("Banana"))  # Handler B processed: Banana
# print(h1.handle("Cherry"))  # None
#
#
# Common Mistakes to Avoid:
#
# 1. Forgetting to forward to the next handler.
#    - Fix: When handler cannot process, call super().handle() or
#      next_handler.handle().
#
# 2. Hardcoding all logic into one handler.
#    - Fix: Each handler should handle only one specific type of request.
#
# 3. Returning errors instead of None for unhandled requests.
#    - Fix: Return None to indicate the chain did not process the request.

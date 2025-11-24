from .colleague import Colleague


class ConcreteColleagueB(Colleague):
    """
    Colleague B communicates through the mediator.
    """

    def do_action_b(self) -> str:
        if self._mediator:
            return self._mediator.notify(self, "B_ACTION")
        return "No mediator assigned."

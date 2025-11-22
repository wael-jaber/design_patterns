from .colleague import Colleague


class ConcreteColleagueA(Colleague):
    """
    Colleague A communicates through the mediator.
    """

    def do_action_a(self) -> str:
        if self._mediator:
            return self._mediator.notify(self, "A_ACTION")
        return "No mediator assigned."

from src.behavioral.mediator.concrete_colleague_a import ConcreteColleagueA
from src.behavioral.mediator.mediator import Mediator


class DummyMediator(Mediator):
    def notify(self, sender, event: str) -> str:
        return f"Received event {event} from A."


def test_colleague_a_calls_mediator():
    """
    Test that ConcreteColleagueA calls the mediator correctly.
    """
    mediator = DummyMediator()
    a = ConcreteColleagueA()
    a.set_mediator(mediator)

    result = a.do_action_a()

    assert result == "Received event A_ACTION from A."

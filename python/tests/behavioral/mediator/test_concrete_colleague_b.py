from src.behavioral.mediator.concrete_colleague_b import ConcreteColleagueB
from src.behavioral.mediator.mediator import Mediator


class DummyMediator(Mediator):
    def notify(self, sender, event: str) -> str:
        return f"Received event {event} from B."


def test_colleague_b_calls_mediator():
    """
    Test that ConcreteColleagueB calls the mediator correctly.
    """
    mediator = DummyMediator()
    b = ConcreteColleagueB()
    b.set_mediator(mediator)

    result = b.do_action_b()

    assert result == "Received event B_ACTION from B."

from src.behavioral.mediator.colleague import Colleague
from src.behavioral.mediator.mediator import Mediator


class DummyMediator(Mediator):
    def notify(self, sender, event: str) -> str:
        return "ok"


def test_colleague_can_set_mediator():
    """
    Test that a colleague can set its mediator.
    """
    mediator = DummyMediator()
    colleague = Colleague()

    colleague.set_mediator(mediator)

    assert colleague._mediator is mediator

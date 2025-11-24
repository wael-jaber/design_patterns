from src.behavioral.mediator.concrete_mediator import ConcreteMediator
from src.behavioral.mediator.concrete_colleague_a import ConcreteColleagueA
from src.behavioral.mediator.concrete_colleague_b import ConcreteColleagueB


def test_mediator_sets_itself_as_colleagues_mediator():
    a = ConcreteColleagueA()
    b = ConcreteColleagueB()
    mediator = ConcreteMediator(a, b)

    assert a._mediator is mediator
    assert b._mediator is mediator


def test_mediator_reacts_to_a_and_triggers_b():
    a = ConcreteColleagueA()
    b = ConcreteColleagueB()
    mediator = ConcreteMediator(a, b)

    result = a.do_action_a()

    assert result == (
        "Mediator reacts to A and triggers B. | "
        "Colleague B handling mediator request."
    )


def test_mediator_reacts_to_b_and_triggers_a():
    a = ConcreteColleagueA()
    b = ConcreteColleagueB()
    mediator = ConcreteMediator(a, b)

    result = b.do_action_b()

    assert result == (
        "Mediator reacts to B and triggers A. | "
        "Colleague A handling mediator request."
    )

from .mediator import Mediator
from .concrete_colleague_a import ConcreteColleagueA
from .concrete_colleague_b import ConcreteColleagueB


class ConcreteMediator(Mediator):
    """
    Concrete Mediator coordinates communication between colleagues.
    """

    def __init__(self,
                 colleague_a: ConcreteColleagueA,
                 colleague_b: ConcreteColleagueB):
        self.colleague_a = colleague_a
        self.colleague_b = colleague_b

        # Set mediator for colleagues
        self.colleague_a.set_mediator(self)
        self.colleague_b.set_mediator(self)

    def notify(self, sender: object, event: str) -> str:
        if event == "A_ACTION":
            return "Mediator reacts to A and triggers B." + \
                   " | " + self.colleague_b.do_action_b_handler()
        elif event == "B_ACTION":
            return "Mediator reacts to B and triggers A." + \
                   " | " + self.colleague_a.do_action_a_handler()
        return "Unknown event."


# Extend colleagues with handlers for mediator-triggered actions

def _colleague_a_handler(self) -> str:
    return "Colleague A handling mediator request."


def _colleague_b_handler(self) -> str:
    return "Colleague B handling mediator request."


ConcreteColleagueA.do_action_a_handler = _colleague_a_handler
ConcreteColleagueB.do_action_b_handler = _colleague_b_handler


# Example Usage:
#
# from concrete_colleague_a import ConcreteColleagueA
# from concrete_colleague_b import ConcreteColleagueB
# from concrete_mediator import ConcreteMediator
#
# a = ConcreteColleagueA()
# b = ConcreteColleagueB()
# mediator = ConcreteMediator(a, b)
#
# print(a.do_action_a())
# print(b.do_action_b())
#
# Output:
# Mediator reacts to A and triggers B. | Colleague B handling mediator request.
# Mediator reacts to B and triggers A. | Colleague A handling mediator request.
#
#
# Common Mistakes to Avoid:
#
# 1. Putting too much logic in colleagues instead of the mediator.
#    - Fix: The mediator should coordinate interactions.
#
# 2. Creating a God Object mediator.
#    - Fix: Keep it focused on communication, not business logic.
#
# 3. Directly coupling colleagues to each other.
#    - Fix: All communication should go through the mediator.

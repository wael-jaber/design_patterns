from abc import ABC
from typing import Optional
from .mediator import Mediator


class Colleague(ABC):
    """
    Base class for colleagues communicating via a Mediator.
    """

    def __init__(self, mediator: Optional[Mediator] = None):
        self._mediator = mediator

    def set_mediator(self, mediator: Mediator) -> None:
        self._mediator = mediator

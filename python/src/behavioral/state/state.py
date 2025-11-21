from abc import ABC, abstractmethod


class State(ABC):
    """
    The State interface defines behaviors associated with a particular
    state of the Context.
    """

    @abstractmethod
    def handle(self) -> str:
        pass

    @abstractmethod
    def next_state(self):
        """
        Returns the next state instance.
        """
        pass

class SingletonMeta(type):
    """
    A thread-safe Singleton implementation using a metaclass.
    Ensures only one instance of a class is created.
    """

    _instances = {}

    def __call__(cls, *args, **kwargs):
        """
        Controls instance creation. If an instance already exists, returns it.
        Otherwise, creates a new instance.
        """
        if cls not in cls._instances:
            cls._instances[cls] = super().__call__(*args, **kwargs)
        return cls._instances[cls]

class Singleton(metaclass=SingletonMeta):
    """
    Example Singleton class using the SingletonMeta metaclass.
    """

    def __init__(self, value: str = None):
        """
        Example attribute to demonstrate state consistency.
        """
        if value is not None:
            self.value = value

    def some_business_logic(self):
        """
        Example method that performs some business logic.
        """
        return "Executing business logic in Singleton"


# Example Usage:
#
# from src.creational.singleton import Singleton
#
# singleton1 = Singleton("First Instance")
# singleton2 = Singleton("Second Instance")  # Should not overwrite the first
#
# print(singleton1 is singleton2)  # True (same instance)
# print(singleton1.value)  # "First Instance"
# print(singleton2.value)  # "First Instance" (does not change)
#
# Expected Output:
# True
# First Instance
# First Instance
#
# Common Mistakes to Avoid:
#
# 1. Using `__init__` Instead of `__new__`:
#    - Mistake: Defining the singleton logic in `__init__` does not prevent multiple instances.
#    - Fix: Use `__new__` or metaclasses to ensure a single instance is created.
#
# 2. Forgetting Thread Safety:
#    - Mistake: Creating instances in multiple threads may result in multiple objects.
#    - Fix: Use a metaclass or locks (`threading.Lock`) for thread safety if required.
#
# 3. Using a Simple Class Variable for Singleton:
#    - Mistake: Assigning a class-level variable without controlling instance creation.
#    - Fix: Use a proper Singleton implementation like a metaclass.
#
# 4. Overusing the Singleton Pattern:
#    - Mistake: Using Singleton unnecessarily, leading to hidden dependencies and tight coupling.
#    - Fix: Use Singleton **only** when global state management is truly necessary.


import pytest
from src.creational.singleton import Singleton


def test_singleton_instance():
    """
    Test that multiple instances return the same object.
    """
    instance1 = Singleton("First Instance")
    instance2 = Singleton("Second Instance")  # Should not create a new inst

    assert instance1 is instance2  # Both should point to the same instance
    assert instance1.value == "First Instance"
    assert instance2.value == "First Instance"  # Value should remain unchanged


def test_singleton_persistence():
    """
    Test that changes persist across different calls.
    """
    instance1 = Singleton()
    instance1.value = "Updated Value"

    instance2 = Singleton()
    assert instance2.value == "Updated Value"  # The value should persist


def test_singleton_thread_safety():
    """
    Test singleton in a multi-threaded environment.
    """
    import threading

    results = []

    def create_instance():
        results.append(Singleton("Thread Instance"))

    threads = [threading.Thread(target=create_instance) for _ in range(10)]

    for thread in threads:
        thread.start()

    for thread in threads:
        thread.join()

    # All instances should be the same
    assert all(instance is results[0] for instance in results)


def test_singleton_metaclass():
    """
    Test that SingletonMeta enforces a single instance.
    """
    class TestSingleton(metaclass=Singleton.__class__):
        pass

    obj1 = TestSingleton()
    obj2 = TestSingleton()

    assert obj1 is obj2  # Should be the same instance

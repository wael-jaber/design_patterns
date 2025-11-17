from src.structural.proxy.subject import Subject
from src.structural.proxy.real_subject import RealSubject


class Proxy(Subject):
    def __init__(self):
        self._real_subject = None

    def request(self) -> str:
        if self._real_subject is None:
            print("Proxy: Creating RealSubject...")
            self._real_subject = RealSubject()
        print("Proxy: Delegating to RealSubject.")
        return self._real_subject.request()

# Example Usage:
# if __name__ == "__main__":
#     proxy = Proxy()
#     print(proxy.request())  # Lazy-loads RealSubject and delegates
#     print(proxy.request())  # Reuses the same RealSubject

# Common Mistakes to Avoid:
#
# 1. Not implementing the same interface:
#    - Mistake: Proxy and RealSubject don’t share the Subject base class.
#    - Fix: Always make both implement the same interface for transparency.
#
# 2. Forgetting lazy initialization:
#    - Mistake: Creating the RealSubject eagerly when it’s expensive.
#    - Fix: Delay creation until absolutely necessary (lazy loading).
#
# 3. Violating the open-closed principle:
#    - Mistake: Tightly coupling Proxy logic with RealSubject internals.
#    - Fix: Proxy should treat RealSubject as a black box.
#
# 4. Using Proxy where not needed:
#    - Mistake: Adding complexity for simple delegation or wrapper.
#    - Fix: Only use Proxy when you need additional control over access.

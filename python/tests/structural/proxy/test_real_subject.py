from src.structural.proxy.real_subject import RealSubject


def test_real_subject_request():
    """
    Test that the RealSubject handle the request.
    """
    subject = RealSubject()
    assert subject.request() == "RealSubject: Handling request."

# Common Mistakes to Avoid:
#
# 1. Not asserting the return type:
#    - Mistake: Only printing outputs without assertion.
#    - Fix: Always assert expected string values for clarity.
#
# 2. Skipping tests on real subject:
#    - Mistake: Only testing the proxy and forgetting the real subject
#      behavior.
#    - Fix: Include isolated tests for the real implementation to ensure
#      correctness.

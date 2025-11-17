import io
import sys
from src.structural.proxy.proxy import Proxy


def test_proxy_lazy_initialization_and_request(monkeypatch):
    """
    Test that Proxy lazily initializes RealSubject and delegates requests
    correctly.
    """
    proxy = Proxy()

    # Capture printed output
    captured_output = io.StringIO()
    sys.stdout = captured_output

    result1 = proxy.request()
    result2 = proxy.request()

    sys.stdout = sys.__stdout__  # Restore original stdout

    output = captured_output.getvalue().strip().splitlines()

    assert result1 == "RealSubject: Handling request."
    assert result2 == "RealSubject: Handling request."

    # Check initialization message appears only once
    init_msgs = [line for line in output if "Creating RealSubject" in line]
    assert len(init_msgs) == 1

    # Ensure both lines include delegation
    delegate_msgs = (
            [line for line in output if "Delegating to RealSubject" in line]
            )
    assert len(delegate_msgs) == 2

# Common Mistakes to Avoid:
#
# 1. Not verifying lazy instantiation:
#    - Mistake: Not checking whether RealSubject is created only once.
#    - Fix: Capture stdout or track state to confirm lazy behavior.
#
# 2. Not asserting intermediate steps:
#    - Mistake: Only checking return value without verifying proxy actions.
#    - Fix: Validate both printed logs and returned data.

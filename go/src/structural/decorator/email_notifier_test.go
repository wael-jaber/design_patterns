package decorator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/decorator"
)

// TestEmailNotifier verifies that EmailNotifier sends the correct message.
func TestEmailNotifier(t *testing.T) {
	n := decorator.NewEmailNotifier("user@test.com")
	result := n.Send("Hello")

	expected := "Email to user@test.com: Hello"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}


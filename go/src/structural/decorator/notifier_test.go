package decorator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/decorator"
)

// TestNotifierInterface ensures that EmailNotifier implements the Notifier
// interface.
func TestNotifierInterface(t *testing.T) {
	var n decorator.Notifier = decorator.NewEmailNotifier("a@b.com")
	if n == nil {
		t.Errorf("Notifier interface must be assignable from concrete type")
	}
}

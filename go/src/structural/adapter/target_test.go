package adapter_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/adapter"
)

// TestTargetInterface ensures that Adapter implements the Target interface.
func TestTargetInterface(t *testing.T) {
	var target adapter.Target = adapter.NewAdapter(adapter.Adaptee{})
	if target == nil {
		t.Errorf("expected non-nil Target implementation")
	}
}

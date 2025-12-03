package adapter_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/adapter"
)

// TestAdapterRequest verifies that Adapter correctly translates the Request 
// call to Adaptee.
func TestAdapterRequest(t *testing.T) {
	adaptee := adapter.Adaptee{}
	target := adapter.NewAdapter(adaptee) // returns Target

	result := target.Request()
	expected := "Adapter: translated -> Adaptee: specific behavior"

	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}

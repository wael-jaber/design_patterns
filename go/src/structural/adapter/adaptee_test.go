package adapter_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/adapter"
)

// TestAdapteeSpecificRequest verifies that Adaptee's SpecificRequest method
// returns the expected output.
func TestAdapteeSpecificRequest(t *testing.T) {
	a := adapter.Adaptee{}
	result := a.SpecificRequest()

	if result != "Adaptee: specific behavior" {
		t.Errorf("unexpected output: %s", result)
	}
}


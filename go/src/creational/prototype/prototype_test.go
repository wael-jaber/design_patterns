package prototype_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/prototype"
)

// TestPrototypeInterface tests that File implements the Prototype interface.
func TestPrototypeInterface(t *testing.T) {
	var p prototype.Prototype = &prototype.File{Name: "x"}
	if p == nil {
		t.Errorf("expected interface assignment to succeed")
	}
}

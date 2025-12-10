package composite_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/composite"
)

// TestNodeInterface ensures that both File and Folder implement the Node 
// interface.
func TestNodeInterface(t *testing.T) {
	var n composite.Node = composite.NewFile("test", 10)
	if n == nil {
		t.Errorf("expected Node interface to hold a File instance")
	}
}


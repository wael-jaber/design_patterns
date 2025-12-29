package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestShapeInterface ensures that Circle implements the Shape interface.
func TestShapeInterface(t *testing.T) {
	r := bridge.VectorRenderer{}
	var s bridge.Shape = bridge.NewCircle(r, 1)

	if s == nil {
		t.Errorf("expected Shape to be assignable")
	}
}

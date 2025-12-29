package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestRendererInterface ensures that VectorRenderer implements the Renderer
// interface.
func TestRendererInterface(t *testing.T) {
	var r bridge.Renderer = bridge.VectorRenderer{}
	if r == nil {
		t.Errorf("expected Renderer to be assignable")
	}
}

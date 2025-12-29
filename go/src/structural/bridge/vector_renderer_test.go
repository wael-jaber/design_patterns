package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestVectorRenderer tests the RenderShape method of VectorRenderer.
func TestVectorRenderer(t *testing.T) {
	r := bridge.VectorRenderer{}
	got := r.RenderShape("circle")
	want := "VectorRenderer: rendering circle"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}


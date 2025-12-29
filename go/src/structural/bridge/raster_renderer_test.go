package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestRasterRenderer tests the RenderShape method of RasterRenderer.
func TestRasterRenderer(t *testing.T) {
	r := bridge.RasterRenderer{}
	got := r.RenderShape("square")
	want := "RasterRenderer: rendering square"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}

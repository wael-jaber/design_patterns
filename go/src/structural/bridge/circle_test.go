package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestCircleDraw tests the Draw method of the Circle shape using
// VectorRenderer.
func TestCircleDraw(t *testing.T) {
	r := bridge.VectorRenderer{}
	c := bridge.NewCircle(r, 10)

	got := c.Draw()
	want := "VectorRenderer: rendering circle (circle, radius=10)"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}

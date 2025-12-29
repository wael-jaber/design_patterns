package bridge_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/bridge"
)

// TestSquareDraw tests the Draw method of the Square shape with
// RasterRenderer.
func TestSquareDraw(t *testing.T) {
	r := bridge.RasterRenderer{}
	s := bridge.NewSquare(r, 5)

	got := s.Draw()
	want := "RasterRenderer: rendering square (square, side=5)"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}

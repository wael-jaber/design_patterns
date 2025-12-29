package facade_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/facade"
)

// TestProjector tests the Projector subsystem.
func TestProjector(t *testing.T) {
	p := &facade.Projector{}

	if p.On() != "Projector: ON" {
		t.Errorf("projector ON failed")
	}
	if p.Off() != "Projector: OFF" {
		t.Errorf("projector OFF failed")
	}
}

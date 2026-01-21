package facade_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/facade"
)

// TestHomeTheaterFacade tests the HomeTheaterFacade.
func TestHomeTheaterFacade(t *testing.T) {
	amp := &facade.Amplifier{}
	dvd := &facade.DVDPlayer{}
	projector := &facade.Projector{}

	f := facade.NewHomeTheaterFacade(amp, dvd, projector)

	actions := f.WatchMovie("Inception")
	if len(actions) != 4 {
		t.Errorf("WatchMovie expected 4 actions, got %d", len(actions))
	}

	end := f.EndMovie()
	if len(end) != 3 {
		t.Errorf("EndMovie expected 3 actions, got %d", len(end))
	}
}

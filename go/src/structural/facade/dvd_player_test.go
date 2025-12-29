package facade_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/facade"
)

// TestDVDPlayer tests the DVDPlayer subsystem.
func TestDVDPlayer(t *testing.T) {
	d := &facade.DVDPlayer{}

	r := d.Play()
	if r != "DVDPlayer: no disc inserted" {
		t.Errorf("expected no disc message, got %s", r)
	}

	insert := d.InsertDisc("Inception")
	if insert != "DVDPlayer: inserted Inception" {
		t.Errorf("unexpected insert result %s", insert)
	}

	if d.Play() != "DVDPlayer: playing Inception" {
		t.Errorf("unexpected play result")
	}
}

package facade_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/facade"
)

// TestAmplifier tests the Amplifier subsystem.
func TestAmplifier(t *testing.T) {
	a := &facade.Amplifier{}

	if a.On() != "Amplifier: ON" {
		t.Errorf("Amplifier did not turn ON")
	}
	if a.Off() != "Amplifier: OFF" {
		t.Errorf("Amplifier did not turn OFF")
	}
}

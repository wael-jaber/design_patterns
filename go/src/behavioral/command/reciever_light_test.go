package command_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/command"
)

// TestLightOnOff tests the TurnOn and TurnOff methods of the Light receiver.
func TestLightOnOff(t *testing.T) {
	l := command.NewLight()

	if l.IsOn() {
		t.Errorf("expected light to be off initially")
	}

	if l.TurnOn() != "Light: ON" {
		t.Errorf("unexpected TurnOn output")
	}
	if !l.IsOn() {
		t.Errorf("expected light to be on")
	}

	if l.TurnOff() != "Light: OFF" {
		t.Errorf("unexpected TurnOff output")
	}
	if l.IsOn() {
		t.Errorf("expected light to be off")
	}
}

package command_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/command"
)

// TestTurnOffCommandExecuteAndUndo tests the Execute and Undo methods of the
// TurnOffCommand.
func TestTurnOffCommandExecuteAndUndo(t *testing.T) {
	light := command.NewLight()
	light.TurnOn()

	c := command.NewTurnOffCommand(light)

	if c.Execute() != "Light: OFF" {
		t.Errorf("expected Light OFF")
	}
	if light.IsOn() {
		t.Errorf("expected light to be off")
	}

	if c.Undo() != "Light: ON" {
		t.Errorf("expected Light ON on undo")
	}
	if !light.IsOn() {
		t.Errorf("expected light to be on after undo")
	}
}

package command_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/command"
)

// TestTurnOnCommandExecuteAndUndo tests the Execute and Undo methods of the
// TurnOnCommand.
func TestTurnOnCommandExecuteAndUndo(t *testing.T) {
	light := command.NewLight()
	c := command.NewTurnOnCommand(light)

	if c.Execute() != "Light: ON" {
		t.Errorf("expected Light ON")
	}
	if !light.IsOn() {
		t.Errorf("expected light to be on")
	}

	if c.Undo() != "Light: OFF" {
		t.Errorf("expected Light OFF on undo")
	}
	if light.IsOn() {
		t.Errorf("expected light to be off after undo")
	}
}

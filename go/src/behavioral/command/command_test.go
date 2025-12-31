package command_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/command"
)

// TestCommandInterfaceAssignment ensures that TurnOnCommand implements
// the Command interface.
func TestCommandInterfaceAssignment(t *testing.T) {
	light := command.NewLight()
	var c command.Command = command.NewTurnOnCommand(light)

	if c == nil {
		t.Errorf("expected Command interface to be assignable")
	}
}

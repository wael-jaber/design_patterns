package command_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/command"
)

// TestRemoteControlPressButtonRequiresCommand tests that pressing a button
// on the remote control without setting a command returns an error.
func TestRemoteControlPressButtonRequiresCommand(t *testing.T) {
	remote := command.NewRemoteControl()

	_, err := remote.PressButton()
	if err == nil {
		t.Fatalf("expected error when no command is set")
	}
}

// TestRemoteControlExecuteAndUndo tests executing commands via the remote
// control and then undoing the last command.
func TestRemoteControlExecuteAndUndo(t *testing.T) {
	light := command.NewLight()
	on := command.NewTurnOnCommand(light)
	off := command.NewTurnOffCommand(light)

	remote := command.NewRemoteControl()

	remote.SetCommand(on)
	out, err := remote.PressButton()
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
	if out != "Light: ON" {
		t.Fatalf("unexpected output: %s", out)
	}

	remote.SetCommand(off)
	out, err = remote.PressButton()
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
	if out != "Light: OFF" {
		t.Fatalf("unexpected output: %s", out)
	}

	undo, err := remote.PressUndo()
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
	if undo != "Light: ON" {
		t.Fatalf("unexpected undo output: %s", undo)
	}
}

// TestRemoteControlUndoEmptyHistory tests that pressing undo on the remote
// control when there is no history returns an error.
func TestRemoteControlUndoEmptyHistory(t *testing.T) {
	remote := command.NewRemoteControl()

	_, err := remote.PressUndo()
	if err == nil {
		t.Fatalf("expected error when undo history is empty")
	}
}

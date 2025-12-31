package command

import "fmt"

type RemoteControl struct {
	command Command
	history []Command
}

func NewRemoteControl() *RemoteControl {
	return &RemoteControl{history: []Command{}}
}

func (r *RemoteControl) SetCommand(c Command) {
	r.command = c
}

func (r *RemoteControl) PressButton() (string, error) {
	if r.command == nil {
		return "", fmt.Errorf("no command set")
	}

	r.history = append(r.history, r.command)
	return r.command.Execute(), nil
}

func (r *RemoteControl) PressUndo() (string, error) {
	if len(r.history) == 0 {
		return "", fmt.Errorf("nothing to undo")
	}

	last := r.history[len(r.history)-1]
	r.history = r.history[:len(r.history)-1]
	return last.Undo(), nil
}

// Example Usage:
//
//  light := command.NewLight()
//  on := command.NewTurnOnCommand(light)
//  off := command.NewTurnOffCommand(light)
//
//  remote := command.NewRemoteControl()
//
//  remote.SetCommand(on)
//  remote.PressButton() // Light: ON
//
//  remote.SetCommand(off)
//  remote.PressButton() // Light: OFF
//
//  remote.PressUndo()   // Light: ON
//
// Common Mistakes & Pitfalls:
//
// 1. Coupling invoker directly to receiver methods.
//    - Fix: invoker depends on Command interface.
//
// 2. Not storing history (cannot undo).
//    - Fix: keep command history in invoker.
//
// 3. Commands without receiver reference.
//    - Fix: command must reference receiver to perform action.
//
// 4. Trying to over-engineer commands with inheritance.
//    - Fix: use interfaces + structs.


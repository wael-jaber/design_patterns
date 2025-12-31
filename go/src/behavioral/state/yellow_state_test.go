package state_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/state"
)

// TestStateInterfaceAssignment ensures that RedState implements
// the State interface.
func TestYellowStateNext(t *testing.T) {
	tl, _ := state.NewTrafficLight(state.YellowState{})

	state.YellowState{}.Next(tl)

	if tl.StateName() != "RED" {
		t.Fatalf("expected RED, got %s", tl.StateName())
	}
}

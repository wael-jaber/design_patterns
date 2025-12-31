package state_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/state"
)

// TestStateInterfaceAssignment ensures that RedState implements
// the State interface.
func TestStateInterfaceAssignment(t *testing.T) {
	var s state.State = state.RedState{}
	if s == nil {
		t.Errorf("expected State interface to be assignable")
	}
}

package state_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/state"
)

// TestRedStateNext tests the Next method of RedState.
func TestRedStateNext(t *testing.T) {
	tl, _ := state.NewTrafficLight(state.RedState{})

	state.RedState{}.Next(tl)

	if tl.StateName() != "GREEN" {
		t.Fatalf("expected GREEN, got %s", tl.StateName())
	}
}

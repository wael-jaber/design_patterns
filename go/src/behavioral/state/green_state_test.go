package state_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/state"
)

// TestGreenStateNext tests the Next method of GreenState.
func TestGreenStateNext(t *testing.T) {
	tl, _ := state.NewTrafficLight(state.GreenState{})

	state.GreenState{}.Next(tl)

	if tl.StateName() != "YELLOW" {
		t.Fatalf("expected YELLOW, got %s", tl.StateName())
	}
}

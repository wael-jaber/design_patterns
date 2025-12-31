package state_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/state"
)

// TestNewTrafficLightRequiresInitialState tests that creating a TrafficLight
// without an initial state returns an error.
func TestNewTrafficLightRequiresInitialState(t *testing.T) {
	_, err := state.NewTrafficLight(nil)
	if err == nil {
		t.Fatalf("expected error when initial state is nil")
	}
}

// TestTrafficLightTransitions tests the full cycle of traffic light state
// transitions.
func TestTrafficLightTransitions(t *testing.T) {
	tl, err := state.NewTrafficLight(state.RedState{})
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}

	if tl.StateName() != "RED" {
		t.Fatalf("expected RED, got %s", tl.StateName())
	}

	tl.Next()
	if tl.StateName() != "GREEN" {
		t.Fatalf("expected GREEN, got %s", tl.StateName())
	}

	tl.Next()
	if tl.StateName() != "YELLOW" {
		t.Fatalf("expected YELLOW, got %s", tl.StateName())
	}

	tl.Next()
	if tl.StateName() != "RED" {
		t.Fatalf("expected RED, got %s", tl.StateName())
	}
}

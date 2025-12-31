package mediator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/mediator"
)

// TestMediatorInterfaceAssignment ensures that ChatMediator implements the
// Mediator interface.
func TestMediatorInterfaceAssignment(t *testing.T) {
	var m mediator.Mediator = mediator.NewChatMediator()
	if m == nil {
		t.Fatalf("expected Mediator to be assignable")
	}
}

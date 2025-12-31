package mediator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/mediator"
)

// TestColleagueInterfaceAssignment ensures that User implements the
// Colleague interface.
func TestColleagueInterfaceAssignment(t *testing.T) {
	m := mediator.NewChatMediator()
	var c mediator.Colleague = mediator.NewUser("u", m)
	if c == nil {
		t.Fatalf("expected Colleague to be assignable")
	}
}

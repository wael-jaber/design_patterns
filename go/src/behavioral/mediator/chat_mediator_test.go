package mediator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/mediator"
)

// TestChatMediatorDeliversMessages ensures that messages sent by one user
// are received by other users via the ChatMediator.
func TestChatMediatorDeliversMessages(t *testing.T) {
	m := mediator.NewChatMediator()

	a := mediator.NewUser("a", m)
	b := mediator.NewUser("b", m)

	a.Send("hi")

	if b.LastSeen() != "hi" {
		t.Fatalf("expected b to receive message, got %s", b.LastSeen())
	}
}

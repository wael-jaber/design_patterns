package mediator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/mediator"
)

// TestUserDoesNotReceiveOwnMessage ensures that a User does not receive
// their own messages.
func TestUserDoesNotReceiveOwnMessage(t *testing.T) {
	m := mediator.NewChatMediator()
	u := mediator.NewUser("u", m)

	u.Send("self")

	if u.LastSeen() != "" {
		t.Fatalf("expected user not to receive own message")
	}
}

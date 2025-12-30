package observer_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/observer"
)

// TestConcreteSubjectSetGetState tests setting and getting state
// in ConcreteSubject.
func TestConcreteSubjectSetAndGetState(t *testing.T) {
	s := observer.NewConcreteSubject()
	s.SetState("READY")

	if s.GetState() != "READY" {
		t.Errorf("expected state READY, got %s", s.GetState())
	}
}

// TestConcreteSubjectAttachDetach tests attaching and detaching observers
// to/from ConcreteSubject and ensures they receive updates accordingly.
func TestConcreteSubjectAttachDetach(t *testing.T) {
	s := observer.NewConcreteSubject()
	a := observer.NewConcreteObserverA("a")

	s.Attach(a)
	s.SetState("X")
	if a.LastSeen() != "A received: X" {
		t.Errorf("expected observer to receive update, got %s", a.LastSeen())
	}

	s.Detach("a")
	s.SetState("Y")
	if a.LastSeen() != "A received: X" {
		t.Errorf("expected observer to not receive update after detach, got %s", a.LastSeen())
	}
}


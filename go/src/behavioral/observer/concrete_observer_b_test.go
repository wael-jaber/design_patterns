package observer_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/observer"
)

// TestConcreteObserverBUpdate tests the Update method of ConcreteObserverB.
func TestConcreteObserverBUpdate(t *testing.T) {
	o := observer.NewConcreteObserverB("b")
	o.Update("STATE")

	if o.LastSeen() != "B received: STATE" {
		t.Errorf("unexpected last seen: %s", o.LastSeen())
	}
}


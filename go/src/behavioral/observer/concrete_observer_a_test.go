package observer_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/observer"
)

// TestConcreteObserverAUpdate tests the Update method of ConcreteObserverA.
func TestConcreteObserverAUpdate(t *testing.T) {
	o := observer.NewConcreteObserverA("a")
	o.Update("STATE")

	if o.LastSeen() != "A received: STATE" {
		t.Errorf("unexpected last seen: %s", o.LastSeen())
	}
}

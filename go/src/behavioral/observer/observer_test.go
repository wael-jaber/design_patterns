package observer_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/observer"
)

// TestObserverInterfaceAssignment ensures that ConcreteObserverA implements
// the Observer interface.
func TestObserverInterfaceAssignment(t *testing.T) {
	var o observer.Observer = observer.NewConcreteObserverA("a")
	if o == nil {
		t.Errorf("expected Observer interface to be assignable")
	}
}

package observer_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/observer"
)

// TestSubjectInterfaceAssignment ensures that ConcreteSubject implements
// the Subject interface.
func TestSubjectInterfaceAssignment(t *testing.T) {
	var s observer.Subject = observer.NewConcreteSubject()
	if s == nil {
		t.Errorf("expected Subject interface to be assignable")
	}
}

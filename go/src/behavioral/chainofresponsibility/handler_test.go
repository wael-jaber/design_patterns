package chainofresponsibility_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/chainofresponsibility"
)

// TestHandlerInterfaceAssignment verifies that Level1Support implements the
// Handler interface.
func TestHandlerInterfaceAssignment(t *testing.T) {
	var h chainofresponsibility.Handler = chainofresponsibility.NewLevel1Support()
	if h == nil {
		t.Fatalf("expected Handler to be assignable")
	}
}

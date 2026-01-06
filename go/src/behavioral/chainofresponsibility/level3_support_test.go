package chainofresponsibility_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/chainofresponsibility"
)

// TestLevel3HandlesHigh verifies that Level3Support handles requests with
// severity "high".
func TestLevel3HandlesHigh(t *testing.T) {
	l3 := chainofresponsibility.NewLevel3Support()

	res := l3.Handle(chainofresponsibility.Request{Severity: "high", Message: "Database down"})
	want := "Level3 handled: Database down"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

// TestNotHandledWhenChainEnds verifies that when a request reaches the end
// of the chain without being handled, an appropriate message is returned.
func TestNotHandledWhenChainEnds(t *testing.T) {
	l1 := chainofresponsibility.NewLevel1Support()

	res := l1.Handle(chainofresponsibility.Request{Severity: "unknown", Message: "???"})
	want := "Request not handled: ???"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

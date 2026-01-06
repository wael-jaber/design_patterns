package chainofresponsibility_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/chainofresponsibility"
)

// TestLevel1HandlesLow verifies that Level1Support handles requests with
// severity "low".
func TestLevel1HandlesLow(t *testing.T) {
	l1 := chainofresponsibility.NewLevel1Support()

	res := l1.Handle(chainofresponsibility.Request{Severity: "low", Message: "Reset password"})
	want := "Level1 handled: Reset password"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

// TestLevel1ForwardsWhenNotLow verifies that Level1Support forwards requests
// with severity other than "low" to the next handler in the chain.
func TestLevel1ForwardsWhenNotLow(t *testing.T) {
	l1 := chainofresponsibility.NewLevel1Support()
	l2 := chainofresponsibility.NewLevel2Support()
	l1.SetNext(l2)

	res := l1.Handle(chainofresponsibility.Request{Severity: "medium", Message: "Investigate latency"})
	want := "Level2 handled: Investigate latency"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

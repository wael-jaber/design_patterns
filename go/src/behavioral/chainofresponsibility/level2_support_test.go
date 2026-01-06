package chainofresponsibility_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/chainofresponsibility"
)

// TestLevel2HandlesMedium verifies that Level2Support handles requests with
// severity "medium".
func TestLevel2HandlesMedium(t *testing.T) {
	l2 := chainofresponsibility.NewLevel2Support()

	res := l2.Handle(chainofresponsibility.Request{Severity: "medium", Message: "Service slow"})
	want := "Level2 handled: Service slow"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

// TestLevel2ForwardsWhenNotMedium verifies that Level2Support forwards requests
// with severity other than "medium" to the next handler in the chain.
func TestLevel2ForwardsWhenNotMedium(t *testing.T) {
	l1 := chainofresponsibility.NewLevel1Support()
	l2 := chainofresponsibility.NewLevel2Support()
	l3 := chainofresponsibility.NewLevel3Support()
	l1.SetNext(l2).SetNext(l3)

	res := l1.Handle(chainofresponsibility.Request{Severity: "high", Message: "Outage"})
	want := "Level3 handled: Outage"

	if res != want {
		t.Fatalf("expected %q, got %q", want, res)
	}
}

package chainofresponsibility_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/chainofresponsibility"
)

// TestRequestFields verifies that the Request struct has the correct fields.
func TestRequestFields(t *testing.T) {
	r := chainofresponsibility.Request{Severity: "low", Message: "hello"}
	if r.Severity != "low" || r.Message != "hello" {
		t.Fatalf("unexpected request: %+v", r)
	}
}

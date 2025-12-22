package proxy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/proxy"
)

// TestServiceInterfaceAssignment ensures that RealService implements the
// Service interface.
func TestServiceInterfaceAssignment(t *testing.T) {
	var s proxy.Service = proxy.RealService{}
	if s == nil {
		t.Errorf("expected Service interface to hold RealService")
	}
}


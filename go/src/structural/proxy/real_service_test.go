package proxy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/proxy"
)

// TestRealServiceExecute verifies that the RealService's Execute method
// returns the expected result.
func TestRealServiceExecute(t *testing.T) {
	s := proxy.RealService{}
	result := s.Execute("user")

	expected := "RealService: executing request for user"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}

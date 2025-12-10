package proxy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/proxy"
)

// TestProxyAllowsAuthorizedUser verifies that the ProxyService allows access
// to users in the authorized list.
func TestProxyAllowsAuthorizedUser(t *testing.T) {
	p := proxy.NewProxyService([]string{"admin"})
	result := p.Execute("admin")

	expected := "ProxyService: access granted -> RealService: executing request for admin"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}

// TestProxyDeniesUnauthorizedUser verifies that the ProxyService denies access
// to users not in the authorized list.
func TestProxyDeniesUnauthorizedUser(t *testing.T) {
	p := proxy.NewProxyService([]string{"admin"})
	result := p.Execute("guest")

	expected := "ProxyService: access denied for guest"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}

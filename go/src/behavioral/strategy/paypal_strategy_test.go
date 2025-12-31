package strategy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/strategy"
)

// TestPayPalStrategyPay tests the Pay method of PayPalStrategy.
func TestPayPalStrategyPay(t *testing.T) {
	s := strategy.NewPayPalStrategy("user@test.com")
	got := s.Pay(200)
	want := "Paid 200 using PayPal (user@test.com)"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}

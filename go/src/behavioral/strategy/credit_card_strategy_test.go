package strategy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/strategy"
)

// TestCreditCardStrategyPay tests the Pay method of CreditCardStrategy.
func TestCreditCardStrategyPay(t *testing.T) {
	s := strategy.NewCreditCardStrategy("1234")
	got := s.Pay(100)
	want := "Paid 100 using Credit Card ****1234"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}


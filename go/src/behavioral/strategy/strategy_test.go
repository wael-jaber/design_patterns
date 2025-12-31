package strategy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/strategy"
)

// TestStrategyInterfaceAssignment ensures that PayPalStrategy implements
// the PaymentStrategy interface.
func TestStrategyInterfaceAssignment(t *testing.T) {
	var s strategy.PaymentStrategy = strategy.NewPayPalStrategy("a@b.com")
	if s == nil {
		t.Errorf("expected PaymentStrategy to be assignable")
	}
}

package strategy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/strategy"
)

// TestCheckoutRequiresStrategy tests that Checkout method requires a payment
// strategy to be set.
func TestCheckoutRequiresStrategy(t *testing.T) {
	p := strategy.NewPaymentProcessor(nil)

	_, err := p.Checkout(100)
	if err == nil {
		t.Fatalf("expected error when no strategy is set")
	}
}

// TestCheckoutValidatesAmount tests that Checkout method validates the amount.
func TestCheckoutValidatesAmount(t *testing.T) {
	p := strategy.NewPaymentProcessor(strategy.NewCreditCardStrategy("1234"))

	_, err := p.Checkout(0)
	if err == nil {
		t.Fatalf("expected error for non-positive amount")
	}
}

// TestCheckoutWithDifferentStrategies tests the Checkout method with different
// payment strategies.
func TestCheckoutWithDifferentStrategies(t *testing.T) {
	p := strategy.NewPaymentProcessor(strategy.NewCreditCardStrategy("1234"))

	msg, err := p.Checkout(100)
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
	if msg == "" {
		t.Fatalf("expected non-empty message")
	}

	p.SetStrategy(strategy.NewPayPalStrategy("user@test.com"))
	msg2, err := p.Checkout(200)
	if err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
	if msg2 == msg {
		t.Fatalf("expected different output after switching strategy")
	}
}

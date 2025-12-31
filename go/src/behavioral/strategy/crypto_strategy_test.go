package strategy_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/behavioral/strategy"
)

// TestCryptoStrategyPay tests the Pay method of CryptoStrategy.
func TestCryptoStrategyPay(t *testing.T) {
	s := strategy.NewCryptoStrategy("0xABC")
	got := s.Pay(300)
	want := "Paid 300 using Crypto wallet (0xABC)"

	if got != want {
		t.Errorf("expected %q, got %q", want, got)
	}
}

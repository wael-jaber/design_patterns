package strategy

import "fmt"

// PaymentProcessor is the context that uses a PaymentStrategy.
type PaymentProcessor struct {
	strategy PaymentStrategy
}

func NewPaymentProcessor(s PaymentStrategy) *PaymentProcessor {
	return &PaymentProcessor{strategy: s}
}

func (p *PaymentProcessor) SetStrategy(s PaymentStrategy) {
	p.strategy = s
}

func (p *PaymentProcessor) Checkout(amount int) (string, error) {
	if p.strategy == nil {
		return "", fmt.Errorf("no payment strategy set")
	}
	if amount <= 0 {
		return "", fmt.Errorf("amount must be positive")
	}
	return p.strategy.Pay(amount), nil
}


// Example Usage:
//
//  processor := strategy.NewPaymentProcessor(strategy.NewCreditCardStrategy("1234"))
//  msg, _ := processor.Checkout(100)
//  fmt.Println(msg)
//
//  processor.SetStrategy(strategy.NewPayPalStrategy("user@test.com"))
//  msg, _ = processor.Checkout(200)
//  fmt.Println(msg)
//
// Common Mistakes & Pitfalls:
//
// 1. Hardcoding a strategy inside the context.
//    - Fix: Inject strategy through constructor or setter.
//
// 2. Allowing nil strategy and panicking.
//    - Fix: Return an error if no strategy is set (as we do).
//
// 3. Overusing strategies for simple if/else cases.
//    - Fix: Use Strategy only when behaviors must vary independently.
//
// 4. Putting business validation inside strategies.
//    - Fix: Validation belongs in context or higher-level service.


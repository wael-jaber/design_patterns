package strategy

// PaymentStrategy defines the behavior that all strategies must implement.
type PaymentStrategy interface {
	Pay(amount int) string
}

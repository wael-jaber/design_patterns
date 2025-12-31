package strategy

import "fmt"

type PayPalStrategy struct {
	email string
}

func NewPayPalStrategy(email string) *PayPalStrategy {
	return &PayPalStrategy{email: email}
}

func (p *PayPalStrategy) Pay(amount int) string {
	return fmt.Sprintf("Paid %d using PayPal (%s)", amount, p.email)
}

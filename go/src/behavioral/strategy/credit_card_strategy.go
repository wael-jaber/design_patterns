package strategy

import "fmt"

type CreditCardStrategy struct {
	cardLast4 string
}

func NewCreditCardStrategy(last4 string) *CreditCardStrategy {
	return &CreditCardStrategy{cardLast4: last4}
}

func (c *CreditCardStrategy) Pay(amount int) string {
	return fmt.Sprintf("Paid %d using Credit Card ****%s", amount, c.cardLast4)
}

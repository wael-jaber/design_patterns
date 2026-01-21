package strategy

import "fmt"

type CryptoStrategy struct {
	wallet string
}

func NewCryptoStrategy(wallet string) *CryptoStrategy {
	return &CryptoStrategy{wallet: wallet}
}

func (c *CryptoStrategy) Pay(amount int) string {
	return fmt.Sprintf("Paid %d using Crypto wallet (%s)", amount, c.wallet)
}

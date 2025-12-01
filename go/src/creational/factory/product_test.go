package factory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/factory"
)

// TestProductInterface verifies that ProductA implements the Product interface
// and its Use method returns the expected string.
func TestProductInterface(t *testing.T) {
	var p factory.Product = factory.ProductA{}
	if p.Use() != "Using product A" {
		t.Errorf("expected 'Using product A', got '%s'", p.Use())
	}
}

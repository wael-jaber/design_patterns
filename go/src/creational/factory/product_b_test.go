package factory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/factory"
)

// TestProductBUse verifies that the Use method of ProductB returns the 
// expected string.
func TestProductBUse(t *testing.T) {
	p := factory.ProductB{}
	result := p.Use()

	if result != "Using product B" {
		t.Errorf("expected 'Using product B', got '%s'", result)
	}
}

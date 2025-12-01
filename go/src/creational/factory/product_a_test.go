package factory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/factory"
)

// TestProductAUse verifies that the Use method of ProductA returns the 
// expected string.
func TestProductAUse(t *testing.T) {
	p := factory.ProductA{}
	result := p.Use()

	if result != "Using product A" {
		t.Errorf("expected 'Using product A', got '%s'", result)
	}
}

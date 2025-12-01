package abstractfactory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/abstractfactory"
)

// TestModernProductAUse tests the UseA method of ModernProductA.
func TestModernProductAUse(t *testing.T) {
	p := abstractfactory.ModernProductA{}
	if p.UseA() != "Modern Product A in use" {
		t.Errorf("expected Modern Product A in use, got %s", p.UseA())
	}
}

// TestModernProductBUse tests the UseB method of ModernProductB.
func TestVictorianProductAUse(t *testing.T) {
	p := abstractfactory.VictorianProductA{}
	if p.UseA() != "Victorian Product A in use" {
		t.Errorf("expected Victorian Product A in use, got %s", p.UseA())
	}
}

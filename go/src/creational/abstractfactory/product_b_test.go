package abstractfactory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/abstractfactory"
)

// TestModernProductBUse tests the UseB method of ModernProductB.
func TestModernProductBUse(t *testing.T) {
	p := abstractfactory.ModernProductB{}
	if p.UseB() != "Modern Product B in use" {
		t.Errorf("expected Modern Product B in use, got %s", p.UseB())
	}
}

// TestVictorianProductBUse tests the UseB method of VictorianProductB.
func TestVictorianProductBUse(t *testing.T) {
	p := abstractfactory.VictorianProductB{}
	if p.UseB() != "Victorian Product B in use" {
		t.Errorf("expected Victorian Product B in use, got %s", p.UseB())
	}
}

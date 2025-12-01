package abstractfactory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/abstractfactory"
)

// TestFactoriesReturnMatchingFamilies tests that each factory returns products
// from the same family.
func TestFactoriesReturnMatchingFamilies(t *testing.T) {
	var f abstractfactory.Factory

	// Modern family
	f = abstractfactory.ModernFactory{}
	a1 := f.CreateProductA()
	b1 := f.CreateProductB()

	if _, ok := a1.(abstractfactory.ModernProductA); !ok {
		t.Errorf("expected ModernProductA, got %T", a1)
	}
	if _, ok := b1.(abstractfactory.ModernProductB); !ok {
		t.Errorf("expected ModernProductB, got %T", b1)
	}
	
	// Victorian family
	f = abstractfactory.VictorianFactory{}
	a2 := f.CreateProductA()
	b2 := f.CreateProductB()

	if _, ok := a2.(abstractfactory.VictorianProductA); !ok {
		t.Errorf("expected VictorianProductA, got %T", a2)
	}
	if _, ok := b2.(abstractfactory.VictorianProductB); !ok {
		t.Errorf("expected VictorianProductB, got %T", b2)
	}
}

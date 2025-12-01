package abstractfactory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/abstractfactory"
)

// TestModernFactoryCreatesProductA tests that ModernFactory creates
// ModernProductA.
func TestModernFactoryCreatesProductA(t *testing.T) {
	f := abstractfactory.ModernFactory{}
	a := f.CreateProductA()

	if _, ok := a.(abstractfactory.ModernProductA); !ok {
		t.Errorf("expected ModernProductA, got %T", a)
	}

	if a.UseA() != "Modern Product A in use" {
		t.Errorf("unexpected result: %s", a.UseA())
	}
}

// TestModernFactoryCreatesProductB tests that ModernFactory creates
// ModernProductB.
func TestModernFactoryCreatesProductB(t *testing.T) {
	f := abstractfactory.ModernFactory{}
	b := f.CreateProductB()

	if _, ok := b.(abstractfactory.ModernProductB); !ok {
		t.Errorf("expected ModernProductB, got %T", b)
	}

	if b.UseB() != "Modern Product B in use" {
		t.Errorf("unexpected result: %s", b.UseB())
	}
}

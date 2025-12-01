package abstractfactory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/abstractfactory"
)

// TestVictorianFactoryCreatesProductA tests that VictorianFactory creates
// VictorianProductA.
func TestVictorianFactoryCreatesProductA(t *testing.T) {
	f := abstractfactory.VictorianFactory{}
	a := f.CreateProductA()

	if _, ok := a.(abstractfactory.VictorianProductA); !ok {
		t.Errorf("expected VictorianProductA, got %T", a)
	}

	if a.UseA() != "Victorian Product A in use" {
		t.Errorf("unexpected result: %s", a.UseA())
	}
}

// TestVictorianFactoryCreatesProductB tests that VictorianFactory creates
// VictorianProductB.
func TestVictorianFactoryCreatesProductB(t *testing.T) {
	f := abstractfactory.VictorianFactory{}
	b := f.CreateProductB()

	if _, ok := b.(abstractfactory.VictorianProductB); !ok {
		t.Errorf("expected VictorianProductB, got %T", b)
	}

	if b.UseB() != "Victorian Product B in use" {
		t.Errorf("unexpected result: %s", b.UseB())
	}
}

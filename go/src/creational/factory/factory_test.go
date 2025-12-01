package factory_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/factory"
)

// TestCreateProductA verifies that the factory creates ProductA correctly.
func TestCreateProductA(t *testing.T) {
	p, err := factory.CreateProduct(factory.TypeA)

	if err != nil {
		t.Fatalf("expected no error, got %v", err)
	}

	if p.Use() != "Using product A" {
		t.Errorf("expected product A behavior, got '%s'", p.Use())
	}
}

// TestCreateProductB verifies that the factory creates ProductB correctly.
func TestCreateProductB(t *testing.T) {
	p, err := factory.CreateProduct(factory.TypeB)

	if err != nil {
		t.Fatalf("expected no error, got %v", err)
	}

	if p.Use() != "Using product B" {
		t.Errorf("expected product B behavior, got '%s'", p.Use())
	}
}

// TestCreateProductUnknown verifies that the factory returns an error for 
// unknown product types.
func TestCreateProductUnknown(t *testing.T) {
	_, err := factory.CreateProduct("X")

	if err == nil {
		t.Fatalf("expected error, got nil")
	}
}

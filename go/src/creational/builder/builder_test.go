package builder_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/builder"
)

// TestBuilderInterfaceIsSatisfied tests that ComputerBuilder implements the
// Builder interface.
func TestBuilderInterfaceIsSatisfied(t *testing.T) {
	var b builder.Builder = builder.NewComputerBuilder()
	if b == nil {
		t.Errorf("expected non-nil Builder implementation")
	}
}

// TestBuilderFluentAPI tests that the Set methods return the Builder for
// method chaining.
func TestBuilderFluentAPI(t *testing.T) {
	b := builder.NewComputerBuilder()

	result := b.SetCPU("TestCPU").SetRAM(8)
	if result == nil {
		t.Errorf("expected Set methods to return Builder")
	}
}

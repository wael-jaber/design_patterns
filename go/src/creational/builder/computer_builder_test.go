package builder_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/builder"
)

// TestComputerBuilderBuildsComputer tests that the ComputerBuilder builds a
// Computer with the specified attributes.
func TestComputerBuilderBuildsComputer(t *testing.T) {
	b := builder.NewComputerBuilder()

	pc := b.
		SetCPU("Intel i9").
		SetRAM(64).
		SetStorage(4000).
		SetGPU("RTX 4080").
		Build()

	if pc.CPU != "Intel i9" {
		t.Errorf("expected Intel i9, got %s", pc.CPU)
	}
	if pc.RAM != 64 {
		t.Errorf("expected RAM 64, got %d", pc.RAM)
	}
	if pc.Storage != 4000 {
		t.Errorf("expected Storage 4000, got %d", pc.Storage)
	}
	if pc.GPU != "RTX 4080" {
		t.Errorf("expected GPU RTX 4080, got %s", pc.GPU)
	}
}

// TestComputerBuilderPartialBuild tests that the ComputerBuilder can build a
// Computer with only some attributes set.
func TestComputerBuilderPartialBuild(t *testing.T) {
	pc := builder.NewComputerBuilder().
		SetCPU("M1").
		Build()

	if pc.CPU != "M1" {
		t.Errorf("expected M1 CPU, got %s", pc.CPU)
	}
	if pc.RAM != 0 || pc.Storage != 0 || pc.GPU != "N/A" {
		t.Errorf("expected zero-values for unset fields")
	}
}

// TestComputerBuilderDefaultValues tests that the ComputerBuilder builds a
// Computer with default zero-values when no attributes are set.
func TestComputerBuilderDefaultValues(t *testing.T) {
	pc := builder.NewComputerBuilder().Build()

	if pc.CPU != "N/A" || pc.RAM != 0 || pc.Storage != 0 || pc.GPU != "N/A" {
		t.Errorf("expected zero-values for default builder, got %+v", pc)
	}
}

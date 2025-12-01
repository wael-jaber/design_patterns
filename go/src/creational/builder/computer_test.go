package builder_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/builder"
)

// TestComputerStruct tests the Computer struct fields are set correctly.
func TestComputerStruct(t *testing.T) {
	c := builder.Computer{
		CPU:     "Ryzen 9",
		RAM:     32,
		Storage: 2000,
		GPU:     "RTX 4090",
	}

	if c.CPU != "Ryzen 9" {
		t.Errorf("expected Ryzen 9, got %s", c.CPU)
	}

	if c.RAM != 32 {
		t.Errorf("expected RAM 32, got %d", c.RAM)
	}

	if c.Storage != 2000 {
		t.Errorf("expected Storage 2000, got %d", c.Storage)
	}

	if c.GPU != "RTX 4090" {
		t.Errorf("expected GPU RTX 4090, got %s", c.GPU)
	}
}

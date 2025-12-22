package composite_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/composite"
)

// TestFileAttributes verifies that the File struct correctly stores and
// retrieves its name and size.
func TestFileAttributes(t *testing.T) {
	f := composite.NewFile("readme.md", 150)

	if f.Name() != "readme.md" {
		t.Errorf("expected name readme.md, got %s", f.Name())
	}

	if f.Size() != 150 {
		t.Errorf("expected size 150, got %d", f.Size())
	}
}

package prototype_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/prototype"
)

// TestFileClone tests the Clone method of the File struct.
func TestFileClone(t *testing.T) {
	f := &prototype.File{Name: "test.txt", Size: 100}
	clone := f.Clone().(*prototype.File)

	if clone == f {
		t.Errorf("expected different pointer, got same")
	}

	if clone.Name != f.Name || clone.Size != f.Size {
		t.Errorf("expected clone to match fields: %+v vs %+v", clone, f)
	}
}

package prototype_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/prototype"
)

// TestFolderCloneDeepCopy tests that cloning a Folder results in a deep copy.
func TestFolderCloneDeepCopy(t *testing.T) {
	f1 := &prototype.File{Name: "a.txt", Size: 10}
	f2 := &prototype.File{Name: "b.txt", Size: 20}

	folder := &prototype.Folder{
		Name:     "root",
		Children: []prototype.Prototype{f1, f2},
	}

	clone := folder.Clone().(*prototype.Folder)

	if clone == folder {
		t.Errorf("expected deep clone, got same pointer")
	}

	if clone.Name != folder.Name {
		t.Errorf("expected same name, got %s", clone.Name)
	}

	// Children must be different pointers
	for i := range folder.Children {
		if clone.Children[i] == folder.Children[i] {
			t.Errorf("expected deep copy for child %d", i)
		}
	}
}

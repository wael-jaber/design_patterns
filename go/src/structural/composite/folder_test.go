package composite_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/composite"
)

// TestFolderAddAndSize verifies that files can be added to a folder and that
// the Size method correctly computes the total size.
func TestFolderAddAndSize(t *testing.T) {
	file1 := composite.NewFile("a.txt", 100)
	file2 := composite.NewFile("b.txt", 50)

	folder := composite.NewFolder("docs")
	folder.Add(file1)
	folder.Add(file2)

	if folder.Name() != "docs" {
		t.Errorf("expected folder name docs, got %s", folder.Name())
	}

	if folder.Size() != 150 {
		t.Errorf("expected size 150, got %d", folder.Size())
	}
}

// TestFolderNested verifies that folders can contain other folders and files,
// and that the Size method correctly computes the total size.
func TestFolderNested(t *testing.T) {
	root := composite.NewFolder("root")

	f1 := composite.NewFile("a.txt", 20)
	f2 := composite.NewFile("b.txt", 30)

	sub := composite.NewFolder("sub")
	sub.Add(f1)
	sub.Add(f2)

	root.Add(sub)

	if root.Size() != 50 {
		t.Errorf("expected nested size 50, got %d", root.Size())
	}
}


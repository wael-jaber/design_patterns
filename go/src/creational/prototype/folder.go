package prototype

type Folder struct {
	Name     string
	Children []Prototype
}

func (f *Folder) Clone() Prototype {
	cloned := &Folder{
		Name:     f.Name,
		Children: make([]Prototype, len(f.Children)),
	}

	for i, child := range f.Children {
		cloned.Children[i] = child.Clone()
	}

	return cloned
}

// Example Usage:
//
//  file1 := &prototype.File{Name: "file.txt", Size: 100}
//  clone1 := file1.Clone()
//
//  folder := &prototype.Folder{
//      Name: "docs",
//      Children: []prototype.Prototype{file1},
//  }
//  cloneFolder := folder.Clone()
//
// Common Mistakes:
//
// 1. Forgetting deep copy when struct contains slices or maps.
// 2. Returning same object instead of a copy.
// 3. Mixing interfaces and concrete types incorrectly.
// 4. Cloning without pointer dereference, causing shared fields.

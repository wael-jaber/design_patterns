package composite

type Folder struct {
	folderName string
	children   []Node
}

func NewFolder(name string) *Folder {
	return &Folder{folderName: name, children: []Node{}}
}

func (f *Folder) Add(node Node) {
	f.children = append(f.children, node)
}

func (f *Folder) Name() string {
	return f.folderName
}

func (f *Folder) Size() int {
	total := 0
	for _, child := range f.children {
		total += child.Size()
	}
	return total
}


// Example Usage:
//
//  file1 := composite.NewFile("a.txt", 100)
//  file2 := composite.NewFile("b.txt", 200)
//
//  folder := composite.NewFolder("docs")
//  folder.Add(file1)
//  folder.Add(file2)
//
//  fmt.Println(folder.Size()) // 300
//
// Common Mistakes:
//
// 1. Mixing leaf and composite types directly.
//    - Always rely on the Node interface.
//
// 2. Forgetting to deep-iterate children in composite methods.
//
// 3. Allowing public mutation of children slices.
//
// 4. Returning structs instead of interfaces for Folder or File.


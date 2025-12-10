package composite

type File struct {
	filename string
	size     int
}

func NewFile(name string, size int) *File {
	return &File{filename: name, size: size}
}

func (f *File) Name() string {
	return f.filename
}

func (f *File) Size() int {
	return f.size
}

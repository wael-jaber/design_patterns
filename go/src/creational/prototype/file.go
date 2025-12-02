package prototype

type File struct {
	Name string
	Size int
}

func (f *File) Clone() Prototype {
	// shallow copy is enough for primitives
	copy := *f
	return &copy
}

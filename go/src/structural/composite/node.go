package composite

// Node defines the common interface for both files and folders.
type Node interface {
	Name() string
	Size() int
}

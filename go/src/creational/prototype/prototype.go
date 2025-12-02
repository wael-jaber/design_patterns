package prototype

// Prototype defines the cloning interface.
type Prototype interface {
	Clone() Prototype
}

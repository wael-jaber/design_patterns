package factory

// Product defines the behavior that all concrete products must implement.
type Product interface {
	Use() string
}

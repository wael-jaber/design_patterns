package adapter

// Adaptee provides functionality in an incompatible format.
type Adaptee struct{}

func (Adaptee) SpecificRequest() string {
	return "Adaptee: specific behavior"
}


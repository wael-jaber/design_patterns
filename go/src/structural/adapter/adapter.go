package adapter

// Adapter makes Adaptee compatible with Target.
type Adapter struct {
	adaptee Adaptee
}

func NewAdapter(a Adaptee) Target {
	return &Adapter{adaptee: a}
}

func (a *Adapter) Request() string {
	// Translate Target.Request() → Adaptee.SpecificRequest()
	return "Adapter: translated -> " + a.adaptee.SpecificRequest()
}

// Example Usage:
//
//  a := adapter.Adaptee{}
//  adapter := adapter.NewAdapter(a)
//  fmt.Println(adapter.Request()) 
//  // Output: "Adapter: translated -> Adaptee: specific behavior"
//
// Common Mistakes:
//
// 1. Embedding Adaptee instead of wrapping it.
//    - Embedding leaks unwanted methods to the client.
//
// 2. Returning concrete types instead of the Target interface.
//    - Client should depend on Target, not Adapter.
//
// 3. Forcing classical OOP inheritance.
//    - Go uses interfaces + composition, not inheritance.
//
// 4. Using pointer receivers incorrectly.
//    - In Go, Adapter should usually be a pointer receiver.


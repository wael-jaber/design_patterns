package bridge

// Shape is the abstraction that depends on a Renderer.
type Shape interface {
	Draw() string
}

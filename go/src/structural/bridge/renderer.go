package bridge

// Renderer defines the implementation interface.
type Renderer interface {
	RenderShape(name string) string
}

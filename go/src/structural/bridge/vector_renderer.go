package bridge

type VectorRenderer struct{}

func (VectorRenderer) RenderShape(name string) string {
	return "VectorRenderer: rendering " + name
}

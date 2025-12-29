package bridge

type RasterRenderer struct{}

func (RasterRenderer) RenderShape(name string) string {
	return "RasterRenderer: rendering " + name
}


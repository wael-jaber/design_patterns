package bridge

import "fmt"

type Square struct {
	renderer Renderer
	side     int
}

func NewSquare(r Renderer, side int) Shape {
	return &Square{renderer: r, side: side}
}

func (s *Square) Draw() string {
	return fmt.Sprintf("%s (square, side=%d)", s.renderer.RenderShape("square"), s.side)
}

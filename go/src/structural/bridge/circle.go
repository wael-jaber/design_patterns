package bridge

import "fmt"

type Circle struct {
	renderer Renderer
	radius   int
}

func NewCircle(r Renderer, radius int) Shape {
	return &Circle{renderer: r, radius: radius}
}

func (c *Circle) Draw() string {
	return fmt.Sprintf("%s (circle, radius=%d)", c.renderer.RenderShape("circle"), c.radius)
}

// Example Usage:
//
//  r1 := bridge.VectorRenderer{}
//  r2 := bridge.RasterRenderer{}
//
//  c := bridge.NewCircle(r1, 10)
//  s := bridge.NewSquare(r2, 5)
//
//  fmt.Println(c.Draw())
//  fmt.Println(s.Draw())
//
// Common Mistakes:
//
// 1. Hardcoding implementors inside abstractions.
//    - Fix: Inject Renderer into Shape constructors.
//
// 2. Returning concrete types instead of Shape interface.
//    - Fix: Constructors should return Shape.
//
// 3. Adding renderer-specific behavior in Shape.
//    - Fix: Keep rendering logic inside Renderer implementations.
//
// 4. Overengineering when no independent variation is needed.


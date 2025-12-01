package factory

import "fmt"

type ProductType string

const (
	TypeA ProductType = "A"
	TypeB ProductType = "B"
)

func CreateProduct(t ProductType) (Product, error) {
	switch t {
	case TypeA:
		return ProductA{}, nil
	case TypeB:
		return ProductB{}, nil
	default:
		return nil, fmt.Errorf("unknown product type: %s", t)
	}
}


// Example Usage:
//
//  p1, _ := factory.CreateProduct(factory.TypeA)
//  fmt.Println(p1.Use())   // "Using product A"
//
//  p2, _ := factory.CreateProduct(factory.TypeB)
//  fmt.Println(p2.Use())   // "Using product B"
//
//  _, err := factory.CreateProduct("X")
//  fmt.Println(err)        // "unknown product type: X"
//
//
// Common Mistakes & Pitfalls:
//
// 1. Using `if` chains instead of a switch:
//    - This becomes harder to extend when adding new products.
//    - Prefer `switch` for clarity and scalability.
//
// 2. Returning concrete types instead of the interface:
//    - This leaks implementation details.
//    - Always return `Product`, not `ProductA` or `ProductB`.
//
// 3. Trying to force classical OOP inheritance:
//    - Go uses composition + interfaces, not subclassing.
//    - Do NOT try to replicate Java’s class hierarchy.
//
// 4. Using exported struct names unnecessarily:
//    - If the product should not be constructed directly,
//      keep the concrete types unexported.
//
// 5. Adding complex logic inside the factory:
//    - The factory should only decide *which* product to create,
//      not execute business logic.

package abstractfactory

// Factory defines the abstract factory interface.
type Factory interface {
	CreateProductA() ProductA
	CreateProductB() ProductB
}

// Example Usage:
//
//  var f abstractfactory.Factory
//
//  f = abstractfactory.ModernFactory{}
//  a := f.CreateProductA()
//  b := f.CreateProductB()
//  fmt.Println(a.UseA()) // "Modern Product A in use"
//  fmt.Println(b.UseB()) // "Modern Product B in use"
//
//  f = abstractfactory.VictorianFactory{}
//  a2 := f.CreateProductA()
//  b2 := f.CreateProductB()
//  fmt.Println(a2.UseA()) // "Victorian Product A in use"
//  fmt.Println(b2.UseB()) // "Victorian Product B in use"
//
//
// Common Mistakes & Pitfalls:
//
// 1. Mixing product families (e.g., ModernProductA with VictorianProductB).
//    - Fix: Use a consistent factory to create matching families.
//
// 2. Exporting all concrete types accidentally.
//    - Export only what needs to be used outside.
//
// 3. Returning concrete types instead of interfaces.
//    - Factories should return interfaces to shield implementation details.
//
// 4. Adding business logic inside factories.
//    - Factories should only construct objects, not use them.
//
// 5. Trying to replicate Java inheritance.
//    - Go uses interfaces + composition, not subclassing.


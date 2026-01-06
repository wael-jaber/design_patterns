package chainofresponsibility

// Handler defines a chain node.
type Handler interface {
	SetNext(next Handler) Handler
	Handle(req Request) string
}

type baseHandler struct {
	next Handler
}

func (b *baseHandler) SetNext(next Handler) Handler {
	b.next = next
	return next
}

func (b *baseHandler) forward(req Request) string {
	if b.next == nil {
		return "Request not handled: " + req.Message
	}
	return b.next.Handle(req)
}

// Example Usage:
//
//  l1 := chainofresponsibility.NewLevel1Support()
//  l2 := chainofresponsibility.NewLevel2Support()
//  l3 := chainofresponsibility.NewLevel3Support()
//
//  l1.SetNext(l2).SetNext(l3)
//
//  res := l1.Handle(chainofresponsibility.Request{Severity: "high", Message: "Database down"})
//  fmt.Println(res) // Level3 handled: Database down
//
// Common Mistakes & Pitfalls:
//
// 1. Forgetting to set next handler -> chain stops early.
// 2. Calling next without nil check -> panic.
// 3. Making handlers depend on concrete types instead of Handler interface.
// 4. Returning partial results instead of a clear “not handled” response.
// 5. Putting too much business logic inside handlers (keep them focused).

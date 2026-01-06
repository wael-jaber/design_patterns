package chainofresponsibility

type Level2Support struct {
	baseHandler
}

func NewLevel2Support() *Level2Support {
	return &Level2Support{}
}

func (h *Level2Support) Handle(req Request) string {
	if req.Severity == "medium" {
		return "Level2 handled: " + req.Message
	}
	return h.forward(req)
}

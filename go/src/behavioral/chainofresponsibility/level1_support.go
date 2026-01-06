package chainofresponsibility

type Level1Support struct {
	baseHandler
}

func NewLevel1Support() *Level1Support {
	return &Level1Support{}
}

func (h *Level1Support) Handle(req Request) string {
	if req.Severity == "low" {
		return "Level1 handled: " + req.Message
	}
	return h.forward(req)
}

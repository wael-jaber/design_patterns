package chainofresponsibility

type Level3Support struct {
	baseHandler
}

func NewLevel3Support() *Level3Support {
	return &Level3Support{}
}

func (h *Level3Support) Handle(req Request) string {
	if req.Severity == "high" {
		return "Level3 handled: " + req.Message
	}
	return h.forward(req)
}

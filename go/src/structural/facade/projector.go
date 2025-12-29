package facade

type Projector struct {
	on bool
}

func (p *Projector) On() string {
	p.on = true
	return "Projector: ON"
}

func (p *Projector) Off() string {
	p.on = false
	return "Projector: OFF"
}


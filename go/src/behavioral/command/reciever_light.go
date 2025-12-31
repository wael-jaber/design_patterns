package command

type Light struct {
	on bool
}

func NewLight() *Light {
	return &Light{}
}

func (l *Light) TurnOn() string {
	l.on = true
	return "Light: ON"
}

func (l *Light) TurnOff() string {
	l.on = false
	return "Light: OFF"
}

func (l *Light) IsOn() bool {
	return l.on
}

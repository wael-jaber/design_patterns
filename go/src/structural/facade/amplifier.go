package facade

type Amplifier struct {
	on bool
}

func (a *Amplifier) On() string {
	a.on = true
	return "Amplifier: ON"
}

func (a *Amplifier) Off() string {
	a.on = false
	return "Amplifier: OFF"
}


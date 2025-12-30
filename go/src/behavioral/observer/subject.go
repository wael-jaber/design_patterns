package observer

// Subject manages observers and notifies them.
type Subject interface {
	Attach(o Observer)
	Detach(id string)
	Notify()
	SetState(state string)
	GetState() string
}

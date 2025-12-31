package mediator

// Mediator defines communication between colleagues.
type Mediator interface {
	Send(message string, sender Colleague)
	Register(c Colleague)
}

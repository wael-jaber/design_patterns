package mediator

// Colleague communicates only via the Mediator.
type Colleague interface {
	ID() string
	Receive(message string)
	Send(message string)
}

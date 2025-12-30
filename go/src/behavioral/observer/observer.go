package observer

// Observer receives updates from a Subject.
type Observer interface {
	Update(state string)
	ID() string
}

package command

// Command encapsulates an action and supports undo.
type Command interface {
	Execute() string
	Undo() string
}

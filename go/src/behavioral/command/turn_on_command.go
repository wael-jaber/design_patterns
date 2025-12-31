package command

type TurnOnCommand struct {
	light *Light
}

func NewTurnOnCommand(light *Light) *TurnOnCommand {
	return &TurnOnCommand{light: light}
}

func (c *TurnOnCommand) Execute() string {
	return c.light.TurnOn()
}

func (c *TurnOnCommand) Undo() string {
	return c.light.TurnOff()
}

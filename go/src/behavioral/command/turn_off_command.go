package command

type TurnOffCommand struct {
	light *Light
}

func NewTurnOffCommand(light *Light) *TurnOffCommand {
	return &TurnOffCommand{light: light}
}

func (c *TurnOffCommand) Execute() string {
	return c.light.TurnOff()
}

func (c *TurnOffCommand) Undo() string {
	return c.light.TurnOn()
}

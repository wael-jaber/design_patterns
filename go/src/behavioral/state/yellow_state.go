package state

type YellowState struct{}

func (YellowState) Name() string {
	return "YELLOW"
}

func (YellowState) Next(ctx *TrafficLight) {
	ctx.SetState(RedState{})
}

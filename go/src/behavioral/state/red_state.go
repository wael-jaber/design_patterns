package state

type RedState struct{}

func (RedState) Name() string {
	return "RED"
}

func (RedState) Next(ctx *TrafficLight) {
	ctx.SetState(GreenState{})
}

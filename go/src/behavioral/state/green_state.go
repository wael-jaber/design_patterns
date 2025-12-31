package state

type GreenState struct{}

func (GreenState) Name() string {
	return "GREEN"
}

func (GreenState) Next(ctx *TrafficLight) {
	ctx.SetState(YellowState{})
}

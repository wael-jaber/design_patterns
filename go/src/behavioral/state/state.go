package state

// State defines behavior for a concrete state.
type State interface {
	Name() string
	Next(ctx *TrafficLight)
}

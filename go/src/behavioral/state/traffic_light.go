package state

import "fmt"

type TrafficLight struct {
	current State
}

func NewTrafficLight(initial State) (*TrafficLight, error) {
	if initial == nil {
		return nil, fmt.Errorf("initial state cannot be nil")
	}
	return &TrafficLight{current: initial}, nil
}

func (t *TrafficLight) SetState(s State) {
	t.current = s
}

func (t *TrafficLight) StateName() string {
	if t.current == nil {
		return ""
	}
	return t.current.Name()
}

func (t *TrafficLight) Next() {
	if t.current == nil {
		return
	}
	t.current.Next(t)
}

// Example Usage:
//
//  tl, _ := state.NewTrafficLight(state.RedState{})
//  fmt.Println(tl.StateName()) // RED
//  tl.Next()
//  fmt.Println(tl.StateName()) // GREEN
//  tl.Next()
//  fmt.Println(tl.StateName()) // YELLOW
//
// Common Mistakes & Pitfalls:
//
// 1. Putting transition logic inside the context.
//    - Fix: let each State decide how to transition (as we do).
//
// 2. Creating state types that depend on each other via imports.
//    - Fix: keep them in the same package; depend only on State interface.
//
// 3. Using strings/switch statements instead of polymorphism.
//    - Fix: State interface + concrete types.
//
// 4. Forgetting nil safety in context.
//    - Fix: guard against nil current state.

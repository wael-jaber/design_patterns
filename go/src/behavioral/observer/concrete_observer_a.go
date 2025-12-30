package observer

import "sync"

type ConcreteObserverA struct {
	mu       sync.RWMutex
	id       string
	lastSeen string
}

func NewConcreteObserverA(id string) *ConcreteObserverA {
	return &ConcreteObserverA{id: id}
}

func (o *ConcreteObserverA) ID() string {
	return o.id
}

func (o *ConcreteObserverA) Update(state string) {
	o.mu.Lock()
	o.lastSeen = "A received: " + state
	o.mu.Unlock()
}

func (o *ConcreteObserverA) LastSeen() string {
	o.mu.RLock()
	defer o.mu.RUnlock()
	return o.lastSeen
}


package observer

import "sync"

type ConcreteSubject struct {
	mu        sync.RWMutex
	state     string
	observers map[string]Observer
}

func NewConcreteSubject() *ConcreteSubject {
	return &ConcreteSubject{
		observers: make(map[string]Observer),
	}
}

func (s *ConcreteSubject) Attach(o Observer) {
	s.mu.Lock()
	defer s.mu.Unlock()
	s.observers[o.ID()] = o
}

func (s *ConcreteSubject) Detach(id string) {
	s.mu.Lock()
	defer s.mu.Unlock()
	delete(s.observers, id)
}

func (s *ConcreteSubject) Notify() {
	// Copy observers under read lock, then call Update() outside the lock.
	// This avoids deadlocks if observers call back into the subject.
	s.mu.RLock()
	state := s.state
	copied := make([]Observer, 0, len(s.observers))
	for _, o := range s.observers {
		copied = append(copied, o)
	}
	s.mu.RUnlock()

	for _, o := range copied {
		o.Update(state)
	}
}

func (s *ConcreteSubject) SetState(state string) {
	s.mu.Lock()
	s.state = state
	s.mu.Unlock()
	s.Notify()
}

func (s *ConcreteSubject) GetState() string {
	s.mu.RLock()
	defer s.mu.RUnlock()
	return s.state
}

package observer

import "sync"

type ConcreteObserverB struct {
	mu       sync.RWMutex
	id       string
	lastSeen string
}

func NewConcreteObserverB(id string) *ConcreteObserverB {
	return &ConcreteObserverB{id: id}
}

func (o *ConcreteObserverB) ID() string {
	return o.id
}

func (o *ConcreteObserverB) Update(state string) {
	o.mu.Lock()
	o.lastSeen = "B received: " + state
	o.mu.Unlock()
}

func (o *ConcreteObserverB) LastSeen() string {
	o.mu.RLock()
	defer o.mu.RUnlock()
	return o.lastSeen
}

// Example Usage:
//
//  s := observer.NewConcreteSubject()
//
//  a := observer.NewConcreteObserverA("a")
//  b := observer.NewConcreteObserverB("b")
//
//  s.Attach(a)
//  s.Attach(b)
//
//  s.SetState("READY")
//
//  fmt.Println(a.LastSeen()) // "A received: READY"
//  fmt.Println(b.LastSeen()) // "B received: READY"
//
// Common Mistakes & Pitfalls:
//
// 1. Not detaching observers -> memory leaks.
//    - Fix: Ensure Detach is used when observers are no longer needed.
//
// 2. Calling Update while holding the subject lock.
//    - Fix: Copy observers under lock, then notify outside the lock (as we do).
//
// 3. Using slices without stable IDs.
//    - Fix: Use a map keyed by observer ID to support safe detach.
//
// 4. Modifying the observer list during notification without protections.
//    - Fix: Use locks or copy-on-notify approach.
//
// 5. Mixing concerns (observers reading subject state directly).
//    - Fix: Push the state into Update() (push model) as we do here.


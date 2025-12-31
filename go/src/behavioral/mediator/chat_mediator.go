package mediator

import "sync"

// ChatMediator coordinates communication between users.
type ChatMediator struct {
	mu    sync.RWMutex
	users map[string]Colleague
}

func NewChatMediator() *ChatMediator {
	return &ChatMediator{
		users: make(map[string]Colleague),
	}
}

func (m *ChatMediator) Register(c Colleague) {
	m.mu.Lock()
	defer m.mu.Unlock()
	m.users[c.ID()] = c
}

func (m *ChatMediator) Send(message string, sender Colleague) {
	m.mu.RLock()
	defer m.mu.RUnlock()

	for id, user := range m.users {
		if id != sender.ID() {
			user.Receive(message)
		}
	}
}

// Example Usage:
//
//  m := mediator.NewChatMediator()
//
//  alice := mediator.NewUser("alice", m)
//  bob := mediator.NewUser("bob", m)
//
//  alice.Send("Hello Bob")
//
//  fmt.Println(bob.LastSeen()) // Hello Bob
//
// Common Mistakes & Pitfalls:
//
// 1. Allowing colleagues to communicate directly.
//    - Fix: all communication must go through the Mediator.
//
// 2. Putting business logic inside colleagues.
//    - Fix: coordination logic belongs in the Mediator.
//
// 3. Forgetting to register colleagues.
//    - Fix: register in constructor (as done here).
//
// 4. Mediator growing too large (God object).
//    - Fix: split mediators by responsibility if needed.
//
// 5. Missing synchronization when mediator is shared.
//    - Fix: protect shared state with mutex (as done here).

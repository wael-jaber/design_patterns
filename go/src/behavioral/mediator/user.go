package mediator

import "sync"

type User struct {
	id       string
	mediator Mediator

	mu       sync.RWMutex
	lastSeen string
}

func NewUser(id string, m Mediator) *User {
	u := &User{id: id, mediator: m}
	m.Register(u)
	return u
}

func (u *User) ID() string {
	return u.id
}

func (u *User) Send(message string) {
	u.mediator.Send(message, u)
}

func (u *User) Receive(message string) {
	u.mu.Lock()
	u.lastSeen = message
	u.mu.Unlock()
}

func (u *User) LastSeen() string {
	u.mu.RLock()
	defer u.mu.RUnlock()
	return u.lastSeen
}

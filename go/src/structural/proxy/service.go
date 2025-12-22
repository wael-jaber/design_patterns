package proxy

// Service defines the behavior exposed to the client.
type Service interface {
	Execute(user string) string
}

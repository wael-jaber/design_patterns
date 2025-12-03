package adapter

// Target defines the expected interface used by the client.
type Target interface {
	Request() string
}


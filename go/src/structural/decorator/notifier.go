package decorator

// Notifier defines the method to send notifications.
type Notifier interface {
	Send(message string) string
}

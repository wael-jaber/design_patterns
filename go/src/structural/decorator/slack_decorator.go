package decorator

// SlackDecorator adds Slack notifications.
type SlackDecorator struct {
	notifier Notifier
	channel  string
}

func NewSlackDecorator(n Notifier, channel string) *SlackDecorator {
	return &SlackDecorator{
		notifier: n,
		channel:  channel,
	}
}

func (s *SlackDecorator) Send(message string) string {
	base := s.notifier.Send(message)
	return base + " | Slack #" + s.channel + ": " + message
}

// Example Usage:
//
//  base := decorator.NewEmailNotifier("user@example.com")
//  sms := decorator.NewSMSDecorator(base, "+123456")
//  slack := decorator.NewSlackDecorator(sms, "alerts")
//
//  result := slack.Send("System down!")
//  // Email to user@example.com: System down!
//  // | SMS to +123456: System down!
//  // | Slack #alerts: System down!
//
// Common Mistakes:
//
// 1. Forgetting to store and wrap the previous notifier.
// 2. Returning concrete types instead of Notifier interface.
// 3. Implementing behavior in the wrong order.
// 4. Treating decorators like inheritance (Go does composition).
// 5. Creating decorators that don’t implement the Notifier interface.


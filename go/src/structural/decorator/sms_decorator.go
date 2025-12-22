package decorator

// SMSDecorator adds SMS functionality on top of another Notifier.
type SMSDecorator struct {
	notifier Notifier
	phone    string
}

func NewSMSDecorator(n Notifier, phone string) *SMSDecorator {
	return &SMSDecorator{
		notifier: n,
		phone:    phone,
	}
}

func (s *SMSDecorator) Send(message string) string {
	base := s.notifier.Send(message)
	return base + " | SMS to " + s.phone + ": " + message
}

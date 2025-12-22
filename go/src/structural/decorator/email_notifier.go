package decorator

type EmailNotifier struct {
	email string
}

func NewEmailNotifier(email string) *EmailNotifier {
	return &EmailNotifier{email: email}
}

func (e *EmailNotifier) Send(message string) string {
	return "Email to " + e.email + ": " + message
}

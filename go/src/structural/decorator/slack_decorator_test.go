package decorator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/decorator"
)

// TestSlackDecorator verifies that the SlackDecorator correctly decorates
// the Send method of the wrapped notifiers.
func TestSlackDecorator(t *testing.T) {
	base := decorator.NewEmailNotifier("user@test.com")
	sms := decorator.NewSMSDecorator(base, "+111")
	slack := decorator.NewSlackDecorator(sms, "alerts")

	result := slack.Send("Hello")

	expected := "Email to user@test.com: Hello | SMS to +111: Hello | Slack #alerts: Hello"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}


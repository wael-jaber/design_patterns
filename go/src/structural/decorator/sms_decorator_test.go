package decorator_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/structural/decorator"
)

// TestSMSDecorator verifies that the SMSDecorator correctly adds SMS
// notification functionality to the base notifier.
func TestSMSDecorator(t *testing.T) {
	base := decorator.NewEmailNotifier("user@test.com")
	sms := decorator.NewSMSDecorator(base, "+111")

	result := sms.Send("Hello")

	expected := "Email to user@test.com: Hello | SMS to +111: Hello"
	if result != expected {
		t.Errorf("expected %q, got %q", expected, result)
	}
}


package singleton_test

import (
	"testing"

	"github.com/wael-jaber/design_patterns/go/src/creational/singleton"
)

// TestSingletonReturnsSameInstance verifies that multiple calls to GetInstance
// return the same instance.
func TestSingletonReturnsSameInstance(t *testing.T) {
	s1 := singleton.GetInstance()
	s2 := singleton.GetInstance()

	if s1 != s2 {
		t.Errorf("expected both instances to be the same, got different pointers")
	}
}

// TestSingletonInitialValue checks that the initial value of the singleton is
// as expected.
func TestSingletonInitialValue(t *testing.T) {
	s := singleton.GetInstance()

	if s.Value != 42 {
		t.Errorf("expected initial value 42, got %d", s.Value)
	}
}

// TestSingletonModificationAffectsSameInstance ensures that modifying one
// instance affects the other, confirming they are the same instance.
func TestSingletonModificationAffectsSameInstance(t *testing.T) {
	s1 := singleton.GetInstance()
	s2 := singleton.GetInstance()

	s1.Value = 100

	if s2.Value != 100 {
		t.Errorf("modifying first instance should affect second")
	}
}

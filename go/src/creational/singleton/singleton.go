package singleton

import (
	"sync"
)

type singleton struct {
	Value int
}

var instance *singleton
var once sync.Once

// GetInstance returns the same singleton instance every time.
func GetInstance() *singleton {
	once.Do(func() {
		instance = &singleton{
			Value: 42,
		}
	})
	return instance
}

// Example Usage:
//
// s1 := singleton.GetInstance()
// s2 := singleton.GetInstance()
//
// fmt.Println(s1 == s2) // true
//
// Common Mistakes to Avoid:
//
// 1. Trying to manually instantiate the singleton:
//    s := &singleton{}
//    -> This is wrong because the type is unexported.
//
// 2. Using sync.Mutex instead of sync.Once:
//    -> sync.Once is the idiomatic Go way.
//
// 3. Creating the singleton eagerly instead of lazily.
//    -> Lazy initialization is recommended in Go.
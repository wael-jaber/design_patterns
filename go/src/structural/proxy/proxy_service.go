package proxy

import "fmt"

// ProxyService wraps RealService and adds authorization + logging.
type ProxyService struct {
	realService RealService
	allowedUsers map[string]bool
}

func NewProxyService(allowed []string) *ProxyService {
	allowedMap := make(map[string]bool)
	for _, u := range allowed {
		allowedMap[u] = true
	}
	return &ProxyService{
		realService:  RealService{},
		allowedUsers: allowedMap,
	}
}

func (p *ProxyService) Execute(user string) string {
	if !p.allowedUsers[user] {
		return fmt.Sprintf("ProxyService: access denied for %s", user)
	}

	return "ProxyService: access granted -> " + p.realService.Execute(user)
}


// Example Usage:
//
//  proxy := proxy.NewProxyService([]string{"admin"})
//
//  fmt.Println(proxy.Execute("admin"))
//  // ProxyService: access granted -> RealService: executing request for admin
//
//  fmt.Println(proxy.Execute("guest"))
//  // ProxyService: access denied for guest
//
// Common Mistakes:
//
// 1. Making the proxy return the RealService instead of implementing Service.
// 2. Forgetting that Proxy must *implement* the same interface.
// 3. Mixing business logic into the proxy (keep proxy focused on access/logging).
// 4. Forgetting to wrap RealService internally.
// 5. Returning concrete types instead of the Service interface.

package proxy

type RealService struct{}

func (RealService) Execute(user string) string {
	return "RealService: executing request for " + user
}

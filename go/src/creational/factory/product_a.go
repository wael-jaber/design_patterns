package factory

type ProductA struct{}

func (ProductA) Use() string {
	return "Using product A"
}

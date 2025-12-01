package factory

type ProductB struct{}

func (ProductB) Use() string {
	return "Using product B"
}

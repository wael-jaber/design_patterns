package abstractfactory

// ModernFactory creates modern-style products.
type ModernFactory struct{}

func (ModernFactory) CreateProductA() ProductA {
	return ModernProductA{}
}

func (ModernFactory) CreateProductB() ProductB {
	return ModernProductB{}
}

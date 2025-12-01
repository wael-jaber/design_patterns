package abstractfactory

// VictorianFactory creates victorian-style products.
type VictorianFactory struct{}

func (VictorianFactory) CreateProductA() ProductA {
	return VictorianProductA{}
}

func (VictorianFactory) CreateProductB() ProductB {
	return VictorianProductB{}
}

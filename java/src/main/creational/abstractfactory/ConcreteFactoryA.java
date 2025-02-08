package creational.abstractfactory;

public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public Product createProduct(ProductType productType) {
        if (productType == ProductType.A) {
            return new ConcreteProductA();
        } else {
            throw new IllegalArgumentException("Factory A cannot create Product B");
        }
    }
}

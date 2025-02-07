package creational.abstractfactory;

public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public Product createProduct(ProductType productType) {
        if (productType == ProductType.B) {
            return new ConcreteProductB();
        } else {
            throw new IllegalArgumentException("Factory B cannot create Product A");
        }
    }
}

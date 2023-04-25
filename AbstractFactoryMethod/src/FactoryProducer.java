import abstractt.AbstractFactory;
import factory.DesktopFactory;
import factory.LaptopFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isLaptop) {
        if (isLaptop) {
            return new LaptopFactory();
        } else {
            return new DesktopFactory();
        }
    }
}

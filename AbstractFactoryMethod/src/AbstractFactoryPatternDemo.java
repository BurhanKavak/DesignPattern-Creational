import abstractt.AbstractFactory;
import abstractt.Computer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Laptop olduğunu yalanladık
        AbstractFactory desktopFactory = FactoryProducer.getFactory(false);

        // Laptop olarak yalanlamıştık bu yüzden masaüstü gelecek bunun pahalı olanını çağırıyoruz
        Computer computer1 = desktopFactory.getComputer("PAHALI");

        // Çıktı olarak Pahalı masaüstü olarak etiketlenmiş MSI Masaüstü göreceğiz
        computer1.draw();

        // Çıktı olarak Ucuz masaüstü olarak etiketlenmiş Samsung Masaüstü göreceğiz
        Computer computer2 = desktopFactory.getComputer("UCUZ");

        // Aynı şekilde yazdırıyoruz
        computer2.draw();


        // Bunu true seçmemiz laptop olduğu anlamına gelmektedir.
        AbstractFactory laptopFactory = FactoryProducer.getFactory(true);

        // Pahalı laptop olarak etiketlenmiş olanı getirir yani Monster Laptop
        Computer computer3 = laptopFactory.getComputer("PAHALI");

        computer3.draw();

        // Ucuz laptop olarak etiketlenmiş olanı getirir yani Casper Laptop
        Computer computer4 = laptopFactory.getComputer("UCUZ");

        computer4.draw();




    }
}

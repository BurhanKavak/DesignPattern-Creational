package factory;

import abstractt.AbstractFactory;
import abstractt.Computer;
import impl.CasperLaptop;
import impl.MonsterLaptop;

public class LaptopFactory extends AbstractFactory {
    @Override
    public Computer getComputer(String computerType) {
        if (computerType.equalsIgnoreCase("PAHALI")) {
            return new MonsterLaptop();

        } else if (computerType.equalsIgnoreCase("UCUZ")){
            return new CasperLaptop();
        }
        return null;
    }
}
